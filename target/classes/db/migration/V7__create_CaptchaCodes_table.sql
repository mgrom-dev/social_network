create table captcha_codes (
    id int8 PRIMARY KEY AUTO_INCREMENT,
    time timestamp not null,
    code varchar(255) not null,
    secret_code varchar(255) not null
)