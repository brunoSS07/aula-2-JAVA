# cria um banco de dados
create database bd_itau;

# marca o BD como padrao
use bd_itau;

# criar tabela no BD
create table carro(
	codigo integer not null auto_increment,
    marca varchar(50) not null,
    modelo varchar(100) not null,
    anoFabricacao integer,
    constraint pk_carro primary key(codigo)
);
# primary key serve para identificar unicamente uma linha na tabela
# foreign key serve para relacionar as tabelas
create table cliente(
		codigo integer not null auto_increment,
        nome varchar(120) not null, 
        telefone varchar(15) not null unique,
        cod_carro integer,
        constraint pk_cliente primary key(codigo),
        constraint fk_carro foreign key(cod_carro) references carro(codigo)
);

# inserir dados na tabela
insert into carro values(
null,"Chevrolet", "Cruze", 2000
);
insert into carro values(
null,"Fiat", "Palio", 2005
);
insert into carro values(
null,"WV", "Gol", 2010
);

insert into cliente values(
	null, "Bruno da Silva", "(11) 99999-9999",1
);

insert into cliente values(
	null, "Maria", "(11) 99999-5555",2
);

insert into cliente values(
	null, "Joao", "(11) 91234-5555",3
);
insert into cliente values(
	null, "Jose", "(11) 91646-7777",2
);

# listar todos os clientes
select * from cliente;

# buscar todas as informacos da tabela
select*from carro;

# busque apenas a marca, modelo e ano
select marca, modelo, anoFabricacao from carro;

# busque as informacoes de carros fabricados apos o ano de 2006
select * from carro where anoFabricacao > 2006;

# select <quais colunas>
# from <qual(is) tabela(s)>
# where <condicao>

# Listar todos os carros co seus proprietarios
select * from carro inner join cliente on carro.codigo = cliente.cod_carro;

# alteracao de dados

#alterar telefone do cliente tal....

update cliente
set telefone = "(21) 32442-5466"
where codigo = 1;

# apagar dados

#apagar um dado do banco

delete from  cliente where codigo = 4;

delete
from carro
where codigo =3;