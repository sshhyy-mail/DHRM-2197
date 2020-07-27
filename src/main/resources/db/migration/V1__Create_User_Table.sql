CREATE TABLE public.users
(
    uid integer NOT NULL,
    username character varying(100) COLLATE pg_catalog."default" NOT NULL,
    password character varying(100) COLLATE pg_catalog."default" NOT NULL,
    role character varying(100) COLLATE pg_catalog."default" NOT NULL DEFAULT 'USER',
    CONSTRAINT users_pkey PRIMARY KEY (uid),
    CONSTRAINT users_username_key UNIQUE (username)
);

INSERT INTO users VALUES (1, 'user', '$2a$10$DXf5nRS6Y2kV3ps2URGoZOdS/4eyDlsxoDah7ooyk5z06I2H7qH0i', 'USER');
INSERT INTO users VALUES (2, 'admin', '$2a$10$2mChFxlZWLnA290gF4bcMuqSF9Q5/bWSjyxr8XBwLedjROwyYnmeC', 'ADMIN');