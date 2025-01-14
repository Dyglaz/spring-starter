INSERT INTO company (name)
VALUES ('TechCorp'),
       ('InnovateX'),
       ('DataSolutions'),
       ('AlphaTech'),
       ('SoftSystems'),
       ('NextGen');

INSERT INTO users (username, birth_date, firstname, lastname, role, company_id)
VALUES
    ('jdoe', '1990-05-15', 'John', 'Doe', 'Manager', 1),
    ('asmith', '1985-11-23', 'Alice', 'Smith', 'Engineer', 2),
    ('bwayne', '1992-07-12', 'Bruce', 'Wayne', 'Designer', 3),
    ('cwhite', '1988-01-30', 'Clara', 'White', 'Analyst', 4),
    ('kmiller', '1995-09-05', 'Kate', 'Miller', 'HR', 5),
    ('dblack', '1980-03-22', 'David', 'Black', 'CTO', 1);

INSERT INTO company_locales (company_id, lang, description)
VALUES
    (1, 'en', 'Leading technology company'),
    (2, 'en', 'Innovative solutions provider'),
    (3, 'en', 'Data-focused company'),
    (4, 'en', 'Alpha technology services'),
    (5, 'en', 'Software systems for enterprises'),
    (6, 'en', 'Next-generation innovations');

INSERT INTO chat (name)
VALUES
    ('General Chat'),
    ('Project Alpha'),
    ('Design Team'),
    ('Management'),
    ('HR Discussions'),
    ('Tech Support');

INSERT INTO payment (amount, receiver_id)
VALUES
    (1000, 1),
    (1500, 2),
    (1200, 3),
    (1800, 4),
    (2000, 5),
    (1700, 6);

INSERT INTO users_chat (user_id, chat_id)
VALUES
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 5),
    (6, 6);
