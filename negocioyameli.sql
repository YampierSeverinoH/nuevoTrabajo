-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-06-2021 a las 06:04:04
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

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ListaEstante` ()  BEGIN
	SELECT * FROM estante;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ListaLinia` ()  BEGIN
	SELECT * FROM linea;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ListaMarca` ()  BEGIN
	SELECT * FROM marca;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ListaPresentacion` ()  BEGIN
	SELECT * FROM presentacion;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ListaProductos` ()  BEGIN
	SELECT * FROM producto;
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

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ListaUnidad` ()  BEGIN
	SELECT * FROM unimedida;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ListaUsuario` ()  BEGIN
	SELECT * FROM usuario;
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

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registrarCompra` (IN `REGfecha` DATETIME, IN `REGtotalC` FLOAT, IN `REGestado` BIT, IN `REGidSocio` INT, IN `REGidTrabajador` INT)  BEGIN
INSERT INTO compra(idCompra,fecha,totalC,estado,idSocio,idTrabajador) 
VALUES(null,REGfecha ,REGtotalC ,REGestado ,REGidSocio ,REGidTrabajador );
    SELECT @@IDENTITY AS 'Identity';
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registrarDetalleCompra` (IN `REGdescuento` FLOAT, IN `REGprecio` FLOAT, IN `REGcantidad` INT, IN `REGsubtotal` FLOAT, IN `REGidCompra` INT, IN `REGidProducto` INT)  BEGIN
INSERT INTO compra(idDetCompra,descuento,precio,cantidad,subtotal,idCompra,idProducto) 
VALUES(null,REGdescuento, REGprecio,REGcantidad ,REGsubtotal , REGidCompra,REGidProducto);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registrarProducto` (IN `nombre` VARCHAR(40), IN `descripcion` VARCHAR(200), IN `precio` FLOAT, IN `stock` INT(11), IN `estado` INT(11), IN `decEst` VARCHAR(20), IN `imgen` VARCHAR(100), IN `idLinea` INT(11), IN `idMarca` INT(11), IN `idPresentacion` INT(11), IN `idEstante` INT(11), IN `idUniMedidas` INT(11))  BEGIN
INSERT INTO producto (idProducto, nombre, descripcion, precio, stock, estado, decEst, 
imgen, idLinea, idMarca, idPresentacion, idEstante, idUniMedidas )
VALUES (null, nombre, descripcion, precio, stock, estado, decEst, 
imgen, idLinea, idMarca, idPresentacion, idEstante, idUniMedidas );
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registrarTelefono` (IN `numero` VARCHAR(9), IN `principal` BIT, IN `estado` BIT, IN `idpersona` INT)  BEGIN
	insert into telefono (numero,Principal,estado,idPersona)
    values(numero,principal,estado, idpersona);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registrarTrabajador` (IN `sueldo` FLOAT, IN `idPersona` INT(11), IN `idSucursal` INT(11))  BEGIN
INSERT INTO trabajador (idTrabajador, sueldo, idPersona, idSucursal)
VALUES (null , sueldo, idPersona, idSucursal);
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_registrarUsuario` (IN `descripcion` VARCHAR(20), IN `pass` VARCHAR(20), IN `estado` INT(11), IN `decEst` VARCHAR(20), IN `creacion` DATE, IN `baja` DATE, IN `idPersona` INT(11), IN `imagen` VARCHAR(200))  BEGIN
INSERT INTO usuario (idUsuario, descripcion, pass, estado, decEst, creacion, baja, 
idPersona, imagen)
VALUES (null, descripcion, pass, estado, decEst, creacion, baja, 
idPersona, imagen );
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_ValidacionUsuario` (`contra` VARCHAR(20), `usuario` VARCHAR(20))  BEGIN
	SELECT u.descripcion, concat(p.nombre,' ',p.apellidos) as Persona, u.idUsuario
    FROM usuario u inner join persona p 
    on u.idPersona=p.idPersona 
    where u.descripcion=usuario and u.pass=contra;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acceso`
--

CREATE TABLE `acceso` (
  `idAcceso` int(11) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  `estado` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `almacen`
--

CREATE TABLE `almacen` (
  `idAlmacen` int(11) NOT NULL,
  `Descripcion` varchar(20) NOT NULL,
  `codigo` varchar(15) NOT NULL,
  `telefono` varchar(9) DEFAULT NULL,
  `estado` bit(1) NOT NULL,
  `decEst` varchar(20) DEFAULT NULL,
  `idTrabajador` int(11) NOT NULL,
  `idSucursal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `almacen`
--

INSERT INTO `almacen` (`idAlmacen`, `Descripcion`, `codigo`, `telefono`, `estado`, `decEst`, `idTrabajador`, `idSucursal`) VALUES
(1, 'almacén de pinturas', 'PINT-CIX', '152365', b'0', 'sin problemas', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `areat`
--

CREATE TABLE `areat` (
  `idArea` int(11) NOT NULL,
  `estadoA` char(1) NOT NULL,
  `descArea` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `areat`
--

INSERT INTO `areat` (`idArea`, `estadoA`, `descArea`) VALUES
(1, '0', 'Ventas'),
(2, '0', 'Almacen'),
(3, '0', 'Aseo'),
(4, '0', 'Caja'),
(5, '0', 'Administración ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `areatipotrabajador`
--

CREATE TABLE `areatipotrabajador` (
  `idAreaTipTrab` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `estado` char(1) NOT NULL,
  `idArea` int(11) NOT NULL,
  `idTipTrab` int(11) NOT NULL,
  `idTrabajador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `areatipotrabajador`
--

INSERT INTO `areatipotrabajador` (`idAreaTipTrab`, `fecha`, `estado`, `idArea`, `idTipTrab`, `idTrabajador`) VALUES
(3, '2021-06-03', '0', 1, 1, 1),
(4, '2021-06-03', '0', 2, 4, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `idPrestatario` int(11) DEFAULT NULL,
  `idPersona` int(11) NOT NULL,
  `estado` bit(1) NOT NULL,
  `fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idCliente`, `idPrestatario`, `idPersona`, `estado`, `fecha`) VALUES
(1, 2, 1, b'0', '2021-06-03'),
(5, 1, 1, b'1', '2021-06-03'),
(6, 2, 3, b'1', '2021-06-03'),
(7, 1, 2, b'0', '2021-06-03'),
(8, 1, 1, b'0', '2021-06-03'),
(9, 1, 1, b'0', '2021-06-03'),
(10, 1, 1, b'1', '2021-01-01'),
(11, 1, 3, b'1', '2021-01-02'),
(12, 2, 3, b'1', '2020-02-02'),
(13, 2, 2, b'0', '2020-05-05'),
(14, 2, 3, b'1', '2018-05-05'),
(15, 2, 2, b'0', '2012-05-05');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `idCompra` int(11) NOT NULL,
  `fecha` datetime NOT NULL,
  `totalC` float NOT NULL,
  `estado` char(1) NOT NULL,
  `idSocio` int(11) NOT NULL,
  `idTrabajador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`idCompra`, `fecha`, `totalC`, `estado`, `idSocio`, `idTrabajador`) VALUES
(1, '2021-06-08 23:57:55', 30, 'a', 1, 1),
(2, '2021-06-08 00:00:00', 30, 'a', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecompra`
--

CREATE TABLE `detallecompra` (
  `idDetCompra` int(11) NOT NULL,
  `descuento` float NOT NULL,
  `precio` float NOT NULL,
  `cantidad` int(11) NOT NULL,
  `subtotal` float NOT NULL,
  `idCompra` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalleventa`
--

CREATE TABLE `detalleventa` (
  `idDetVenta` int(11) NOT NULL,
  `precio` float NOT NULL,
  `cantidad` int(11) NOT NULL,
  `subtotal` float NOT NULL,
  `idVenta` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `direccion`
--

CREATE TABLE `direccion` (
  `idDireccion` int(11) NOT NULL,
  `descripcionD` varchar(25) NOT NULL,
  `estado` bit(1) NOT NULL,
  `Principal` bit(1) NOT NULL,
  `idPersona` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `direccion`
--

INSERT INTO `direccion` (`idDireccion`, `descripcionD`, `estado`, `Principal`, `idPersona`) VALUES
(1, 'jr. bolivar 553', b'0', b'0', 1),
(2, 'calle chiclayo 460', b'0', b'0', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `documento`
--

CREATE TABLE `documento` (
  `idDocumento` int(11) NOT NULL,
  `nDocumento` varchar(15) NOT NULL,
  `Primario` bit(1) NOT NULL,
  `EstadoD` bit(1) NOT NULL,
  `idTipoDoc` int(11) NOT NULL,
  `idPersona` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `documento`
--

INSERT INTO `documento` (`idDocumento`, `nDocumento`, `Primario`, `EstadoD`, `idTipoDoc`, `idPersona`) VALUES
(1, '74604279', b'0', b'0', 1, 1),
(2, '85963225', b'0', b'0', 1, 3),
(3, '85632144', b'0', b'0', 1, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `email`
--

CREATE TABLE `email` (
  `idEmail` int(11) NOT NULL,
  `descripcionE` varchar(20) NOT NULL,
  `Principal` bit(1) NOT NULL,
  `estadoE` bit(1) NOT NULL,
  `idPersona` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `email`
--

INSERT INTO `email` (`idEmail`, `descripcionE`, `Principal`, `estadoE`, `idPersona`) VALUES
(1, 'yamSev@gmail.com', b'0', b'0', 1),
(2, 'Roberto@gmail.com', b'0', b'0', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estante`
--

CREATE TABLE `estante` (
  `idEstante` int(11) NOT NULL,
  `codigo` varchar(15) NOT NULL,
  `estado` bit(1) NOT NULL,
  `decEst` varchar(20) DEFAULT NULL,
  `idAlmacen` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `estante`
--

INSERT INTO `estante` (`idEstante`, `codigo`, `estado`, `decEst`, `idAlmacen`) VALUES
(1, 'A001-1PISO', b'0', 'sin problemas', 1),
(2, 'A002-1PISO', b'0', 'sin problemas', 1),
(3, 'A003-1PISO', b'0', 'sin problemas', 1),
(4, 'A004-1PISO', b'0', 'sin problemas', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `linea`
--

CREATE TABLE `linea` (
  `idLinea` int(11) NOT NULL,
  `descriocionL` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `linea`
--

INSERT INTO `linea` (`idLinea`, `descriocionL`) VALUES
(1, 'Lápices '),
(2, 'Plumones ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marca`
--

CREATE TABLE `marca` (
  `idMarca` int(11) NOT NULL,
  `descripcionM` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `marca`
--

INSERT INTO `marca` (`idMarca`, `descripcionM`) VALUES
(1, 'FABER CASTELL'),
(2, 'LAYCONSA'),
(3, 'Vinifan'),
(4, 'ARTESCO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `idPersona` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `sexo` char(1) NOT NULL,
  `fechaNacimiento` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`idPersona`, `nombre`, `apellidos`, `sexo`, `fechaNacimiento`) VALUES
(1, 'Yampier', 'Severino Hernandez', 'M', '2021-06-02'),
(2, 'Roberto', 'Severino Cruz', 'M', '2021-06-01'),
(3, 'Roberto', 'Severino Cruz', 'M', '1999-02-15');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `presentacion`
--

CREATE TABLE `presentacion` (
  `idPresentacion` int(11) NOT NULL,
  `descPres` char(25) NOT NULL,
  `cant` int(11) DEFAULT NULL CHECK (`cant` > 0)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `presentacion`
--

INSERT INTO `presentacion` (`idPresentacion`, `descPres`, `cant`) VALUES
(1, 'caja', 24),
(2, 'caja', 12),
(3, 'caja', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestatario`
--

CREATE TABLE `prestatario` (
  `idPrestatario` int(11) NOT NULL,
  `razonSocial` varchar(15) NOT NULL,
  `DescDir` varchar(50) NOT NULL,
  `ruc` varchar(11) NOT NULL,
  `estadoPs` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `prestatario`
--

INSERT INTO `prestatario` (`idPrestatario`, `razonSocial`, `DescDir`, `ruc`, `estadoPs`) VALUES
(1, 'Oferton', 'Venta de artículos de oficina por mayor', '11252125152', b'1'),
(2, 'Vitery', 'Venta de artículos de oficina por mayor', '52369856235', b'1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `precio` float NOT NULL,
  `stock` int(11) NOT NULL,
  `estado` bit(1) NOT NULL,
  `decEst` varchar(20) DEFAULT NULL,
  `imgen` char(100) NOT NULL,
  `idLinea` int(11) NOT NULL,
  `idMarca` int(11) NOT NULL,
  `idPresentacion` int(11) NOT NULL,
  `idEstante` int(11) NOT NULL,
  `idUniMedidas` int(11) NOT NULL,
  `descuento` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombre`, `descripcion`, `precio`, `stock`, `estado`, `decEst`, `imgen`, `idLinea`, `idMarca`, `idPresentacion`, `idEstante`, `idUniMedidas`, `descuento`) VALUES
(1, 'Colores x12', 'Lápices de grafito de 12 colores diferentes, incluye un tajador, borrador y dos lápices de grafito negro.', 6.5, 288, b'0', 'sd', '', 1, 1, 1, 1, 2, 0),
(2, 'Colores x12', 'Lápices de grafito de 12 colores diferentes', 6.5, 288, b'0', 'sd', '', 1, 4, 1, 1, 2, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `idRol` int(11) NOT NULL,
  `descripcion` varchar(50) NOT NULL,
  `estado` bit(1) NOT NULL,
  `decEst` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rolacceso`
--

CREATE TABLE `rolacceso` (
  `idRolAcceso` int(11) NOT NULL,
  `estado` bit(1) NOT NULL,
  `idRol` int(11) NOT NULL,
  `idAcceso` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roluser`
--

CREATE TABLE `roluser` (
  `idRolUser` int(11) NOT NULL,
  `estado` bit(1) NOT NULL,
  `decEst` varchar(20) DEFAULT NULL,
  `idRol` int(11) NOT NULL,
  `inicio` date NOT NULL,
  `baja` date DEFAULT NULL,
  `idUsuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `socio`
--

CREATE TABLE `socio` (
  `idSocio` int(11) NOT NULL,
  `idPrestatario` int(11) NOT NULL,
  `idRepresentante` int(11) NOT NULL,
  `estado` bit(1) NOT NULL,
  `fecha` date NOT NULL,
  `baja` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `socio`
--

INSERT INTO `socio` (`idSocio`, `idPrestatario`, `idRepresentante`, `estado`, `fecha`, `baja`) VALUES
(1, 1, 2, b'0', '2021-06-03', NULL),
(2, 2, 1, b'0', '2021-06-02', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sucursal`
--

CREATE TABLE `sucursal` (
  `idSucursal` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `direccion` varchar(20) NOT NULL,
  `estado` bit(1) NOT NULL,
  `decEst` varchar(20) DEFAULT NULL,
  `PrincipalSuc` bit(1) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `correo` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `sucursal`
--

INSERT INTO `sucursal` (`idSucursal`, `nombre`, `direccion`, `estado`, `decEst`, `PrincipalSuc`, `telefono`, `correo`) VALUES
(1, 'SUC-LAMB', 'jr. bolivar 560', b'0', 'sin problemas', b'0', '152365', 'SUC-LAMB@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `telefono`
--

CREATE TABLE `telefono` (
  `idTelefono` int(11) NOT NULL,
  `numero` char(9) NOT NULL,
  `Principal` bit(1) NOT NULL,
  `estado` bit(1) NOT NULL,
  `idPersona` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `telefono`
--

INSERT INTO `telefono` (`idTelefono`, `numero`, `Principal`, `estado`, `idPersona`) VALUES
(1, '1234565', b'0', b'0', 3),
(2, '946191', b'1', b'0', 3),
(3, 'yampier', b'1', b'1', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipodocumento`
--

CREATE TABLE `tipodocumento` (
  `idTipoDocumento` int(11) NOT NULL,
  `DescTipodoc` varchar(25) NOT NULL,
  `estado` bit(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipodocumento`
--

INSERT INTO `tipodocumento` (`idTipoDocumento`, `DescTipodoc`, `estado`) VALUES
(1, 'DNI', b'0'),
(2, 'Carnet de extranjería ', b'0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipotrabajador`
--

CREATE TABLE `tipotrabajador` (
  `idTipTrab` int(11) NOT NULL,
  `estadoTT` bit(1) NOT NULL,
  `descTipoTrab` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipotrabajador`
--

INSERT INTO `tipotrabajador` (`idTipTrab`, `estadoTT`, `descTipoTrab`) VALUES
(1, b'0', 'Vendedor'),
(2, b'0', 'Administrador'),
(3, b'0', 'Encargado de aseo'),
(4, b'0', 'Encargado de almac'),
(5, b'0', 'gerente '),
(6, b'0', 'Cajero');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajador`
--

CREATE TABLE `trabajador` (
  `idTrabajador` int(11) NOT NULL,
  `sueldo` float NOT NULL,
  `idPersona` int(11) NOT NULL,
  `idSucursal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `trabajador`
--

INSERT INTO `trabajador` (`idTrabajador`, `sueldo`, `idPersona`, `idSucursal`) VALUES
(1, 1200, 2, 1),
(2, 13250, 1, 1),
(3, 12.2, 1, 1),
(4, 3600, 2, 1),
(5, 5000, 3, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `unimedida`
--

CREATE TABLE `unimedida` (
  `idUniMedidas` int(11) NOT NULL,
  `DescripcionUni` varchar(25) NOT NULL,
  `abreviatura` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `unimedida`
--

INSERT INTO `unimedida` (`idUniMedidas`, `DescripcionUni`, `abreviatura`) VALUES
(1, 'Cajon', 'CJ'),
(2, 'Caja', 'C'),
(3, 'Cajita', 'C'),
(4, 'Unidad', 'Un');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `estado` bit(1) NOT NULL,
  `decEst` varchar(20) DEFAULT NULL,
  `creacion` date NOT NULL,
  `baja` date DEFAULT NULL,
  `idPersona` int(11) NOT NULL,
  `imagen` longblob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idUsuario`, `descripcion`, `pass`, `estado`, `decEst`, `creacion`, `baja`, `idPersona`, `imagen`) VALUES
(1, 'SevHernandez', '123', b'0', 'sin problemas', '2021-06-03', NULL, 1, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `idVenta` int(11) NOT NULL,
  `estado` char(1) NOT NULL,
  `tipoPago` char(1) NOT NULL,
  `fechar` datetime NOT NULL,
  `total` float NOT NULL,
  `idCliente` int(11) NOT NULL,
  `idTrabajador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `acceso`
--
ALTER TABLE `acceso`
  ADD PRIMARY KEY (`idAcceso`);

--
-- Indices de la tabla `almacen`
--
ALTER TABLE `almacen`
  ADD PRIMARY KEY (`idAlmacen`),
  ADD KEY `FK_10` (`idSucursal`),
  ADD KEY `FK_11` (`idTrabajador`);

--
-- Indices de la tabla `areat`
--
ALTER TABLE `areat`
  ADD PRIMARY KEY (`idArea`);

--
-- Indices de la tabla `areatipotrabajador`
--
ALTER TABLE `areatipotrabajador`
  ADD PRIMARY KEY (`idAreaTipTrab`),
  ADD KEY `FK_7` (`idArea`),
  ADD KEY `FK_8` (`idTipTrab`),
  ADD KEY `FK_9` (`idTrabajador`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idCliente`),
  ADD KEY `FK_30` (`idPrestatario`),
  ADD KEY `FK_33` (`idPersona`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`idCompra`),
  ADD KEY `FK_20` (`idTrabajador`),
  ADD KEY `FK_23` (`idSocio`);

--
-- Indices de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD PRIMARY KEY (`idDetCompra`),
  ADD KEY `FK_21` (`idCompra`),
  ADD KEY `FK_22` (`idProducto`);

--
-- Indices de la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  ADD PRIMARY KEY (`idDetVenta`),
  ADD KEY `FK_18` (`idVenta`),
  ADD KEY `FK_19` (`idProducto`);

--
-- Indices de la tabla `direccion`
--
ALTER TABLE `direccion`
  ADD PRIMARY KEY (`idDireccion`),
  ADD KEY `FK_2` (`idPersona`);

--
-- Indices de la tabla `documento`
--
ALTER TABLE `documento`
  ADD PRIMARY KEY (`idDocumento`),
  ADD KEY `FK_6` (`idTipoDoc`),
  ADD KEY `FK_DOC_PER` (`idPersona`);

--
-- Indices de la tabla `email`
--
ALTER TABLE `email`
  ADD PRIMARY KEY (`idEmail`),
  ADD KEY `fk_EmailPersona` (`idPersona`);

--
-- Indices de la tabla `estante`
--
ALTER TABLE `estante`
  ADD PRIMARY KEY (`idEstante`),
  ADD KEY `FK_12` (`idAlmacen`);

--
-- Indices de la tabla `linea`
--
ALTER TABLE `linea`
  ADD PRIMARY KEY (`idLinea`);

--
-- Indices de la tabla `marca`
--
ALTER TABLE `marca`
  ADD PRIMARY KEY (`idMarca`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`idPersona`);

--
-- Indices de la tabla `presentacion`
--
ALTER TABLE `presentacion`
  ADD PRIMARY KEY (`idPresentacion`);

--
-- Indices de la tabla `prestatario`
--
ALTER TABLE `prestatario`
  ADD PRIMARY KEY (`idPrestatario`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`),
  ADD KEY `FK_4` (`idPresentacion`),
  ADD KEY `FK_13` (`idLinea`),
  ADD KEY `FK_14` (`idMarca`),
  ADD KEY `FK_15` (`idEstante`),
  ADD KEY `idUniMedidas` (`idUniMedidas`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`idRol`);

--
-- Indices de la tabla `rolacceso`
--
ALTER TABLE `rolacceso`
  ADD PRIMARY KEY (`idRolAcceso`),
  ADD KEY `FK_24` (`idRol`),
  ADD KEY `FK_25` (`idAcceso`);

--
-- Indices de la tabla `roluser`
--
ALTER TABLE `roluser`
  ADD PRIMARY KEY (`idRolUser`),
  ADD KEY `FK_27` (`idUsuario`),
  ADD KEY `FK_28` (`idRol`);

--
-- Indices de la tabla `socio`
--
ALTER TABLE `socio`
  ADD PRIMARY KEY (`idSocio`),
  ADD KEY `FK_31` (`idPrestatario`),
  ADD KEY `FK_32` (`idRepresentante`);

--
-- Indices de la tabla `sucursal`
--
ALTER TABLE `sucursal`
  ADD PRIMARY KEY (`idSucursal`);

--
-- Indices de la tabla `telefono`
--
ALTER TABLE `telefono`
  ADD PRIMARY KEY (`idTelefono`),
  ADD KEY `FK_3` (`idPersona`);

--
-- Indices de la tabla `tipodocumento`
--
ALTER TABLE `tipodocumento`
  ADD PRIMARY KEY (`idTipoDocumento`);

--
-- Indices de la tabla `tipotrabajador`
--
ALTER TABLE `tipotrabajador`
  ADD PRIMARY KEY (`idTipTrab`);

--
-- Indices de la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD PRIMARY KEY (`idTrabajador`),
  ADD KEY `FK_29` (`idPersona`),
  ADD KEY `fk_AlmacenSucursal` (`idSucursal`);

--
-- Indices de la tabla `unimedida`
--
ALTER TABLE `unimedida`
  ADD PRIMARY KEY (`idUniMedidas`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUsuario`),
  ADD KEY `FK_26` (`idPersona`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`idVenta`),
  ADD KEY `FK_16` (`idCliente`),
  ADD KEY `FK_17` (`idTrabajador`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `acceso`
--
ALTER TABLE `acceso`
  MODIFY `idAcceso` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `almacen`
--
ALTER TABLE `almacen`
  MODIFY `idAlmacen` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `areat`
--
ALTER TABLE `areat`
  MODIFY `idArea` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `areatipotrabajador`
--
ALTER TABLE `areatipotrabajador`
  MODIFY `idAreaTipTrab` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `idCompra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  MODIFY `idDetCompra` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  MODIFY `idDetVenta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `direccion`
--
ALTER TABLE `direccion`
  MODIFY `idDireccion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `documento`
--
ALTER TABLE `documento`
  MODIFY `idDocumento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `email`
--
ALTER TABLE `email`
  MODIFY `idEmail` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `estante`
--
ALTER TABLE `estante`
  MODIFY `idEstante` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `linea`
--
ALTER TABLE `linea`
  MODIFY `idLinea` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `marca`
--
ALTER TABLE `marca`
  MODIFY `idMarca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `idPersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `presentacion`
--
ALTER TABLE `presentacion`
  MODIFY `idPresentacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `prestatario`
--
ALTER TABLE `prestatario`
  MODIFY `idPrestatario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `idRol` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `rolacceso`
--
ALTER TABLE `rolacceso`
  MODIFY `idRolAcceso` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `roluser`
--
ALTER TABLE `roluser`
  MODIFY `idRolUser` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `socio`
--
ALTER TABLE `socio`
  MODIFY `idSocio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `sucursal`
--
ALTER TABLE `sucursal`
  MODIFY `idSucursal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `telefono`
--
ALTER TABLE `telefono`
  MODIFY `idTelefono` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `tipodocumento`
--
ALTER TABLE `tipodocumento`
  MODIFY `idTipoDocumento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tipotrabajador`
--
ALTER TABLE `tipotrabajador`
  MODIFY `idTipTrab` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `trabajador`
--
ALTER TABLE `trabajador`
  MODIFY `idTrabajador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `unimedida`
--
ALTER TABLE `unimedida`
  MODIFY `idUniMedidas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `idVenta` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `almacen`
--
ALTER TABLE `almacen`
  ADD CONSTRAINT `FK_10` FOREIGN KEY (`idSucursal`) REFERENCES `sucursal` (`idSucursal`),
  ADD CONSTRAINT `FK_11` FOREIGN KEY (`idTrabajador`) REFERENCES `trabajador` (`idTrabajador`);

--
-- Filtros para la tabla `areatipotrabajador`
--
ALTER TABLE `areatipotrabajador`
  ADD CONSTRAINT `FK_7` FOREIGN KEY (`idArea`) REFERENCES `areat` (`idArea`),
  ADD CONSTRAINT `FK_8` FOREIGN KEY (`idTipTrab`) REFERENCES `tipotrabajador` (`idTipTrab`),
  ADD CONSTRAINT `FK_9` FOREIGN KEY (`idTrabajador`) REFERENCES `trabajador` (`idTrabajador`);

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `FK_30` FOREIGN KEY (`idPrestatario`) REFERENCES `prestatario` (`idPrestatario`),
  ADD CONSTRAINT `FK_33` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`);

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `FK_20` FOREIGN KEY (`idTrabajador`) REFERENCES `trabajador` (`idTrabajador`),
  ADD CONSTRAINT `FK_23` FOREIGN KEY (`idSocio`) REFERENCES `socio` (`idSocio`);

--
-- Filtros para la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD CONSTRAINT `FK_21` FOREIGN KEY (`idCompra`) REFERENCES `compra` (`idCompra`),
  ADD CONSTRAINT `FK_22` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);

--
-- Filtros para la tabla `detalleventa`
--
ALTER TABLE `detalleventa`
  ADD CONSTRAINT `FK_18` FOREIGN KEY (`idVenta`) REFERENCES `venta` (`idVenta`),
  ADD CONSTRAINT `FK_19` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);

--
-- Filtros para la tabla `direccion`
--
ALTER TABLE `direccion`
  ADD CONSTRAINT `FK_2` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`);

--
-- Filtros para la tabla `documento`
--
ALTER TABLE `documento`
  ADD CONSTRAINT `FK_5` FOREIGN KEY (`idTipoDoc`) REFERENCES `tipodocumento` (`idTipoDocumento`),
  ADD CONSTRAINT `FK_6` FOREIGN KEY (`idTipoDoc`) REFERENCES `persona` (`idPersona`),
  ADD CONSTRAINT `FK_DOC_PER` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`);

--
-- Filtros para la tabla `email`
--
ALTER TABLE `email`
  ADD CONSTRAINT `FK_1` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`),
  ADD CONSTRAINT `fk_EmailPersona` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`);

--
-- Filtros para la tabla `estante`
--
ALTER TABLE `estante`
  ADD CONSTRAINT `FK_12` FOREIGN KEY (`idAlmacen`) REFERENCES `almacen` (`idAlmacen`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `FK_13` FOREIGN KEY (`idLinea`) REFERENCES `linea` (`idLinea`),
  ADD CONSTRAINT `FK_14` FOREIGN KEY (`idMarca`) REFERENCES `marca` (`idMarca`),
  ADD CONSTRAINT `FK_15` FOREIGN KEY (`idEstante`) REFERENCES `estante` (`idEstante`),
  ADD CONSTRAINT `FK_4` FOREIGN KEY (`idPresentacion`) REFERENCES `presentacion` (`idPresentacion`),
  ADD CONSTRAINT `fk_UniMedidas` FOREIGN KEY (`idUniMedidas`) REFERENCES `unimedida` (`idUniMedidas`);

--
-- Filtros para la tabla `rolacceso`
--
ALTER TABLE `rolacceso`
  ADD CONSTRAINT `FK_24` FOREIGN KEY (`idRol`) REFERENCES `rol` (`idRol`),
  ADD CONSTRAINT `FK_25` FOREIGN KEY (`idAcceso`) REFERENCES `acceso` (`idAcceso`);

--
-- Filtros para la tabla `roluser`
--
ALTER TABLE `roluser`
  ADD CONSTRAINT `FK_27` FOREIGN KEY (`idUsuario`) REFERENCES `usuario` (`idUsuario`),
  ADD CONSTRAINT `FK_28` FOREIGN KEY (`idRol`) REFERENCES `rol` (`idRol`);

--
-- Filtros para la tabla `socio`
--
ALTER TABLE `socio`
  ADD CONSTRAINT `FK_31` FOREIGN KEY (`idPrestatario`) REFERENCES `prestatario` (`idPrestatario`),
  ADD CONSTRAINT `FK_32` FOREIGN KEY (`idRepresentante`) REFERENCES `persona` (`idPersona`);

--
-- Filtros para la tabla `telefono`
--
ALTER TABLE `telefono`
  ADD CONSTRAINT `FK_3` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`);

--
-- Filtros para la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD CONSTRAINT `FK_29` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`),
  ADD CONSTRAINT `fk_AlmacenSucursal` FOREIGN KEY (`idSucursal`) REFERENCES `sucursal` (`idSucursal`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `FK_26` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`);

--
-- Filtros para la tabla `venta`
--
ALTER TABLE `venta`
  ADD CONSTRAINT `FK_16` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`),
  ADD CONSTRAINT `FK_17` FOREIGN KEY (`idTrabajador`) REFERENCES `trabajador` (`idTrabajador`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
