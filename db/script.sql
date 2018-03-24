CREATE DATABASE batya
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Russian_Russia.1251'
       LC_CTYPE = 'Russian_Russia.1251'
       CONNECTION LIMIT = -1;

CREATE TABLE public.br_comment
(
  id bigserial NOT NULL,
  author_name character varying(200) NOT NULL,
  content text NOT NULL,
  date_created date NOT NULL,
  CONSTRAINT br_comment_pk PRIMARY KEY (id)
)
WITH (
OIDS = FALSE
)
;