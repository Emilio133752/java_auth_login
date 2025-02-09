CREATE DATABASE bd_usuarios;

USE bd_usuarios;


CREATE table usuarios(
	id integer auto_increment primary key,
    nome_completo varchar(200) not null,
    username varchar(200) not null unique, 
    email varchar(50) not null unique,
    senha text not null,
    telefone varchar(15) not null
    );
    
    insert into usuarios values (null, 'Emilio', 'emiliodev', 'emiliodev@gm.com', '123', '11966481829');
    alter TABLE usuarios RENAME TO  usuario;
    
    SELECT * FROM usuario;