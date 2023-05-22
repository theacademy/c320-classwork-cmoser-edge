CREATE DATABASE  IF NOT EXISTS `classroster`;
USE `classroster`;

--DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `studentId` int NOT NULL AUTO_INCREMENT,
  `cohort` varchar(45) NOT NULL,
  `added` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`studentId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;