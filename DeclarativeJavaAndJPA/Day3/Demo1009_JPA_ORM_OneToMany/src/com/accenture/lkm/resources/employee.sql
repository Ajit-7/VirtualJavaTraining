DROP DATABASE IF EXISTS `jpamappingdemos_one_to_many`;
CREATE DATABASE IF NOT EXISTS `jpamappingdemos_one_to_many`;
USE `jpamappingdemos_one_to_many`;

DROP TABLE IF EXISTS `employee`;
DROP TABLE IF EXISTS `company`;


CREATE TABLE IF NOT EXISTS `company` (
  `companyId` int(11) NOT NULL AUTO_INCREMENT,
  `companyName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`companyId`)
) ENGINE=InnoDB AUTO_INCREMENT=2001 DEFAULT CHARSET=utf8;


CREATE TABLE IF NOT EXISTS `employee` (
  `employeeId` int(11) NOT NULL AUTO_INCREMENT,
  `employeeName` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`employeeId`)
) ENGINE=InnoDB AUTO_INCREMENT=5003 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `employee_company`;
CREATE TABLE IF NOT EXISTS `employee_company` (
  `my_db_company_id` int(11) NOT NULL,
  `my_db_employee_id` int(11) NOT NULL,
  UNIQUE KEY `UK_tpvkbxwkmifbuvdxjiu9s7vh8` (`my_db_employee_id`),
  KEY `FK_63wj39796ayji08ertjd0fy60` (`my_db_company_id`),
  CONSTRAINT `FK_company_Id` FOREIGN KEY (`my_db_company_id`) REFERENCES `company` (`companyId`),
  CONSTRAINT `FK_employeeId` FOREIGN KEY (`my_db_employee_id`) REFERENCES `employee` (`employeeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `company` (`companyId`, `companyName`) VALUES
	(2001, 'MSD Corp');
	
INSERT INTO `employee` (`employeeId`, `employeeName`, `role`) VALUES
	(5001, 'Rohit', 'Sr.Analyst'),
	(5002, 'Kumar', 'Lead');
	
INSERT INTO `employee_company` (`my_db_company_id`, `my_db_employee_id`) VALUES
	(2001, 5001),
	(2001, 5002);	