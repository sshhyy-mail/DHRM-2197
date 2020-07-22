CREATE TABLE users
(
    user_id integer PRIMARY KEY,
    username character varying(15) COLLATE pg_catalog."default" NOT NULL,
    password character varying(15) COLLATE pg_catalog."default" NOT NULL
);