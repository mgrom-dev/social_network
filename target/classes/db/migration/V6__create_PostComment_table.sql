create table post_comments (
    id int8 PRIMARY KEY AUTO_INCREMENT,
    parent_id int8,
    post_id int8 not null,
    user_id int8 not null,
    time timestamp not null,
    text varchar(255) not null
)