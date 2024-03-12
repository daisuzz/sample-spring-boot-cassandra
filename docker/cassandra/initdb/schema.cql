DROP KEYSPACE IF EXISTS example;

CREATE KEYSPACE example WITH replication = {
    'class': 'SimpleStrategy',
    'replication_factor' : 1
    };
USE example;

CREATE TABLE USERS
(
    user_id   text PRIMARY KEY,
    user_name text,
) WITH default_time_to_live = 31536000;

INSERT INTO USERS (user_id, user_name)
VALUES ('1', 'alice');
INSERT INTO USERS (user_id, user_name)
VALUES ('2', 'bob');
