-- phpMyAdmin SQL Dump
-- version 4.0.10deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 30-07-2014 a las 19:55:39
-- Versión del servidor: 5.5.38-0ubuntu0.14.04.1
-- Versión de PHP: 5.5.9-1ubuntu4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `tienda`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nota`
--

CREATE TABLE IF NOT EXISTS `nota` (
  `folio_nota` int(11) NOT NULL AUTO_INCREMENT,
  `suma` float NOT NULL,
  `descuento` int(11) NOT NULL,
  `subtotal` float NOT NULL,
  `iva` int(11) NOT NULL,
  `total` float NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`folio_nota`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Volcado de datos para la tabla `nota`
--

INSERT INTO `nota` (`folio_nota`, `suma`, `descuento`, `subtotal`, `iva`, `total`, `fecha`) VALUES
(3, 13000, 0, 13000, 16, 15080, '2014-07-12'),
(4, 26000, 0, 26000, 16, 30160, '2014-07-12'),
(5, 32000, 0, 32000, 16, 37120, '2014-07-12'),
(6, 2980, 0, 2980, 16, 3456.8, '2014-07-27'),
(7, 1280, 0, 1280, 16, 1484.8, '2014-07-27'),
(8, 300, 0, 300, 16, 348, '2014-07-27'),
(9, 330, 0, 330, 16, 382.8, '2014-07-27');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE IF NOT EXISTS `productos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_producto` varchar(50) DEFAULT NULL,
  `existencia` int(11) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `unidad_de_medida` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `nombre_producto`, `existencia`, `precio`, `unidad_de_medida`) VALUES
(3, 'ps3', 4, 4000, 'piezas'),
(4, 'wii u', 2, 5000, 'piezas'),
(5, 'balatas', 50, 260, 'piezas'),
(6, 'bujia chevrolet', 100, 50, 'piezas'),
(7, 'retrovisor chevy izq.', 20, 300, 'piezas'),
(8, 'faro ac intergra izq.', 10, 2200, 'piezas'),
(9, 'aceite castrol', 50, 140, 'litros');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE IF NOT EXISTS `venta` (
  `id_venta` int(11) NOT NULL AUTO_INCREMENT,
  `clave` int(11) NOT NULL,
  `clave_nota` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `unidad_de_medida` varchar(50) NOT NULL,
  `descripcion` varchar(50) NOT NULL,
  `precio_unitario` float NOT NULL,
  `importe` float NOT NULL,
  PRIMARY KEY (`id_venta`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`id_venta`, `clave`, `clave_nota`, `cantidad`, `unidad_de_medida`, `descripcion`, `precio_unitario`, `importe`) VALUES
(5, 3, 3, 2, 'piezas', 'ps3', 4000, 8000),
(6, 4, 3, 1, 'piezas', 'wii u', 5000, 5000),
(7, 3, 4, 4, 'piezas', 'ps3', 4000, 16000),
(8, 4, 4, 2, 'piezas', 'wii u', 5000, 10000),
(9, 3, 5, 8, 'piezas', 'ps3', 4000, 32000),
(10, 5, 6, 3, 'piezas', 'balatas', 260, 780),
(11, 8, 6, 1, 'piezas', 'faro ac intergra izq.', 2200, 2200),
(12, 9, 7, 1, 'litros', 'aceite castrol', 140, 140),
(13, 6, 7, 2, 'piezas', 'bujia chevrolet', 50, 100),
(14, 5, 7, 4, 'piezas', 'balatas', 260, 1040),
(15, 7, 8, 1, 'piezas', 'retrovisor chevy izq.', 300, 300),
(16, 9, 9, 2, 'litros', 'aceite castrol', 140, 280),
(17, 6, 9, 1, 'piezas', 'bujia chevrolet', 50, 50);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
