DROP TABLE IF EXISTS users;

CREATE TABLE users (   
  id int NOT NULL PRIMARY KEY,
  nome VARCHAR(30) NOT NULL,
  personalidade VARCHAR(1) NOT NULL,
  cpf VARCHAR(12) NOT NULL,
  rg VARCHAR(10) NOT NULL,
  cnpj VARCHAR(18) NOT NULL,
  ie VARCHAR(15) NOT NULL,
  ativo VARCHAR(1) NOT NULL,
  ddd1 VARCHAR(2) NOT NULL,
  ddd2 VARCHAR(2) NOT NULL,
  ddd3 VARCHAR(2) NOT NULL,
  tel1 VARCHAR(9) NOT NULL,
  tel2 VARCHAR(9) NOT NULL,
  tel3 VARCHAR(9) NOT NULL,
  data VARCHAR(10) NOT NULL
);

INSERT INTO users (id, nome, personalidade, cpf, rg, cnpj, ie, ativo, ddd1, ddd2, ddd3, tel1, tel2, tel3, data) VALUES
  (1, 'primeiro', 'F', 'CPF1111111', 'RG1111', 'CNPJ1', 'IE11111','A','11','11','11','1111111A','1111111B','1111111C','11/11/1111'),
  (2, 'segundo', 'F', 'CPF222222', 'RG2222', 'CNPJ2', 'IE2222',' ','22','22','22','2222222A','2222222B','2222222C','22/11/2222'),
  (3, 'terceiro', 'J', 'CPF33333', 'RG3333', 'CNPJ3', 'IE33333','A','33','33','33','3333333A','3333333B','3333333C','33/11/3333');

