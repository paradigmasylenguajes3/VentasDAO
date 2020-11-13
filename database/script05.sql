CREATE TABLE public.productos
(
    id serial NOT NULL DEFAULT,
    categoria_id integer NOT NULL,
    nombre character varying(128) COLLATE pg_catalog."default" NOT NULL,
    stock_minimo double precision,
    stock_maximo double precision,
    precio double precision NOT NULL,
    descripcion character varying(60) COLLATE pg_catalog."default",
    fecha_creacion date NOT NULL,
    CONSTRAINT productos_pkey PRIMARY KEY (id),
    CONSTRAINT fk_categoria_id FOREIGN KEY (categoria_id)
        REFERENCES public.categorias (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);


