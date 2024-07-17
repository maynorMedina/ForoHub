create table topicos(
    id bigint not null auto_increment,
    titulo varchar(100) not null unique,
    mensaje varchar(500) not null,
    fecha_creacion varchar(50) not null,
    status varchar(20) not null,
    autor varchar(100) not null,
    curso varchar(80)not null,
    primary key(id)
);