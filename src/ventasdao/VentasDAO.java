/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasdao;

import ventasdao.controladores.CategoriaControlador;
import ventasdao.controladores.ClienteControlador;
import ventasdao.objetos.Categoria;
import ventasdao.objetos.Cliente;

/**
 *
 * @author Hugo Chanampe
 */
public class VentasDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        CategoriaControlador categoriaControlador = new CategoriaControlador ();

        Categoria categoria = new Categoria ();
        categoria.setDenominacion ( "golosinas" );
        categoria.setDescripcion ( "abcdasd" );

        categoriaControlador.crear ( categoria );



    }
    
}
