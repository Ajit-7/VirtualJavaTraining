
-- Dumping database structure for jpademos
drop database IF EXISTS jpademos;
create database jpademos;
use jpademos;


-- Dumping structure for table jpademos.employee
DROP TABLE IF EXISTS customer;
CREATE TABLE IF NOT EXISTS customer (
  customerId int(11) unsigned NOT NULL AUTO_INCREMENT,
  customerName varchar(20) DEFAULT NULL,
  purchaseDate datetime DEFAULT NULL,
  bill double DEFAULT NULL,
  PRIMARY KEY (customerId)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

INSERT INTO customer (customerId, customerName, purchaseDate, bill) VALUES
	(1001, 'MSD',    '2016-02-02 00:00:00', 3000),
	(1002, 'James',  '2016-01-02 00:00:00', 345),
	(1003, 'Dan',    '2016-03-28 00:00:00', 5000),
	(1004, 'Brown',  '2016-06-28 00:00:00', 3000),
	(1005, 'Tim',    '2016-02-13 00:00:00', 345),
	(1006, 'Jack',   '2016-04-15 00:00:00', 5000);
commit;
