
CREATE TABLE public.categorias
(
    id bigint NOT NULL DEFAULT nextval('categorias_id_seq'::regclass),
    denominacion character varying(60) COLLATE pg_catalog."default" NOT NULL,
    descripcion character varying(80) COLLATE pg_catalog."default",
    CONSTRAINT pk_id_categorias PRIMARY KEY (id)
)