CREATE TABLE public.users
(
    uid integer NOT NULL,
    username character varying(100) COLLATE pg_catalog."default" NOT NULL,
    password character varying(100) COLLATE pg_catalog."default" NOT NULL,
    role character varying(100) COLLATE pg_catalog."default" NOT NULL DEFAULT 'USER',
    CONSTRAINT users_pkey PRIMARY KEY (uid),
    CONSTRAINT users_username_key UNIQUE (username)
);