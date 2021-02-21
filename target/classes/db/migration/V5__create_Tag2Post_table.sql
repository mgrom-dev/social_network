create table tag2post (
    id int8 PRIMARY KEY AUTO_INCREMENT,
    post_id int8 not null,
    tag_id int8 not null
)