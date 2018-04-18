CREATE DATABASE db_judo;

use db_judo;





CREATE TABLE pessoa (Id_pessoa INT NOT NULL AUTO_INCREMENT, nome_completo VARCHAR(50) NOT NULL, nome_mae varchar(50) NOT NULL, nome_pai VARCHAR (50),

telefone INT NOT NULL, graduacao_atual VARCHAR(50) NOT NULL, data_outorga DATE NOT NULL, curriculun VARCHAR(80), foto3x4 VARCHAR(50) NOT NULL, cpf INT NOT NULL, 

CONSTRAINT um_IdP UNIQUE (Id_pessoa), CONSTRAINT pk_tbpessoa PRIMARY KEY (Id_pessoa));



CREATE TABLE academia (Id_academia INT NOT NULL AUTO_INCREMENT, professor_responsavel VARCHAR(50) NOT NULL, estado VARCHAR(50) NOT NULL, cep INT NOT NULL,

cidade VARCHAR(50) NOT NULL, bairro VARCHAR(50) NOT NULL, rua VARCHAR(50) NOT NULL, numero INT NOT NULL,

CONSTRAINT um_IdP UNIQUE (Id_academia), CONSTRAINT pk_tbacademia PRIMARY KEY (Id_academia));



CREATE TABLE aluno (Id_aluno INT NOT NULL AUTO_INCREMENT, 

CONSTRAINT um_IdP UNIQUE (Id_aluno), CONSTRAINT pk_tbaluno PRIMARY KEY (Id_aluno));

ALTER TABLE aluno ADD COLUMN Id_pessoaFK INT NOT NULL;

ALTER TABLE aluno ADD FOREIGN KEY (Id_pessoaFK) REFERENCES pessoa (Id_pessoa);

ALTER TABLE aluno ADD COLUMN Id_academiaFK INT NOT NULL;

ALTER TABLE aluno ADD FOREIGN KEY (Id_academiaFK) REFERENCES academia (Id_academia);



CREATE TABLE professor (Id_professor INT NOT NULL AUTO_INCREMENT,  locais_de_trabalho VARCHAR(50) NOT NULL, vinculo_com_academia VARCHAR(50) NOT NULL,

CREF INT NOT NULL, CONSTRAINT um_IdP UNIQUE (Id_professor), CONSTRAINT pk_tbprofessor PRIMARY KEY (Id_professor));

ALTER TABLE professor ADD COLUMN Id_pessoaFK INT NOT NULL;

ALTER TABLE professor ADD FOREIGN KEY (Id_pessoaFK) REFERENCES pessoa (Id_pessoa);

ALTER TABLE professor ADD COLUMN Id_academiaFK INT NOT NULL;

ALTER TABLE professor ADD FOREIGN KEY (Id_academiaFK) REFERENCES academia (Id_academia);