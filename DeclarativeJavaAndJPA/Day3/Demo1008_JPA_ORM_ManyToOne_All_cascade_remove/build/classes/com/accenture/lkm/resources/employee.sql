
-- Dumping database structure for jpamappingdemos
drop database IF EXISTS jpamappingdemos_many_to_one_cascade_all;
create database jpamappingdemos_many_to_one_cascade_all;
use jpamappingdemos_many_to_one_cascade_all;

-- Dumping structure for table jpamappingdemos.department
DROP TABLE IF EXISTS department ;
CREATE TABLE `department` (
  `departmentId` int(11) NOT NULL AUTO_INCREMENT,
  `city` varchar(255) DEFAULT NULL,
  `departmentName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`departmentId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

insert into department (departmentId, city, departmentName) values (2,'Hyderabad','HR'),
									(3,'Bangalore','Finance');

commit;

-- Dumping structure for table jpamappingdemos.employee
DROP TABLE IF EXISTS employee;
CREATE TABLE `employee` (
  `employeeId` int(11) NOT NULL AUTO_INCREMENT,
  `employeeName` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `departmentId_fk` int(11) DEFAULT NULL,
  PRIMARY KEY (`employeeId`),
  KEY `FK_5dwqg1fgngu5rx7c6roqpnxrn` (`departmentId_fk`),
  CONSTRAINT `FK_5dwqg1fgngu5rx7c6roqpnxrn` FOREIGN KEY (`departmentId_fk`) REFERENCES `department` (`departmentId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;


INSERT INTO employee (employeeId, employeeName, role,departmentId_fk) VALUES
	(1001, 'MSD', 'Sr.Analyst',2),
	(1002, 'James', 'Analyst',2),
	(1003, 'Rocky', 'Sr.Analyst',3);
commit;

