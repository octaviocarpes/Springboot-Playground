# Springboot Daily Tasks API - Login Service
In this project i made a Daily Tasks API with Springboot and Java. In this directory is the Login Service.

## Resources:
<p>This project was made with MySQL server so is necessary to do somethings before running it</p>
<ul>
    <li>
        <p>You first need to create an schema with the name <strong>dailytasks</strong> and set the application.properties to something like this:<br><br>
            spring.jpa.hibernate.ddl-auto=create<br>
            server.port=8080<br>
            spring.datasource.url=jdbc:mysql://localhost:3306/dailytasks<br>
            spring.datasource.username=root<br>
            spring.datasource.password=senha</p>
    </li>
    <li><p>After that just create a table with these data </p>
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
