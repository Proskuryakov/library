insert into country(name)
values ('Россия');
insert into country(name)
values ('Англия');

insert into city(name, country_id)
values ('Воронеж', (select id from country c where c.name = 'Россия'));
insert into city(name, country_id)
values ('Москва', (select id from country c where c.name = 'Россия'));
insert into city(name, country_id)
values ('Стратфорд-апон-Эйвон', (select id from country c where c.name = 'Англия'));

insert into author(fio, city_id)
values ('Платонов Андрей Платонович', (select id from city c where c.name = 'Воронеж'));
insert into author(fio, city_id)
values ('Уильям Шекспир', (select id from city c where c.name = 'Стратфорд-апон-Эйвон'));

insert into pub_house(name, city_id)
values ('ФТМ', (select id from city c where c.name = 'Москва'));

insert into location(building, sector, shelf, bookshelf)
values ('Главный корпус', 'А', 1, 1),
       ('Главный корпус', 'А', 1, 2),
       ('Главный корпус', 'А', 1, 3),
       ('Главный корпус', 'А', 1, 4);

insert into location(building, sector, shelf, bookshelf)
values ('Главный корпус', 'А', 2, 1),
       ('Главный корпус', 'А', 2, 2),
       ('Главный корпус', 'А', 2, 3),
       ('Главный корпус', 'А', 2, 4);

insert into book(id, name, year, page_count, description, pub_house_id, location_id)
values ('91196d3b-4373-4dae-bd46-9c33b712047d', 'Дураки на периферии', 2017, 149,
        'В доме Башмаковых появляется комиссия Охматмлада - Мария Ивановна беременна, а новый ребёнок подорвёт бюджет уже многодетного отца Ивана Павловича, её мужа. Декретами постановлено заводить детей при любых обстоятельствах, супругам отказано в аборте. Иван Павлович продолжает борьбу за семейное благосостояние, требуя признать родителем того, кто решил, что ребёнок родится, то есть - комиссию по охране матерей.',
        (select id from pub_house ph where ph.name = 'ФТМ'),
        (select id from location l where l.building = 'Главный корпус' and shelf = 1 and bookshelf = 1));

insert into book(id, name, year, page_count, description, pub_house_id, location_id)
values ('cb792578-2a92-4eb5-9d81-f8211f600ef4', 'Ромео и Джульетта', 2015, 164,
        'Самая знаменитая трагедия Шекспира о любви. Между знатными веронскими семействами Монтекки и Капулетти идет давняя вражда. Однако дети их не пали жертвой ненависти и кровожадности. Юный Ромео Монтекки влюбляется в прекрасную Джульетту Капулетти, и их чувство, словно хрупкий цветок, раскрывается на фоне междоусобицы.',
        (select id from pub_house ph where ph.name = 'ФТМ'),
        (select id from location l where l.building = 'Главный корпус' and shelf = 1 and bookshelf = 4));

insert into genre(name)
values ('Трагедия'),
       ('Драма');

insert into book_genre
values ('91196d3b-4373-4dae-bd46-9c33b712047d', (select id from genre g where g.name = 'Драма')),
       ('cb792578-2a92-4eb5-9d81-f8211f600ef4', (select id from genre g where g.name = 'Трагедия'));

insert into book_author
values ('91196d3b-4373-4dae-bd46-9c33b712047d', (select id from author a where a.fio = 'Платонов Андрей Платонович')),
       ('cb792578-2a92-4eb5-9d81-f8211f600ef4', (select id from author a where a.fio = 'Уильям Шекспир'));