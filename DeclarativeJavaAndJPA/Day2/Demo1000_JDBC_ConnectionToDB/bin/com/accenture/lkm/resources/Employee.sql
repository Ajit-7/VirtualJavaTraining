-- Dumping database structure for JDBCdemos
drop database IF EXISTS jdbcdemos;
create database jdbcdemos;
use jdbcdemos;


-- Dumping structure for table jdbcdemos.employee
DROP TABLE IF EXISTS employee;
CREATE TABLE employee (
  employeeId int(11) unsigned NOT NULL AUTO_INCREMENT,
  employeeName varchar(20) DEFAULT NULL,
  role varchar(20) DEFAULT NULL,
  insertTime datetime DEFAULT NULL,
  salary double DEFAULT NULL,
  PRIMARY KEY (employeeId)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

INSERT INTO employee (employeeId, employeeName, role, insertTime, salary) VALUES
	(1001, 'MSD', 'Sr.Analyst', '2016-01-28 00:00:00', 100000),
	(1002, 'James', 'Sr.Analyst', '2016-01-28 00:00:00', 0),
	(1003, 'Rocky', 'Sr.Analyst', '2016-01-28 00:00:00', 100000);
commit;
