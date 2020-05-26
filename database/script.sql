create table category
(
    category_id          int auto_increment
        primary key,
    category_name        varchar(50) not null,
    category_description text        null
);

create table product
(
    category_id   int                                          not null,
    product_id    int auto_increment
        primary key,
    product_name  varchar(100) default 'Sản phẩm không có tên' not null,
    product_price int                                          null,
    quantity      int                                          null,
    color         varchar(20)  default 'Không màu'             null,
    description   text                                         null,
    constraint product_fk_category
        foreign key (category_id) references category (category_id)
);


