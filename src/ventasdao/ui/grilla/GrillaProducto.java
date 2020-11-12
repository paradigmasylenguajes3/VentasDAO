/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasdao.ui.grilla;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import ventasdao.objetos.Producto;

/**
 *
 * @author Administrador
 */
public class GrillaProducto extends AbstractTableModel{
        private ArrayList<Producto> productos = new ArrayList<>();
    
    
    
    public GrillaProducto(ArrayList<Producto> datos) {
        this.productos = datos;
    }
    
    

    @Override
    public int getRowCount() {
        return productos.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
         return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto producto =  productos.get(rowIndex);
        switch(columnIndex){
              case 0: return producto.getId();
              case 1: return producto.getNombre();
              case 5: return producto.getDescripcion();
              case 3: return producto.getPrecio();
              case 4: return producto.getFechaCreacion();
              case 2: return producto.getCategoria();
              default: return "";
          }
        
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "ID";
            case 1: return "NOMBRE";
            case 5: return "Descripcion";
            case 3: return "Precio";
            case 4: return "Fecha Creacion";
            case 2: return "Categoria";
            default: return "";
        
        
        } //To change body of generated methods, choose Tools | Templates.
    }
}
