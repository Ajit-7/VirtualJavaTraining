drop database IF EXISTS jpademos;
create database jpademos;
use jpademos;

-- Dumping structure for table hibernatedemos.employee
DROP TABLE IF EXISTS Employee_Composite_Key;

CREATE TABLE IF NOT EXISTS Employee_Composite_Key (
  id int(11) unsigned NOT NULL AUTO_INCREMENT,
  departmentid int(11) not null,
  name varchar(20) DEFAULT NULL,
  role varchar(20) DEFAULT NULL,
  inserttime datetime DEFAULT NULL,
  salary double DEFAULT NULL,
  PRIMARY KEY (id,departmentid)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

INSERT INTO Employee_Composite_Key (id, departmentID,name, role, inserttime, salary) VALUES
	(1001, 301,'MSD', 'Sr.Analyst', '2016-01-28 00:00:00', 100000),
	(1002, 301,'James', 'Sr.Analyst', '2016-01-28 00:00:00', 0),
	(1003, 302,'Rocky', 'Sr.Analyst', '2016-01-28 00:00:00', 100000);
commit;
