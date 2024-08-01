
-- Dumping database structure for jpademos
drop database IF EXISTS jpademos;
create database jpademos;
use jpademos;


-- Dumping structure for table jpademos.employee
DROP TABLE IF EXISTS employee;
CREATE TABLE IF NOT EXISTS employee (
  employeeId int(11) unsigned NOT NULL AUTO_INCREMENT,
  employeeName varchar(20) DEFAULT NULL,
  salary double DEFAULT NULL,
  PRIMARY KEY (employeeId)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

INSERT INTO employee (employeeId, employeeName, salary) VALUES
	(1001, 'MSD', 100000),
	(1002, 'James', 0),
	(1003, 'Rocky', 100000);
commit;
