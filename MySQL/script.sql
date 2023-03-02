CREATE DATABASE football;

USE football;

	CREATE TABLE actus (
  	id INT NOT NULL AUTO_INCREMENT,
  	title VARCHAR(125),
  	date VARCHAR(125),
  	image_id INT,
	PRIMARY KEY (id))
	ENGINE=INNODB ;

	CREATE TABLE images(
	id INT NOT NULL AUTO_INCREMENT,
	image LONGBLOB,
	PRIMARY KEY (id))
	ENGINE=INNODB ;

	CREATE TABLE user(
	id INT NOT NULL AUTO_INCREMENT,
	username VARCHAR(20),
	password VARCHAR(500),
	PRIMARY KEY (id))
	ENGINE=INNODB ;


	ALTER TABLE actus 
	ADD FOREIGN KEY (image_id) REFERENCES images (id) ;

	INSERT INTO user (username, password) values ('clement', '$2y$10$.KNalyP/53i2VdNX7gDcAO1ddm.2gJbrLKwtHYtJcGuSaB6oQGLm2');


