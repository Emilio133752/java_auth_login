CREATE DATABASE bd_usuarios;

USE bd_usuarios;


CREATE table usuario(
	id integer auto_increment primary key,
    nome_completo varchar(200) not null,
    username varchar(200) not null unique, 
    email varchar(50) not null unique,
    senha text not null,
    telefone varchar(15) not null
    );

    
    insert into usuario values (null, 'Emilio', 'emiliodev', 'emiliodev@gm.com', '123', '11966481829');
    
    SELECT * FROM usuario;
    USE bd_usuarios;
    
INSERT INTO usuario (id, nome_completo, username, email, senha, telefone) VALUES 
(NULL, 'Carlos Silva', 'carloss', 'carloss@gmail.com', 'senha123', '11987654321'),
(NULL, 'Mariana Souza', 'marianas', 'marianas@gmail.com', 'senha456', '11976543210'),
(NULL, 'João Oliveira', 'joaooli', 'joaooli@gmail.com', 'senha789', '11965432109'),
(NULL, 'Ana Pereira', 'anap', 'anap@gmail.com', 'senha147', '11954321098'),
(NULL, 'Ricardo Mendes', 'ricardom', 'ricardom@gmail.com', 'senha258', '11943210987'),
(NULL, 'Beatriz Lima', 'bia_lima', 'bialima@gmail.com', 'senha369', '11932109876'),
(NULL, 'Lucas Alves', 'lucasal', 'lucasal@gmail.com', 'senha159', '11921098765'),
(NULL, 'Fernanda Costa', 'fernandac', 'fernandac@gmail.com', 'senha753', '11910987654'),
(NULL, 'Roberto Nunes', 'roberton', 'roberton@gmail.com', 'senha852', '11999887766'),
(NULL, 'Juliana Martins', 'julianam', 'julianam@gmail.com', 'senha951', '11988776655'),
(NULL, 'Eduardo Santos', 'eduardos', 'eduardos@gmail.com', 'senha357', '11977665544'),
(NULL, 'Vanessa Rocha', 'vanessar', 'vanessar@gmail.com', 'senha654', '11966554433'),
(NULL, 'Gabriel Lima', 'gabriell', 'gabriell@gmail.com', 'senha741', '11955443322'),
(NULL, 'Camila Ferreira', 'camilaf', 'camilaf@gmail.com', 'senha852', '11944332211'),
(NULL, 'Daniel Souza', 'daniels', 'daniels@gmail.com', 'senha963', '11933221100'),
(NULL, 'Larissa Barbosa', 'larissab', 'larissab@gmail.com', 'senha147', '11922110099'),
(NULL, 'Marcelo Andrade', 'marceloa', 'marceloa@gmail.com', 'senha258', '11911009988'),
(NULL, 'Tatiane Silva', 'tatianes', 'tatianes@gmail.com', 'senha369', '11900998877'),
(NULL, 'Felipe Moreira', 'felipem', 'felipem@gmail.com', 'senha951', '11899887766'),
(NULL, 'Patrícia Mendes', 'patriciam', 'patriciam@gmail.com', 'senha753', '11888776655');
