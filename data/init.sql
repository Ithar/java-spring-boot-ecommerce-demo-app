/*
>  docker container exec -it mysql bash

># mysql -uroot -pmysql_pwd
># use db;
 */

CREATE  TABLE users (
  id int(11) NOT NULL AUTO_INCREMENT,
  username VARCHAR(45) NOT NULL ,
  password VARCHAR(60) NOT NULL ,
  active TINYINT NOT NULL DEFAULT 1 ,
  PRIMARY KEY (id));

CREATE TABLE user_roles (
  user_role_id int(11) NOT NULL AUTO_INCREMENT,
  user_id int(11) NOT NUll,
  role varchar(45) NOT NULL,
  PRIMARY KEY (user_role_id),
  CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES users (id));

INSERT INTO users(username,password,active) VALUES ('Admin','$2a$10$P9LQGD1Q5jYd58i.Jd8ws.9BLMn.vV8LyZwAs9tdmXwfaC67q7muS', true);
INSERT INTO users(username,password,active) VALUES ('Jane','$2a$10$cvs7kNTeVaFbdDSFcVT9ze3muPVSHQMMZTZ89ontNSCRMXT4CmRM2', true);

INSERT INTO user_roles (user_id, role) VALUES (1, 'ROLE_USER');
INSERT INTO user_roles (user_id, role) VALUES (1, 'ROLE_ADMIN');
INSERT INTO user_roles (user_id, role) VALUES (2, 'ROLE_USER');

