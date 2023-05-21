create table companys(
    id bigint not null auto_increment,
    name varchar(150) not null,
    cnpj varchar(50) not null unique,
    cep varchar(9) not null,
    logradouro varchar(100) not null,
    numero varchar(20),
    bairro varchar(100) not null,
    complemento varchar(100),
    cidade varchar(50) not null,
    estado char(50) not null,

    primary key(id)

);
