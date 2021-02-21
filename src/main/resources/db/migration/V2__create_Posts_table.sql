create table posts (
    id int8 PRIMARY KEY AUTO_INCREMENT,
    time timestamp not null,
    moderator_id int8 not null,
    user_id int8 not null,
    title varchar(255) not null,
    text varchar(255) not null,
    view_count int4 not null,
    moderation_status varchar(255) not null,
    is_active boolean not null
)