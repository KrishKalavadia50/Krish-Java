create database Assessment;

use Assessment;

CREATE TABLE Student(
  ID INT PRIMARY KEY AUTO_INCREMENT,
  Fisrt_Name varchar(30) NOT NULL,
  Last_Name varchar(30) NOT NULL,
  Email varchar(30) NOT NULL,
  Mobile decimal(10,0) NOT NULL);