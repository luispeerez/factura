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
  `CodPostal` varchar(10) DEFAULT NULL,
  `correo` varchar(40) DEFAULT NULL,
  `Localidad` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (2,'GCR081028K4A','GRUPO ANCONA','Calle FRACC. VILLAS DEL MAR I MZA. 39 No. Exterior LOTE 1 No.  Interior CASA 2 Colonia SUPERMANZANA 248','BENITO JUAREZ','QUINTANA ROO','77516','warriorgera@gmail.com','CANCUN'),(3,'OPE0401271D8','OPERATEC, S.A. DE C.V.','AV. LABNA MANZANA 17 LOTE 86 Nº.S/N Int Nº. A SUPERMANZANA 20','BENITO JUAREZ','QUINTANA ROO','77500','leogd3579@gmail.com','CANCUN'),(4,'DRG041213AV9','DIAZ, RUIZ, GASQUE Y ASOCIADOS, S.C.P.','CALLE 60 X 53 Nº. 474 ALTOS COLONIA CENTRO','MERIDA','YUCATAN','97000','oficina.merida@drgc.com.mx','Merida'),(5,'RAA020304893','REFACCIONARIA AUTOMOTRIZ ANCONA S.A DE C.V.','AV. PUERTO JUAREZ, LTE. 29, MZA.1 REG. 92','BENITO JUAREZ','QUINTANA ROO','77516','ANCONA@gmail.com','CANCUN');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura_emitida`
--

DROP TABLE IF EXISTS `factura_emitida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `factura_emitida` (
  `idCliente` int(10) DEFAULT NULL,
  `idFacturaEmitida` int(11) NOT NULL AUTO_INCREMENT,
  `Folio_Fiscal` varchar(50) DEFAULT NULL,
  `SerieCSD` varchar(50) DEFAULT NULL,
  `FechaEmision` datetime DEFAULT NULL,
  `Lugar` varchar(100) DEFAULT NULL,
  `Folio` int(10) DEFAULT NULL,
  `Serie` varchar(5) DEFAULT NULL,
  `Observaciones` text,
  `fechasistema` text,
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
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(30) DEFAULT NULL,
  `contrasena` varchar(15) DEFAULT NULL,
  `tipo` varchar(30) DEFAULT NULL,
  `correo` text,
  `contcorreo` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'admin','admin','Administrador','anconafactura','ancona12'),(10,'Pepe','12345','Usuario','anconafactura','ancona12');
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

-- Dump completed on 2014-07-30 18:39:23
