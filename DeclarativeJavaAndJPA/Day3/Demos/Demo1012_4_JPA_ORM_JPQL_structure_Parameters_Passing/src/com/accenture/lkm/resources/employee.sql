
-- Dumping database structure for hibernatedemos
drop database IF EXISTS jpademos;
create database jpademos;
use jpademos;


-- Dumping structure for table hibernatedemos.employee
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
	(1001, 'MSD',    'Sr.Analyst', '2016-01-08 00:00:00', 60000),
	(1002, 'James',  'Sr.Analyst', '2011-02-02 00:00:00', 50000),
	(1003, 'Rocky',  'Sr.Analyst', '2016-02-13 00:00:00', 40000),
	(1004, 'Tim',    'Sr.Analyst', '2012-02-14 00:00:00', 40000),
	(1005, 'Dan',    'Sr.Analyst', '2016-03-19 00:00:00', 30000),
	(1006, 'Mario',  'Sr.Analyst', '2013-04-13 00:00:00', 70000),
	(1007, 'Stuart', 'Sr.Analyst', '2016-05-14 00:00:00', 60000),
	(1008, 'Jacob',  'Sr.Analyst', '2018-06-19 00:00:00', 56000),
	(1009, 'Hayden', 'Sr.Analyst', '2017-01-19 00:00:00', 540000);
commit;
