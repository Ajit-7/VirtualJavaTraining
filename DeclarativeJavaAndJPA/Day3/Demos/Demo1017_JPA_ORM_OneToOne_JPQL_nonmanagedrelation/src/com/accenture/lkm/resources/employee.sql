
-- Dumping database structure for jpamappingdemos
drop database IF EXISTS jpamappingdemos;
create database jpamappingdemos;
use jpamappingdemos;


-- Dumping structure for table jpamappingdemos.assets
DROP TABLE IF EXISTS assets;
CREATE TABLE `assets` (
  `assetId` int(11) NOT NULL AUTO_INCREMENT,
  `asset_brandname` varchar(255) DEFAULT NULL,
  `validityyears` int(11) DEFAULT NULL,
  PRIMARY KEY (`assetId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

INSERT INTO `assets` VALUES (1,'Dell',3),
							(2,'HP',3),
							(3,'HP2',3);

commit;

-- Dumping structure for table jpamappingdemos.employee
DROP TABLE IF EXISTS employee;
CREATE TABLE `employee` (
  `employeeId` int(11) NOT NULL AUTO_INCREMENT,
  `employeeName` varchar(255) DEFAULT NULL,
  `insert_time` date DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `assetId_FK` int(11) DEFAULT NULL,
  PRIMARY KEY (`employeeId`),
  UNIQUE KEY (`assetId_FK`),
  FOREIGN KEY (`assetId_FK`) REFERENCES `assets` (`assetId`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=latin1;

INSERT INTO `employee` VALUES 
(1001,'Rohit',  '2018-08-23', 'Sr.Analyst',200000,1),
(1002,'Roshan', '2018-08-23', 'Sr.Analyst',300000,2),
(1003,'Dan',    '2018-08-23', 'Sr.Analyst',300000,3);

commit;

