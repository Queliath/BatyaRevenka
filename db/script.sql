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

CREATE TABLE public.br_basic_info
(
  id bigserial NOT NULL,
  info_type character varying(100) NOT NULL,
  info_data character varying(1000) NOT NULL,
  CONSTRAINT br_basic_info_pk PRIMARY KEY (id)
)
WITH (
OIDS = FALSE
)
;

CREATE TABLE public.br_client
(
  id bigserial NOT NULL,
  name character varying(100) NOT NULL,
  icon_url character varying(250),
  description text NOT NULL,
  CONSTRAINT br_client_pk PRIMARY KEY (id)
)
WITH (
OIDS = FALSE
)
;

CREATE TABLE public.br_service
(
  id bigserial NOT NULL,
  name character varying(150) NOT NULL,
  icon_url character varying(250),
  short_description text NOT NULL,
  CONSTRAINT br_service_pk PRIMARY KEY (id)
)
WITH (
OIDS = FALSE
)
;

CREATE TABLE public.br_service_advantage
(
  id bigserial NOT NULL,
  service_id bigint NOT NULL,
  name character varying(150) NOT NULL,
  description text,
  CONSTRAINT br_service_advantage_pk PRIMARY KEY (id),
  CONSTRAINT br_service_advantage_fk FOREIGN KEY (service_id) REFERENCES public.br_service (id) ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
OIDS = FALSE
)
;

CREATE TABLE public.br_service_example
(
  id bigserial NOT NULL,
  service_id bigint NOT NULL,
  image_url character varying(250) NOT NULL,
  CONSTRAINT br_service_example_pk PRIMARY KEY (id),
  CONSTRAINT br_service_example_fk FOREIGN KEY (service_id) REFERENCES public.br_service (id) ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
OIDS = FALSE
)
;

CREATE TABLE public.br_service_type
(
  id bigserial NOT NULL,
  service_id bigint NOT NULL,
  name character varying(100) NOT NULL,
  CONSTRAINT br_service_type_pk PRIMARY KEY (id),
  CONSTRAINT br_service_type_fk FOREIGN KEY (service_id) REFERENCES public.br_service (id) ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
OIDS = FALSE
)
;

CREATE TABLE public.br_service_price_column
(
  id bigserial NOT NULL,
  service_id bigint NOT NULL,
  name character varying(100) NOT NULL,
  order_number integer NOT NULL,
  attribute_name character varying(100) NOT NULL,
  CONSTRAINT pk_service_price_column_pk PRIMARY KEY (id),
  CONSTRAINT br_service_price_column_fk FOREIGN KEY (service_id) REFERENCES public.br_service (id) ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
OIDS = FALSE
)
;

CREATE TABLE public.br_service_price_cell
(
  id bigserial NOT NULL,
  service_column_id bigint NOT NULL,
  line_number integer NOT NULL,
  cell_value character varying(150) NOT NULL,
  CONSTRAINT br_service_price_cell_pk PRIMARY KEY (id),
  CONSTRAINT br_service_price_cell_fk FOREIGN KEY (service_column_id) REFERENCES public.br_service_price_column (id) ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
OIDS = FALSE
)
;
