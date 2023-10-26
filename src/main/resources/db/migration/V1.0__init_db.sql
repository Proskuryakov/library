create table country
(
    id   serial primary key,
    name text not null unique
);

create table city
(
    id         serial primary key,
    name       text not null,
    country_id int  not null,

    foreign key (country_id) references country (id) on delete cascade
);

create table author
(
    id      serial primary key,
    fio     text not null,
    city_id int,

    foreign key (city_id) references city (id) on delete set null
);

create table pub_house
(
    id      serial primary key,
    name    text unique not null,
    city_id int         not null,

    foreign key (city_id) references city (id) on delete cascade
);

create table genre
(
    id   serial primary key,
    name text unique not null
);

create table location
(
    id        serial primary key,
    building  text,
    sector    text,
    shelf     int,
    bookshelf int
);
comment on column location.shelf is 'Стеллаж';
comment on column location.bookshelf is 'Полка';


create table book
(
    id           uuid default gen_random_uuid() primary key,
    name         text not null,
    year         numeric(4, 0),
    page_count   int,
    description  text,
    pub_house_id int,
    location_id  int,

    foreign key (pub_house_id) references pub_house (id) on delete set null,
    foreign key (location_id) references location (id) on delete set null
);

create table book_genre
(
    book_id  uuid,
    genre_id int,

    primary key (book_id, genre_id)
);

create table book_author
(
    book_id   uuid,
    author_id int,

    primary key (book_id, author_id)
);

create table reader
(
    id    uuid default gen_random_uuid() primary key,
    fir   text not null,
    phone text unique
);

create table book_reader
(
    id         uuid          default gen_random_uuid() primary key,
    book_id    uuid not null,
    reader_id  uuid not null,
    start_date date not null default now(),
    end_date   date not null default now() + interval '14 days',
    final_date date,

    foreign key (book_id) references book (id) on delete cascade,
    foreign key (reader_id) references reader (id) on delete cascade
);