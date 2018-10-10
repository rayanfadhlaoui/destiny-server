CREATE SEQUENCE fighter_id_seq START 1;

CREATE TABLE fighter
(
    id integer NOT NULL DEFAULT nextval('fighter_id_seq'::regclass),
    fighter_first_name text NOT NULL,
    CONSTRAINT fighter_pkey PRIMARY KEY (id),
);
