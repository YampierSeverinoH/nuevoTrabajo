-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-06-2021 a las 07:22:14
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.2.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `negocioyameli`
--
CREATE DATABASE IF NOT EXISTS `negocioyameli` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `negocioyameli`;

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_BuscarAlmacen` (IN `Ridtelefono` INT)  BEGIN
	SELECT * FROM almacen a where a.idAlmacen=Ridtelefono;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_buscarCliente` (IN `idPersona` INT(11))  BEGIN
select * from cliente AS C
where C.idPersona =idPersona;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_buscarProductoID` (`id` INT)  BEGIN
select * from producto p where p.idProducto=id
limit 1;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_buscarSocio` (`dniBuscar` VARCHAR(9))  BEGIN
select s.idSocio,pp.razonSocial, pp.ruc, concat(p.nombre,', ' ,p.apellidos) as nombre, d.nDocumento, dir.descripcionD
from socio s inner join persona p on p.idPersona=s.idRepresentante 
inner join prestatario pp on pp.idPrestatario=s.idPrestatario
inner join documento d on d.idPersona=p.idPersona
inner join direccion dir on dir.idPersona=p.idPersona
where dir.estado=0 and d.EstadoD=0 and s.estado=0 and d.nDocumento like concat(dniBuscar,'%%')
ORDER BY  s.idSocio
LIMIT 1;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_buscarTelefono` (IN `numero` VARCHAR(9))  BEGIN
	SELECT * FROM telefono t where t.numero=numero;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_CbusacarTrabajador` (`dniBuscar` VARCHAR(9))  BEGIN
select t.idTrabajador , p.nombre,p.apellidos , d.nDocumento from trabajador t 
inner join persona p on t.idPersona=p.idPersona
inner join documento d on d.idPersona=p.idPersona
where d.EstadoD=0 and d.nDocumento like concat(dniBuscar,'%%')
ORDER BY  t.idTrabajador
LIMIT 1; 
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_CbuscarSocio` (`dniBuscar` VARCHAR(9))  BEGIN
select s.idSocio,pp.razonSocial, pp.ruc, concat(p.nombre,', ' ,p.apellidos) as nombre, d.nDocumento, dir.descripcionD
from socio s inner join persona p on p.idPersona=s.idRepresentante 
inner join prestatario pp on pp.idPrestatario=s.idPrestatario
inner join documento d on d.idPersona=p.idPersona
inner join direccion dir on dir.idPersona=p.idPersona
where dir.estado=0 and d.EstadoD=0 and s.estado=0 and d.nDocumento like concat(dniBuscar,'%%')
ORDER BY  s.idSocio
LIMIT 1;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_EliminarAlmacen` (IN `Ridalmacen` INT)  BEGIN
	DELETE FROM almacen WHERE almacen.idAlmacen = Ridalmacen;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ListarAlmacen` ()  BEGIN
	SELECT * FROM almacen;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ListarProductosVenta` ()  BEGIN
select p.idProducto ,p.nombre, p.descripcion,p.precio,p.stock, m.descripcionM ,ps.descPres 
from producto p inner join marca m on p.idMarca=m.idMarca
inner join presentacion ps on p.idPresentacion=ps.idPresentacion
limit 10
;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ListarSucursal` ()  BEGIN
	SELECT * FROM sucursal;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ListarTrabajador` ()  BEGIN
	SELECT * FROM trabajador;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ModificarAlmacen` (IN `RidAlmacen` INT, IN `Rdescripcion` VARCHAR(20), IN `Rcodigo` VARCHAR(20), IN `Rtelefono` CHAR(9), IN `Restado` BIT, IN `RdesEstado` VARCHAR(20), IN `Rtrabajador` INT, IN `Rsucursal` INT)  BEGIN
	UPDATE almacen
    SET Descripcion=Rdescripcion, 
    codigo=Rcodigo, 
    telefono=Rtelefono, 
    estado=Restado, 
    decEst=RdesEstado, 
    idTrabajador=Rtrabajador, 
    idSucursal=Rsucursal
    WHERE idAlmacen=RidAlmacen;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarTelefono` (IN `eidtelefono` INT, IN `enumero` VARCHAR(9), IN `eprincipal` BIT, IN `eestado` BIT, IN `eidpersona` INT)  BEGIN
	UPDATE telefono as t
    SET numero=enumero,Principal=eprincipal,estado=eestado, idPersona=eidpersona
    WHERE idTelefono=eidtelefono;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_RegistrarAlmacen` (IN `Rdescripcion` VARCHAR(20), IN `Rcodigo` VARCHAR(20), IN `Rtelefono` CHAR(9), IN `Restado` BIT, IN `RdesEstado` VARCHAR(20), IN `Rtrabajador` INT, IN `Rsucursal` INT)  BEGIN
	INSERT INTO almacen (idAlmacen, Descripcion, codigo, telefono, estado, decEst, idTrabajador, idSucursal) 
    VALUES (NULL, Rdescripcion,Rcodigo, Rtelefono, Restado,RdesEstado, Rtrabajador, Rsucursal);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registrarCliente` (IN `idPrestatario` INT(11), IN `idPersona` INT(11), IN `estado` BIT(1), IN `fecha` DATE)  BEGIN
INSERT INTO cliente (idPrestatario, idPersona, estado, fecha)
VALUES (idPrestatario, idPersona, estado, fecha);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registrarTelefono` (IN `numero` VARCHAR(9), IN `principal` BIT, IN `estado` BIT, IN `idpersona` INT)  BEGIN
	insert into telefono (numero,Principal,estado,idPersona)
    values(numero,principal,estado, idpersona);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registrarTrabajador` (IN `sueldo` FLOAT, IN `idPersona` INT(11), IN `idSucursal` INT(11))  BEGIN
INSERT INTO trabajador (idTrabajador, sueldo, idPersona, idSucursal)
VALUES (null , sueldo, idPersona, idSucursal);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ValidacionUsuario` (`contra` VARCHAR(20), `usuario` VARCHAR(20))  BEGIN
	SELECT u.descripcion, concat(p.nombre,' ',p.apellidos) as Persona, u.idUsuario
    FROM usuario u inner join persona p 
    on u.idPersona=p.idPersona 
    where u.descripcion=usuario and u.pass=contra;
END$$

DELIMITER ;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
