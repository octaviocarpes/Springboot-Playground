# Springboot Daily Tasks API
In this project i made a Daily Tasks API with Springboot and Java.

## Resources:
<ul>
    <li>
       SQL Create User Table and Insert one User:<br> 
       CREATE TABLE users (<br><br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;user_id INT(6)  AUTO_INCREMENT PRIMARY KEY,<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;firstname VARCHAR(30) NOT NULL,<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;lastname VARCHAR(30) NOT NULL,<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;email VARCHAR(50),<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;username VARCHAR(50),<br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;password varchar(50)<br><br>
       );<br><br>     
       insert into users<br>
       values(1,'Octavio', 'Carpes', 'octavio.carpes@ilegra.com', 'octaviocarpes', 'superpassword');
    </li>
</ul>    