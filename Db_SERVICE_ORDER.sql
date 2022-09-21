CREATE DATABASE  IF NOT EXISTS `computerbd` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `computerbd`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: computerbd
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `computer`
--

DROP TABLE IF EXISTS `computer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `computer` (
  `idcomputer` int NOT NULL AUTO_INCREMENT,
  `brand` varchar(45) NOT NULL,
  `model` varchar(45) NOT NULL,
  `serial_number` varchar(45) DEFAULT NULL,
  `idmonitor` int NOT NULL,
  `idmouse` int NOT NULL,
  `idkeyboard` int NOT NULL,
  PRIMARY KEY (`idcomputer`),
  KEY `mouse_idx` (`idmouse`),
  KEY `monitor_idx` (`idmonitor`),
  KEY `keyboard_idx` (`idkeyboard`),
  CONSTRAINT `keyboard` FOREIGN KEY (`idkeyboard`) REFERENCES `keyboard` (`idkeyboard`),
  CONSTRAINT `monitor` FOREIGN KEY (`idmonitor`) REFERENCES `monitor` (`idmonitor`),
  CONSTRAINT `mouse` FOREIGN KEY (`idmouse`) REFERENCES `mouse` (`idmouse`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `computer`
--

LOCK TABLES `computer` WRITE;
/*!40000 ALTER TABLE `computer` DISABLE KEYS */;
INSERT INTO `computer` VALUES (1,'asus','lkjdsfho','lknd',1,1,1),(2,'dell','lkdjn','ljkdnfj',2,2,2),(3,'lenovo','poijdsf','ñopdfjp',3,3,3),(4,'Prueba marca','prueba modelo','Checo is a legend',5,5,5),(5,'asus','PruebaPOST','lknd',9,9,9),(6,'asus','PruebaPOST2','lknd',9,9,9);
/*!40000 ALTER TABLE `computer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `keyboard`
--

DROP TABLE IF EXISTS `keyboard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `keyboard` (
  `idkeyboard` int NOT NULL AUTO_INCREMENT,
  `brand` varchar(45) NOT NULL,
  `model` varchar(45) NOT NULL,
  `serial_number` varchar(45) NOT NULL,
  PRIMARY KEY (`idkeyboard`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `keyboard`
--

LOCK TABLES `keyboard` WRITE;
/*!40000 ALTER TABLE `keyboard` DISABLE KEYS */;
INSERT INTO `keyboard` VALUES (1,'Wondaz','xyz123','589574d5g489wq'),(2,'Dell','yyy333','98f6s546546fdwq'),(3,'Lenovo','5252','685498wewefrg4'),(4,'Asus','x556ur','ndihjsbvlikfhgyyfksgf'),(5,'Dell','fisbifo','lfdksopf645f3c55edd'),(6,'glycopyrrolate','F250','456-31-4378'),(7,'Flu Relief Therapy Night Time','B2600','783-93-1120'),(8,'GM Collin','G-Series G30','401-22-0447'),(9,'DEXTROSE','Ranger','504-80-8116'),(10,'Viracept','HS','598-98-1569'),(11,'Goats Milk','Thunderbird','676-41-2345'),(12,'equaline childrens ibuprofen oral suspension','Talon','809-22-4689'),(13,'Spiny Pigweed','Impreza','554-16-3864'),(14,'Pantoprazole Sodium','X5','776-33-6383'),(15,'Venlafaxine Hydrochloride','Accord','613-26-3131'),(16,'Infect Rescue','Model T','812-31-3764'),(17,'Meloxicam','Prowler','719-42-7477'),(18,'Nicotine','Armada','541-14-9666'),(19,'AMARANTHUS RETROFLEXUS POLLEN','200','817-49-7760'),(20,'Adult Tussin DM Max','2500','823-15-3892'),(21,'Citalopram','LaCrosse','674-40-3848'),(22,'Dyural LM Kit','Corrado','829-98-2625'),(23,'Liposyn II','Cherokee','675-07-5451'),(24,'CYZONE','Viper RT/10','679-73-6726'),(25,'JNH Ato-Care Super Barried ATO-Serum','Sable','337-38-6283'),(26,'ATORVASTATIN CALCIUM','NSX','377-58-3807'),(27,'Headache - Migraine','525','776-40-2632'),(28,'Estradiol','MX-3','883-22-0835'),(29,'Siltussin DM','Windstar','488-18-2355'),(30,'Humulin N','MPV','864-03-0735'),(31,'Diphenhydramine Hydrochloride','Yukon XL 1500','852-03-6674'),(32,'Hygienic Cleansing Pad','Eos','134-56-2817'),(33,'Naproxen','G25','742-75-9591'),(34,'Old Spice Fresher Collection Amber','Amanti','294-26-5817'),(35,'Relpax','Forester','773-08-6078'),(36,'Treatment Set TS346964','SSR','397-73-3738'),(37,'CitraNatal Assure','RL','774-13-5491'),(38,'Ultrasol','Pathfinder','649-82-9225'),(39,'Butalbital, Acetaminophen, and Caffeine','Escalade EXT','473-79-6774'),(40,'Incontinence','Passport','561-77-3270'),(41,'Tucks Internal Soothers','Cooper Clubman','446-81-6299'),(42,'Panama Jack','Continental GT','453-21-1884'),(43,'KETOROLAC TROMETHAMINE','V8 Vantage','552-79-7542'),(44,'Strawberry','E-Series','515-66-1690'),(46,'Acyclovir','Range Rover Sport','709-19-6193'),(48,'Niacin','Sable','340-88-5129'),(49,'Amoxicillin','F150','858-93-5612'),(50,'Potassium Chloride in Sodium Chloride','Spectra','230-95-4519');
/*!40000 ALTER TABLE `keyboard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monitor`
--

DROP TABLE IF EXISTS `monitor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monitor` (
  `idmonitor` int NOT NULL AUTO_INCREMENT,
  `brand` varchar(45) NOT NULL,
  `model` varchar(45) NOT NULL,
  `serial_number` varchar(45) NOT NULL,
  PRIMARY KEY (`idmonitor`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monitor`
--

LOCK TABLES `monitor` WRITE;
/*!40000 ALTER TABLE `monitor` DISABLE KEYS */;
INSERT INTO `monitor` VALUES (1,'game factor','v700','fhrfhr'),(2,'game factor','v500','fgdfhbdf'),(3,'HP','v14','65465g4deg'),(4,'earg','556','aregerg'),(5,'LUICHEL SHINY CAKE NO 23','9000','143-54-4955'),(6,'Nicotine','Rio','350-72-9672'),(7,'Cover and Conceal Blemish Concealer','V70','582-73-3074'),(8,'Enoxaparin Sodium','Skyhawk','380-15-7762'),(9,'Nortriptyline Hydrochloride','Aerostar','681-30-0317'),(10,'Cefazolin','6000','387-55-1582'),(12,'Gillette Power Beads','ZDX','718-56-7573'),(13,'Whitening Repairing BB','Grand Marquis','232-92-1998'),(14,'Carbon Dioxide Refrigerated','Ascender','885-46-1981'),(15,'Dandelion','Express 1500','182-37-6078'),(16,'Trazodone Hydrochloride','Azera','458-29-0026'),(17,'Ranitidine','RX-7','667-48-3822'),(18,'Hand Repair Cream','Dakota','131-30-7098'),(19,'Gold Bond Ultimate Hand Sanitizer Moisturizer','GX','266-81-6663'),(20,'Fluocinonide','XJ Series','709-40-6471'),(21,'Lactated Ringers','Crosstour','293-05-3006'),(24,'Sumatriptan Succinate','Sunbird','143-38-2328'),(25,'Lil Drug Store Multi-Symptom Sinus Relief','Crown Victoria','498-06-1389'),(26,'Good Neighbor Pharmacy','Milan','214-45-6851'),(27,'Codeine Sulfate','Century','351-40-1772'),(28,'Pantoprazole Sodium','Aspen','576-47-2028'),(29,'Ammonium Lactate','IPL G','833-73-8804'),(30,'OVACE','Outlook','163-38-6954');
/*!40000 ALTER TABLE `monitor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mouse`
--

DROP TABLE IF EXISTS `mouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mouse` (
  `idmouse` int NOT NULL AUTO_INCREMENT,
  `brand` varchar(45) NOT NULL,
  `model` varchar(45) NOT NULL,
  `serial_number` varchar(45) NOT NULL,
  PRIMARY KEY (`idmouse`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mouse`
--

LOCK TABLES `mouse` WRITE;
/*!40000 ALTER TABLE `mouse` DISABLE KEYS */;
INSERT INTO `mouse` VALUES (1,'game factor','dvbfd','5465468461'),(2,'game factor','+656+erg4','dhgrthrth'),(3,'La Prairie Switzerland','del Sol','582-37-1213'),(4,'Demadex','CTS-V','683-64-1274'),(5,'Naturasil','GLK-Class','598-38-4811'),(6,'Captopril','Malibu','569-44-3533'),(7,'Omeprazole','Intrepid','268-64-8409'),(8,'Nivea A Kiss of Recovery Medicated Lip Care','F150','639-55-0009'),(9,'Finasteride','Silverado 1500','188-77-9847'),(10,'desloratadine','900','571-13-3646'),(11,'Intervene Makeup SPF 15 Soft Porcelain','LX','607-21-7315'),(12,'PERTZYE','Bronco','120-10-2834'),(13,'SKIN CARE LOTION','F150','809-33-6420'),(14,'SYNRIBO','Ram','129-09-3750'),(15,'FLU HP','XC70','777-86-7064'),(16,'LEVOTHYROXINE SODIUM','Malibu','635-14-4039'),(17,'Viscum Mali e pl. tota 5%','A4','158-03-2977'),(18,'Good Sense Heartburn Relief','Riviera','186-36-8144'),(19,'Carvedilol','Savana 3500','499-75-3078'),(20,'Buspirone hydrochloride','300M','checos'),(21,'Levofloxacin','Astra','505-77-5383'),(22,'Oxygen','G','181-15-2864'),(24,'Technetium Tc99m Generator','Intrepid','221-34-9746'),(25,'Thymus','3500 Club Coupe','303-33-6882'),(26,'Naturals Pomegranate and Mango','Aztek','693-43-0486'),(27,'RAZADYNE','Aventador','212-38-4314'),(28,'Nitroglycerin','Impala','197-68-8528'),(29,'Trulicity','Firebird','763-43-6332'),(30,'Fluconazole','Regal','857-39-8000'),(31,'lubricating plus eye','E-Class','670-06-2655'),(32,'METFORMIN HYDROCHLORIDE','Venture','726-55-3823'),(33,'verapamil hydrochloride','300','483-04-4261'),(34,'Gentamicin Sulfate','Colorado','345-45-2300'),(35,'Alba Natural Acnedote Astringent','Mighty Max','274-48-8064'),(36,'Allopurinol','Yukon','399-29-3652'),(37,'Dr. Oberon Moms Care Cream','Sienna','642-40-1596'),(38,'Povidone Iodine','Lanos','382-68-2579'),(39,'Theraplex','Astro','683-44-9819'),(40,'Furosemide','Grand Voyager','812-96-1823'),(41,'Cocaine Hydrochloride','MDX','313-92-3815'),(42,'Vitalizer','Altima','561-45-7256'),(43,'Obao','Highlander','653-39-4515'),(44,'Horse Epithelium','Celica','420-45-1463'),(45,'NITRO-DUR','Corvette','705-83-9424'),(46,'Diltiazem Hydrochloride','Firebird','878-36-2567'),(47,'Aspirin','Sephia','287-76-1986'),(48,'Clonazepam','Eldorado','153-37-7942'),(49,'Hemorrhoidal Hygiene pads','F-Series','784-46-2302'),(50,'Oxygen-Helium Mixture','Odyssey','518-60-1147');
/*!40000 ALTER TABLE `mouse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `serviceorder`
--

DROP TABLE IF EXISTS `serviceorder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `serviceorder` (
  `idserviceorder` int NOT NULL AUTO_INCREMENT,
  `idcomputer1` int DEFAULT NULL,
  `idcomputer2` int DEFAULT NULL,
  `idcomputer3` int DEFAULT NULL,
  `idcomputer4` int DEFAULT NULL,
  `idcomputer5` int DEFAULT NULL,
  PRIMARY KEY (`idserviceorder`),
  KEY `idcomputer1_idx` (`idcomputer1`),
  KEY `idcomputer2_idx` (`idcomputer2`),
  KEY `idcomputer3_idx` (`idcomputer3`),
  KEY `idcomputer4_idx` (`idcomputer4`),
  KEY `idcomputer5_idx` (`idcomputer5`),
  CONSTRAINT `idcomputer1` FOREIGN KEY (`idcomputer1`) REFERENCES `computer` (`idcomputer`),
  CONSTRAINT `idcomputer2` FOREIGN KEY (`idcomputer2`) REFERENCES `computer` (`idcomputer`),
  CONSTRAINT `idcomputer3` FOREIGN KEY (`idcomputer3`) REFERENCES `computer` (`idcomputer`),
  CONSTRAINT `idcomputer4` FOREIGN KEY (`idcomputer4`) REFERENCES `computer` (`idcomputer`),
  CONSTRAINT `idcomputer5` FOREIGN KEY (`idcomputer5`) REFERENCES `computer` (`idcomputer`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `serviceorder`
--

LOCK TABLES `serviceorder` WRITE;
/*!40000 ALTER TABLE `serviceorder` DISABLE KEYS */;
INSERT INTO `serviceorder` VALUES (1,1,2,3,4,5),(2,3,NULL,NULL,NULL,NULL),(3,1,2,3,4,5);
/*!40000 ALTER TABLE `serviceorder` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-21  0:55:35
