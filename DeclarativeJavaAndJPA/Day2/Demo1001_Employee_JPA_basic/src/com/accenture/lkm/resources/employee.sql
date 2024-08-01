-- Dumping database structure for jpademos
drop database IF EXISTS jpademos;
create database jpademos;
use jpademos;


-- Dumping structure for table jpademos.employee
CREATE TABLE employee (
  employeeId int(11) unsigned NOT NULL AUTO_INCREMENT,
  emp_name varchar(20) DEFAULT NULL,
  role varchar(20) DEFAULT NULL,
  insertTime datetime DEFAULT NULL,
  salary double DEFAULT NULL,
  PRIMARY KEY (employeeId)
);

INSERT INTO employee (employeeId, emp_name, role, insertTime, salary) VALUES
	(1001, 'MSD', 'Sr.Analyst', '2016-01-28 00:00:00', 100000),
	(1002, 'James', 'Sr.Analyst', '2016-01-28 00:00:00', 0),
	(1003, 'Rocky', 'Sr.Analyst', '2016-01-28 00:00:00', 100000);
commit;





