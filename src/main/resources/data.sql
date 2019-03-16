INSERT INTO people (person_id, name, age) VALUES
	('1', 'Naruto', 25),
	('2', 'Sasuke', 30),
	('3', 'Sakura', 28);

INSERT INTO skills (skill_id, person_id, name, level) VALUES
	(1, 1, 'Juggling', 'GOOD'),
	(2, 1, 'Dancing', 'AWESOME'),
	(3, 2, 'Juggling', 'AWESOME'),
	(4, 2, 'Story-telling', 'GODLIKE'),
	(5, 3, 'Singing', 'GOOD');

INSERT INTO parties (party_id, location, party_date) VALUES
	(1, 'Old Folks Club', '2016-09-20'),
	(2, 'Luxury Yacht Party', '2016-12-05');

INSERT INTO people_parties (person_id, party_id) VALUES
	(1, 1),
	(1, 2),
	(2, 1),
	(3, 2);

INSERT INTO users (user_id, username, password, enabled) VALUES
	('1', 'naruto@example.com', '$2a$10$D4OLKI6yy68crm.3imC9X.P2xqKHs5TloWUcr6z5XdOqnTrAK84ri', true),
	('2', 'sasuke@example.com', '$2a$10$D4OLKI6yy68crm.3imC9X.P2xqKHs5TloWUcr6z5XdOqnTrAK84ri', true),
  ('3', 'sakura@example.com', '$2a$10$D4OLKI6yy68crm.3imC9X.P2xqKHs5TloWUcr6z5XdOqnTrAK84ri', true);

