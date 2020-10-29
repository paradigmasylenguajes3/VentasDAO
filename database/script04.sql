ALTER TABLE public.clientes
    ADD COLUMN tipo_cliente_id integer NOT NULL;
ALTER TABLE public.clientes
    ADD CONSTRAINT fk_tipo_cliente FOREIGN KEY (tipo_cliente_id)
    REFERENCES public.tipo_cliente (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID;
