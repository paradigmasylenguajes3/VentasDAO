
CREATE TABLE public.categorias
(
    id serial NOT NULL ,
    denominacion character varying(60) COLLATE pg_catalog."default" NOT NULL,
    descripcion character varying(80) COLLATE pg_catalog."default",
    CONSTRAINT pk_id_categorias PRIMARY KEY (id)
)
