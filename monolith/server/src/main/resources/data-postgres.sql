-- Lozinke su hesovane pomocu BCrypt algoritma https://www.dailycred.com/article/bcrypt-calculator
-- Lozinka za oba user-a je 123

INSERT INTO USERS (username, password, first_name, last_name, email, enabled, last_password_reset_date, status) VALUES ('agency', '$2a$04$af02pjvF.2JUC3wkdR/09efRl9.B.5XcJYYTUkwxvXkgDGSSn81uu', 'Marko', 'Markovic', 'user@example.com', true, '2017-10-01 21:58:58.508-07', 'BLOK');
INSERT INTO USERS (username, password, first_name, last_name, email, enabled, last_password_reset_date, status) VALUES ('admin', '$2a$04$Vbug2lwwJGrvUXTj6z7ff.97IzVBkrJ1XfApfGNl.Z695zqcnPYra', 'Nikola', 'Nikolic', 'admin@example.com', true, '2017-10-01 18:57:58.508-07', 'ACTIVE');

INSERT INTO ADVERT (user_id, title) VALUES (1, 'Naslov1');
INSERT INTO ADVERT (user_id, title) VALUES (1, 'Naslov2');
INSERT INTO ADVERT (user_id, title) VALUES (2, 'Naslov3');

INSERT INTO AUTHORITY (name) VALUES ('ROLE_USER');
INSERT INTO AUTHORITY (name) VALUES ('ROLE_AGENCY');
INSERT INTO AUTHORITY (name) VALUES ('ROLE_ADMIN');

INSERT INTO USER_AUTHORITY (user_id, authority_id) VALUES (1, 2);
INSERT INTO USER_AUTHORITY (user_id, authority_id) VALUES (2, 1);
INSERT INTO USER_AUTHORITY (user_id, authority_id) VALUES (2, 2);
INSERT INTO USER_AUTHORITY (user_id, authority_id) VALUES (2, 3);

INSERT INTO FUEL (id, title) VALUES (1, 'Dizel');
INSERT INTO FUEL (id, title) VALUES (2, 'Bezolovni dizel');
INSERT INTO FUEL (id, title) VALUES (3, 'Benzin');
INSERT INTO FUEL (id, title) VALUES (4, 'Bio dizel');

INSERT INTO MODEL (id, title) VALUES  (1, 'C1');
INSERT INTO MODEL (id, title) VALUES  (2, 'C2');
INSERT INTO MODEL (id, title) VALUES  (3, 'C3');
INSERT INTO MODEL (id, title) VALUES  (4, 'A1');
INSERT INTO MODEL (id, title) VALUES  (5, '208');
INSERT INTO MODEL (id, title) VALUES  (6, 'Fabia');

INSERT INTO MANUFACTURER (id, title) VALUES (1, 'Peugeot');
INSERT INTO MANUFACTURER (id, title) VALUES (2, 'Citroen');
INSERT INTO MANUFACTURER (id, title) VALUES (3, 'Skoda');
INSERT INTO MANUFACTURER (id, title) VALUES (4, 'Audi');