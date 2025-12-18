create table items
(
    id        int auto_increment
        primary key,
    for_trade varchar(255) not null,
    manga_id  int          not null,
    price     int          not null,
    owner_id  int          not null
);


create table mangas
(
    id     int auto_increment
        primary key,
    title  varchar(255) not null,
    author varchar(255) not null
);


create table offers
(
    id           int auto_increment
        primary key,
    item_id      int not null,
    manga_id     int not null,
    from_user_id int not null,
    to_user_id   int null
);


create table trades
(
    id              int auto_increment
        primary key,
    buyer_id        int          not null,
    seller_id       int          not null,
    collection_item int          not null,
    executed_at     varchar(255) not null
);


create table users
(
    id       int auto_increment
        primary key,
    name     varchar(255) not null,
    username varchar(255) not null,
    password varchar(255) not null
);