
-- Dumping database structure for jpamappingdemos_onetoone
drop database IF EXISTS jpamappingdemos_onetoone;
create database jpamappingdemos_onetoone;
use jpamappingdemos_onetoone;

DROP TABLE IF EXISTS assets cascade;
DROP TABLE IF EXISTS employee cascade;

-- Dumping structure for table jpamappingdemos_onetoone.assets

CREATE TABLE `assets` (
  `assetId` int(11) NOT NULL AUTO_INCREMENT,
  `asset_brandname` varchar(255) DEFAULT NULL,
  `asset_name` varchar(255) DEFAULT NULL,
  `validityyears` int(11) DEFAULT NULL,
  PRIMARY KEY (`assetId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;


-- Dumping structure for table jpamappingdemos_onetoone.employee
CREATE TABLE IF NOT EXISTS `employee` (
  `employeeId` int(11) NOT NULL AUTO_INCREMENT,
  `employeeName` varchar(255) DEFAULT NULL,
  `insert_time` date DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `assetId_fk` int(11) DEFAULT NULL UNIQUE,
  PRIMARY KEY (`employeeId`),
  FOREIGN KEY (`assetId_fk`) REFERENCES `assets` (`assetId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

INSERT INTO assets (assetId, asset_brandname,asset_name, validityyears) VALUES
	(10001, 'Dell', 'laptop',3),
	(10002, 'Jabra', 'headphone',2),
	(10003, 'Jabra', 'earphone',3);
commit;


INSERT INTO employee (employeeId, employeeName, insert_time,role, salary,assetId_fk) VALUES
	(1001, 'MSD', '2016-01-28 00:00:00', 'Sr.Analyst', 100000,10001),
	(1002, 'james', '2016-01-28 00:00:00', 'Sr.Analyst', 0,10002),
	(1003, 'Rocky', '2016-01-28 00:00:00', 'Sr.Analyst', 100000,10003);
commit;


