-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-11-2023 a las 19:48:02
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `basepasteleria`
--
CREATE DATABASE IF NOT EXISTS `basepasteleria` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `basepasteleria`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `almacen`
--

DROP TABLE IF EXISTS `almacen`;
CREATE TABLE `almacen` (
  `IDArticulo` int(11) NOT NULL,
  `IDLinea` int(11) NOT NULL,
  `alma_desc` varchar(100) DEFAULT NULL,
  `alma_stock` int(11) NOT NULL,
  `alma_umedida` varchar(8) NOT NULL,
  `alma_punit` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `IDCliente` int(11) NOT NULL,
  `cli_dni` int(8) NOT NULL,
  `cli_nom` varchar(50) NOT NULL,
  `cli_tel` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

DROP TABLE IF EXISTS `factura`;
CREATE TABLE `factura` (
  `IDFactura` int(11) NOT NULL,
  `IDLinea` int(11) NOT NULL,
  `IDProveedor` int(11) NOT NULL,
  `fac_fechentra` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura_detalle`
--

DROP TABLE IF EXISTS `factura_detalle`;
CREATE TABLE `factura_detalle` (
  `IDFactura` int(11) NOT NULL,
  `IDArticulo` int(11) NOT NULL,
  `fac_cantidad` double(10,2) NOT NULL,
  `fac_total` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `linea`
--

DROP TABLE IF EXISTS `linea`;
CREATE TABLE `linea` (
  `IDLinea` int(11) NOT NULL,
  `lin_nom` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago`
--

DROP TABLE IF EXISTS `pago`;
CREATE TABLE `pago` (
  `IDPago` int(11) NOT NULL,
  `IDRecibo` int(11) NOT NULL,
  `pag_tipocomp` varchar(20) NOT NULL,
  `pag_numcomp` varchar(20) NOT NULL,
  `pag_igv` double(4,2) NOT NULL,
  `pag_total` double(10,2) NOT NULL,
  `pag_fechaemision` date NOT NULL,
  `pag_fechapago` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
CREATE TABLE `proveedor` (
  `IDProveedor` int(11) NOT NULL,
  `prov_nom` varchar(30) NOT NULL,
  `prov_tele` varchar(9) NOT NULL,
  `prov_domi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recibo`
--

DROP TABLE IF EXISTS `recibo`;
CREATE TABLE `recibo` (
  `IDRecibo` int(11) NOT NULL,
  `IDCliente` int(11) NOT NULL,
  `rec_fecha` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `recibo_detalle`
--

DROP TABLE IF EXISTS `recibo_detalle`;
CREATE TABLE `recibo_detalle` (
  `IDRecibo` int(11) NOT NULL,
  `IDArticulo` int(11) NOT NULL,
  `rec_cantidad` double(10,2) NOT NULL,
  `rec_total` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `IDUsuario` int(11) NOT NULL,
  `usu_dni` varchar(8) NOT NULL,
  `usu_nom` varchar(30) NOT NULL,
  `usu_correo` varchar(50) NOT NULL,
  `usu_contra` varchar(50) NOT NULL,
  `usu_tipo` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `almacen`
--
ALTER TABLE `almacen`
  ADD PRIMARY KEY (`IDArticulo`),
  ADD KEY `IDLinea` (`IDLinea`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`IDCliente`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`IDFactura`),
  ADD KEY `IDLinea` (`IDLinea`),
  ADD KEY `IDProveedor` (`IDProveedor`);

--
-- Indices de la tabla `factura_detalle`
--
ALTER TABLE `factura_detalle`
  ADD KEY `IDFactura` (`IDFactura`),
  ADD KEY `IDArticulo` (`IDArticulo`);

--
-- Indices de la tabla `linea`
--
ALTER TABLE `linea`
  ADD PRIMARY KEY (`IDLinea`);

--
-- Indices de la tabla `pago`
--
ALTER TABLE `pago`
  ADD PRIMARY KEY (`IDPago`),
  ADD KEY `IDRecibo` (`IDRecibo`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`IDProveedor`);

--
-- Indices de la tabla `recibo`
--
ALTER TABLE `recibo`
  ADD PRIMARY KEY (`IDRecibo`),
  ADD KEY `IDCliente` (`IDCliente`);

--
-- Indices de la tabla `recibo_detalle`
--
ALTER TABLE `recibo_detalle`
  ADD KEY `IDRecibo` (`IDRecibo`),
  ADD KEY `IDArticulo` (`IDArticulo`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`IDUsuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `almacen`
--
ALTER TABLE `almacen`
  MODIFY `IDArticulo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `IDCliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `IDFactura` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `linea`
--
ALTER TABLE `linea`
  MODIFY `IDLinea` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pago`
--
ALTER TABLE `pago`
  MODIFY `IDPago` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `IDProveedor` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `recibo`
--
ALTER TABLE `recibo`
  MODIFY `IDRecibo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `IDUsuario` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `almacen`
--
ALTER TABLE `almacen`
  ADD CONSTRAINT `almacen_ibfk_1` FOREIGN KEY (`IDLinea`) REFERENCES `linea` (`IDLinea`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`IDProveedor`) REFERENCES `proveedor` (`IDProveedor`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `factura_ibfk_2` FOREIGN KEY (`IDLinea`) REFERENCES `linea` (`IDLinea`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `factura_detalle`
--
ALTER TABLE `factura_detalle`
  ADD CONSTRAINT `factura_detalle_ibfk_1` FOREIGN KEY (`IDFactura`) REFERENCES `factura` (`IDFactura`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `factura_detalle_ibfk_2` FOREIGN KEY (`IDArticulo`) REFERENCES `almacen` (`IDArticulo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `pago`
--
ALTER TABLE `pago`
  ADD CONSTRAINT `pago_ibfk_1` FOREIGN KEY (`IDRecibo`) REFERENCES `recibo` (`IDRecibo`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `recibo`
--
ALTER TABLE `recibo`
  ADD CONSTRAINT `recibo_ibfk_1` FOREIGN KEY (`IDCliente`) REFERENCES `cliente` (`IDCliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `recibo_detalle`
--
ALTER TABLE `recibo_detalle`
  ADD CONSTRAINT `recibo_detalle_ibfk_1` FOREIGN KEY (`IDRecibo`) REFERENCES `recibo` (`IDRecibo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `recibo_detalle_ibfk_2` FOREIGN KEY (`IDArticulo`) REFERENCES `almacen` (`IDArticulo`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
