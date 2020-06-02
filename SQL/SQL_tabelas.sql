create database vmperuse;
CREATE TABLE IF NOT EXISTS `vmPerUse`.`tbl_usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `racf` VARCHAR(6) NOT NULL COMMENT 'Será uma das chaves de acesso ao sistema.',
  `email` VARCHAR(100) NOT NULL COMMENT 'será uma das chaves de acesso ao sistema.',
  `funcional` VARCHAR(9) NOT NULL,
  `senha` VARCHAR(12) NULL,
  `nome` VARCHAR(100) NULL,
  `departamento` VARCHAR(100) NULL,
  `cargo` VARCHAR(50) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `racf_UNIQUE` (`racf` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  UNIQUE INDEX `funcional_UNIQUE` (`funcional` ASC) VISIBLE);
use vmperuse;
INSERT INTO `vmperuse`.`tbl_usuario`
(`id`,
`racf`,
`email`,
`funcional`,
`senha`,
`nome`,
`departamento`,
`cargo`)
VALUES
(null,
'test004',
'test004@teste.com',
'001112224',
'1234',
'teste004 da silva',
'Operação Mainframe',
'Operador');
use vmperuse;
desc tbl_usuario;
INSERT INTO `vmperuse`.`tbl_solicitacoes`
(`num_solcitacao`,
`data`,
`observacoes`,
`solicitante_id`)
VALUES
(null,
'2020-05-18',
'solicitação 3',
2);
select * from tbl_usuario;
select * from tbl_solicitacao;
select * from tbl_item;
select * from tbl_componente;
desc tbl_solicitacao;
desc tbl_item;
UPDATE `vmperuse`.`tbl_usuario`
SET
`departamento` = null,
`linkfoto` ='//imagens/foto'
WHERE `id` = 1;
SELECT * FROM TBL_SOLICITACAO WHERE SOLICITANTE_ID = 2;
SELECT * FROM TBL_SOFTWARE;
INSERT INTO `vmperuse`.`tbl_componente` (`id`,`tipo`,`nome`,`fornecedor`,`custo`) VALUES (null,'software','PostgreSQL','PostgreSQL',0.00);
INSERT INTO `vmperuse`.`tbl_componente` (`id`,`tipo`,`nome`,`fornecedor`,`custo`) VALUES (null,'software','MySQL','Oracle',0.00);
INSERT INTO `vmperuse`.`tbl_componente` (`id`,`tipo`,`nome`,`fornecedor`,`custo`) VALUES (null,'software','SQL Server','Microsoft',0.15);
INSERT INTO `vmperuse`.`tbl_componente` (`id`,`tipo`,`nome`,`fornecedor`,`custo`) VALUES (null,'software','Windows Server','Microsoft',0.20);
INSERT INTO `vmperuse`.`tbl_componente` (`id`,`tipo`,`nome`,`fornecedor`,`custo`) VALUES (null,'software','Ubuntu Server','Canonical',0.00);
INSERT INTO `vmperuse`.`tbl_componente` (`id`,`tipo`,`nome`,`fornecedor`,`custo`) VALUES (null,'hardware','processador','IBM',0.05);
INSERT INTO `vmperuse`.`tbl_componente` (`id`,`tipo`,`nome`,`fornecedor`,`custo`) VALUES (null,'hardware','memoria','outras',0.02);
INSERT INTO `vmperuse`.`tbl_componente` (`id`,`tipo`,`nome`,`fornecedor`,`custo`) VALUES (null,'hardware','armazenamento','outras',0.03);
INSERT INTO `vmperuse`.`tbl_componente` (`id`,`tipo`,`nome`,`fornecedor`,`custo`) VALUES (null,'hardware','rede','outras',0.02);
INSERT INTO `vmperuse`.`tbl_usuario`
(`id`,
`cargo`,
`departamento`,
`email`,
`funcional`,
`linkfoto`,
`nome`,
`racf`,
`senha`)
VALUES
(null,
'Analista de Produção',
'Operação',
'test002@teste.com.br',
'001112222',
'funcionario2.png',
'Teste02 da Silva',
'test002',
'1234');
