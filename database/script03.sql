CREATE TABLE public.tipo_cliente
(
    id serial NOT NULL,
    nombre character varying(60) NOT NULL,
    descripcion character varying(120),
    PRIMARY KEY (id)
);

