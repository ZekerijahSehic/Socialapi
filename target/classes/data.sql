insert into Location(id, name) values(1, 'Sarajevo, Bosnia and Herzegovina');
insert into Location(id, name) values(2, 'Zagreb, Croatia');
insert into Location(id, name) values(3, 'Ljubljana, Slovenia');

insert into User(id, name, username, email, location_id) values(1, 'Ajwa', 'Wilcox', 'ajwaw@gmail.com', 1);
insert into User(id, name, username, email, location_id) values(2, 'Weronika', 'Le', 'werle@gmail.com', 2);
insert into User(id, name, username, email, location_id) values(3, 'Saara', 'Hope', 'shope@gmail.com', 3);
insert into User(id, name, username, email, location_id) values(4, 'Alberto', 'Goff', 'aGoff@gmail.com', 1);
insert into User(id, name, username, email, location_id) values(5, 'Ajwa', 'Allen', 'AAllen@gmail.com', 3);

insert into Post(id, postdate, details, user_id) values(1, CURRENT_TIMESTAMP(), 'Post like post', 1);
insert into Post(id, postdate, details, user_id) values(2, CURRENT_TIMESTAMP(), 'A beautiful post', 2);
insert into Post(id, postdate, details, user_id) values(3, CURRENT_TIMESTAMP(), 'Good old post', 3);
insert into Post(id, postdate, details, user_id) values(4, CURRENT_TIMESTAMP(), 'New good post', 1);
insert into Post(id, postdate, details, user_id) values(5, CURRENT_TIMESTAMP(), 'Brend new post', 2);


