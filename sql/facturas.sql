-- MySQL dump 10.13  Distrib 5.6.13, for Win64 (x86_64)
--
-- Host: localhost    Database: facturas
-- ------------------------------------------------------
-- Server version	5.6.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `idCliente` int(10) NOT NULL AUTO_INCREMENT,
  `RFC` varchar(25) DEFAULT NULL,
  `NombreCliente` varchar(50) DEFAULT NULL,
  `Direccion` varchar(500) DEFAULT NULL,
  `Municipio` varchar(20) DEFAULT NULL,
  `Estado` varchar(20) DEFAULT NULL,
  `CodPostal` int(10) DEFAULT NULL,
  `correo` varchar(40) DEFAULT NULL,
  `Localidad` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (2,'GCR081028K4A','GRUPO kkjkj','Calle FRACC. VILLAS DEL MAR I MZA. 39 No. Exterior LOTE 1 No.  Interior CASA 2 Colonia SUPERMANZANA 248','BENITO JUAREZ','QUINTANA ROO',77516,'warriorgera@gmail.com','CANCUN'),(3,'OPE0401271D8','OPERATEC, S.A. DE C.V.','AV. LABNA MANZANA 17 LOTE 86 Nº.S/N Int Nº. A SUPERMANZANA 20','QUINTANA ROO','CANCUN',77500,'OPERATEC@gmail.com',NULL),(4,'DRG041213AV9','DIAZ, RUIZ, GASQUE Y ASOCIADOS, S.C.P.','CALLE 60 X 53 Nº. 474 ALTOS COLONIA CENTRO','YUCATAN','MERIDA',97000,'oficina.merida@drgc.com.mx',NULL),(5,'RAA020304893','REFACCIONARIA AUTOMOTRIZ ANCONA S.A DE C.V.','AV. PUERTO JUAREZ, LTE. 29, MZA.1 REG. 92','QUINTANA ROO','CANCUN',77516,'ANCONA@gmail.com',NULL),(6,'CACF751016UV4','JOSE FLORENTINO CANCHE CHAN','CALLE PASEO DE MACEDONIA MZA. 19 No. EXTERIOR LT. 01 INTERIOR CASA 05 D COLONIA REG. 214','QUINTANA ROO','BENITO JUAREZ',77517,'JOSE_FLORENTINO@hotmail.com',NULL);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empresa` (
  `idEmpresa` int(10) NOT NULL AUTO_INCREMENT,
  `RFC` varchar(20) DEFAULT NULL,
  `NombreCliente` varchar(50) DEFAULT NULL,
  `Sucursal` varchar(50) DEFAULT NULL,
  `Direccion` varchar(50) DEFAULT NULL,
  `Municipio` varchar(50) DEFAULT NULL,
  `Estado` varchar(50) DEFAULT NULL,
  `CodPostal` int(10) DEFAULT NULL,
  PRIMARY KEY (`idEmpresa`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura_emitida`
--

DROP TABLE IF EXISTS `factura_emitida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `factura_emitida` (
  `idCliente` int(10) DEFAULT NULL,
  `idFacturaEmitida` int(10) NOT NULL AUTO_INCREMENT,
  `Folio_Fiscal` varchar(50) DEFAULT NULL,
  `SerieCSD` varchar(50) DEFAULT NULL,
  `FechaEmision` datetime DEFAULT NULL,
  `Lugar` varchar(100) DEFAULT NULL,
  `Folio` int(10) DEFAULT NULL,
  `Serie` varchar(5) DEFAULT NULL,
  `Observaciones` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idFacturaEmitida`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura_emitida`
--

LOCK TABLES `factura_emitida` WRITE;
/*!40000 ALTER TABLE `factura_emitida` DISABLE KEYS */;
/*!40000 ALTER TABLE `factura_emitida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producto` (
  `idProducto` int(10) NOT NULL AUTO_INCREMENT,
  `idFacturaEmitida` int(10) DEFAULT NULL,
  `Cantidad` int(5) DEFAULT NULL,
  `UM` varchar(20) DEFAULT NULL,
  `Descripcion` varchar(100) DEFAULT NULL,
  `Precio` float DEFAULT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sat`
--

DROP TABLE IF EXISTS `sat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sat` (
  `idSAT` int(10) NOT NULL AUTO_INCREMENT,
  `idFacturaEmitida` int(10) DEFAULT NULL,
  `SelloCFDI` varchar(500) DEFAULT NULL,
  `SelloSAT` varchar(500) DEFAULT NULL,
  `Certi_SAT` varchar(500) DEFAULT NULL,
  `S_Cer_SAT` varchar(500) DEFAULT NULL,
  `FechaHora` datetime DEFAULT NULL,
  PRIMARY KEY (`idSAT`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sat`
--

LOCK TABLES `sat` WRITE;
/*!40000 ALTER TABLE `sat` DISABLE KEYS */;
/*!40000 ALTER TABLE `sat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `totales`
--

DROP TABLE IF EXISTS `totales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `totales` (
  `idTotales` int(10) NOT NULL AUTO_INCREMENT,
  `idFacturaEmitida` int(10) DEFAULT NULL,
  `Suma` double DEFAULT NULL,
  `Descuento` double DEFAULT NULL,
  `Subtotal` double DEFAULT NULL,
  `IVA` double DEFAULT NULL,
  `Total` double DEFAULT NULL,
  PRIMARY KEY (`idTotales`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `totales`
--

LOCK TABLES `totales` WRITE;
/*!40000 ALTER TABLE `totales` DISABLE KEYS */;
/*!40000 ALTER TABLE `totales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(30) DEFAULT NULL,
  `contrasena` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'admin','admin'),(2,'Gerardo','12345'),(3,'padd','213213'),(4,'Zero','Zero'),(5,'hola','hola');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-07-21 12:18:41
