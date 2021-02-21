create table global_settings (
    id int8 PRIMARY KEY AUTO_INCREMENT,
    code varchar(255) not null,
    name varchar(255) not null,
    value varchar(255) not null
)