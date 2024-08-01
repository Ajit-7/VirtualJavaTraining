
-- Dumping database structure for jpamappingdemos
drop database IF EXISTS jpamappingdemos_many_to_many;
create database jpamappingdemos_many_to_many;
use jpamappingdemos_many_to_many;

-- Dumping structure for table jpamappingdemos.meetings
DROP TABLE IF EXISTS meetings;
CREATE TABLE `meetings` (
  `meetingId` int(11) NOT NULL AUTO_INCREMENT,
  `timeslot` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`meetingId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

INSERT INTO meetings (meetingId, timeslot) VALUES
(1,'12.20PM-1.30PM'),
(2,'12.45PM-1.45PM'),
(3,'4.30PM -5.20PM'),
(4,'5.30PM -7.20PM');

commit;


-- Dumping structure for table jpamappingdemos.employee
DROP TABLE IF EXISTS employee;
CREATE TABLE `employee` (
  `employeeId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`employeeId`)
) ENGINE=InnoDB AUTO_INCREMENT=1009 DEFAULT CHARSET=latin1;

INSERT INTO employee (employeeId, name, role) VALUES
	(1001, 'MSD', 'Sr.Analyst'),
	(1002, 'James', 'Sr.Analyst'),
	(1003, 'Rocky', 'Sr.Analyst'),
	(1004, 'Dan', 'Lead');


commit;



-- Dumping structure for table jpamappingdemos.employee_meeting
DROP TABLE IF EXISTS employee_meeting;
CREATE TABLE `employee_meeting` (
  `my_db_employee_id` int(11) NOT NULL,
  `my_db_meeting_id` int(11) NOT NULL,
  PRIMARY KEY (`my_db_employee_id`,`my_db_meeting_id`),
  KEY (`my_db_meeting_id`),
  FOREIGN KEY (`my_db_employee_id`) REFERENCES `employee` (`employeeId`),
  FOREIGN KEY (`my_db_meeting_id`) REFERENCES `meetings` (`meetingId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO employee_meeting(my_db_employee_id, my_db_meeting_id) VALUES
(1001,1),
(1002,1),
(1003,1),
(1001,2),
(1002,2),
(1004,3),
(1004,4);

commit;
