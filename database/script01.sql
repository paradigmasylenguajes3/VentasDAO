
CREATE TABLE public.clientes
(
    id SERIAL NOT NULL ,
    nombre character varying(60) COLLATE pg_catalog."default" NOT NULL,
    cuil character varying(12) COLLATE pg_catalog."default" NOT NULL,
    razon_social character varying(60) COLLATE pg_catalog."default",
    CONSTRAINT pk_clientes_id PRIMARY KEY (id)
)
