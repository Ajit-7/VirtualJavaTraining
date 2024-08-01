
-- Dumping database structure for jpamappingdemos
drop database IF EXISTS jpamappingdemos_onetoone_cascadetype1;
create database jpamappingdemos_onetoone_cascadetype1;
use jpamappingdemos_onetoone_cascadetype1;


-- Dumping structure for table jpamappingdemos.assets
DROP TABLE IF EXISTS assets;
CREATE TABLE `assets` (
  `assetId` int(11) NOT NULL AUTO_INCREMENT,
  `asset_brandname` varchar(255) DEFAULT NULL,
  `asset_name` varchar(255) DEFAULT NULL,
  `validityyears` int(11) DEFAULT NULL,
  PRIMARY KEY (`assetId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

INSERT INTO assets (assetId, asset_brandname,asset_name, validityyears) VALUES
	(1, 'Dell', 'laptop',3),
	(2, 'Jabra', 'headphone',2),
	(3, 'Jabra', 'earphone',2);
commit;

-- Dumping structure for table jpamappingdemos.employee
DROP TABLE IF EXISTS employee;
CREATE TABLE IF NOT EXISTS `employee` (
  `employeeId` int(11) NOT NULL AUTO_INCREMENT,
  `employeeName` varchar(255) DEFAULT NULL,
  `insert_time` date DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `assetId_fk` int(11) DEFAULT NULL UNIQUE,
  PRIMARY KEY (`employeeId`),
  KEY (`assetId_fk`),
  FOREIGN KEY (`assetId_fk`) REFERENCES `assets` (`assetId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

INSERT INTO employee (employeeId, employeeName, insert_time,role, salary,assetId_fk) VALUES
	(1001, 'MSD', '2016-01-28 00:00:00', 'Sr.Analyst', 100000,1),
	(1002, 'james', '2016-01-28 00:00:00', 'Sr.Analyst', 0,2),
	(1003, 'Rocky', '2016-01-28 00:00:00', 'Sr.Analyst', 100000,3);
commit;


