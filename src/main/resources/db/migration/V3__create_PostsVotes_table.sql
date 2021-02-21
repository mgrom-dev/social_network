create table post_votes (
    id int8 PRIMARY KEY AUTO_INCREMENT,
    time timestamp not null,
    post_id int8 not null,
    user_id int8 not null,
    value int
)