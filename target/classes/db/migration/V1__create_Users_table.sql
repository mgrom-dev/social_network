create table users (
    id int8 PRIMARY KEY AUTO_INCREMENT,
    reg_time timestamp not null,
    name varchar(255) not null,
    email varchar(255) not null,
    password varchar(255) not null,
    photo varchar(255),
    code varchar(255),
    is_moderator boolean not null
)