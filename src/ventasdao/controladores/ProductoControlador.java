/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasdao.controladores;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventasdao.dominio.Conexion;
import ventasdao.objetos.Categoria;
import ventasdao.objetos.Producto;

/**
 *
 * @author hchanampe
 */
public class ProductoControlador implements ICrud<Producto>{

   private Connection connection;

    private Statement statementmt;

    private PreparedStatement ps;

    private ResultSet resultSet;

    private String query;
    
    private CategoriaControlador categoriaControlador;


    @Override
    public boolean crear(Producto entidad) throws SQLException, Exception {
        
        connection = Conexion.obtenerConexion ();
        String sql = "INSERT INTO productos (nombre,descripcion,precio,fecha_creacion, categoria_id) VALUES (?,?,?,?,?)";
        Date fecha = new Date(entidad.getFechaCreacion().getTime());
        
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, entidad.getNombre());
            ps.setString(2, entidad.getDescripcion());
            ps.setFloat(3, entidad.getPrecio());
            ps.setDate(4, fecha);
            ps.setInt(5, entidad.getCategoria().getId());
            ps.executeUpdate();
            connection.close();
            

        } catch (SQLException ex) {
            Logger.getLogger(CategoriaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean eliminar(Producto entidad) {
        return false;
    }

    @Override
    public Producto extraer(int id) {
        return null;
    }

    @Override
    public boolean modificar(Producto entidad) {
        return false;
    }

    @Override
    public ArrayList <Producto> listar() throws Exception {
         connection = Conexion.obtenerConexion ();
        try{
            
            this.statementmt = connection.createStatement();
            this.query = "SELECT * FROM productos";
            this.resultSet   = statementmt.executeQuery(query);
            connection.close();
            
            ArrayList<Producto> productos = new ArrayList();
            
            while(resultSet.next()){
                
                Producto producto = new Producto();
                
                producto.setNombre(resultSet.getString("nombre"));
                producto.setDescripcion(resultSet.getString("descripcion"));
                producto.setId(resultSet.getInt("id"));
                producto.setPrecio (resultSet.getFloat("precio"));
                producto.setFechaCreacion(resultSet.getDate("fecha_creacion"));
                producto.setCategoria(getCategoria(resultSet.getInt("categoria_id")));
                        //System.out.println(cliente);

                productos.add(producto);
                
            }
            //System.out.println(cont);
            return productos;
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
    
 private Categoria getCategoria(Integer id) throws Exception{
     this.categoriaControlador = new CategoriaControlador();
     
     Categoria categoria = categoriaControlador.extraer(id);
     
     return categoria;
 }   
    
}
