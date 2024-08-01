
-- Dumping database structure for jpademos
drop database IF EXISTS jpademos;
create database jpademos;
use jpademos;


-- Dumping structure for table jpademos.employee
DROP TABLE IF EXISTS employee;
CREATE TABLE IF NOT EXISTS employee (
  employeeId int(11) unsigned NOT NULL AUTO_INCREMENT,
  name varchar(20) DEFAULT NULL,
  role varchar(20) DEFAULT NULL,
  insert_time datetime DEFAULT NULL,
  salary double DEFAULT NULL,
  PRIMARY KEY (employeeId)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

INSERT INTO employee (employeeId, name, role, insert_time, salary) VALUES
	(1001, 'MSD', 'Sr.Analyst', '2016-01-28 00:00:00', 100000),
	(1002, 'James', 'Sr.Analyst', '2016-01-28 00:00:00', 0),
	(1003, 'Rocky', 'Sr.Analyst', '2016-01-28 00:00:00', 100000);
commit;
