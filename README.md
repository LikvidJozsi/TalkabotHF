# TalkabotHF

A projektet tomcat 7.0-val futtattam. Setup:
A mysql java connectort bemásoltam a Tomcat/lib/-be és a server.xml-ben beállítottam a pathot a maven install által használt
kimeneti mappára.

MySQL 8.0-t használtam. Az alábbi sql parancsokat használtam a setuphoz:

CREATE DATABASE helloworld;
USE helloworld;

CREATE TABLE GREETING(
    id INT NOT NULL auto_increment, 
    text VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);
INSERT INTO GREETING VALUES(1,"Hello World!");

A működést az alábbi URL-el teszteltem:

http://localhost:8080/HelloWorld/greeting/1
