package ventasdao.controladores;

import ventasdao.objetos.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class ControladorProducto implements ICrud<Producto> {

    private Connection connection;

    private Statement statementmt;

    private PreparedStatement preparedStatements;

    private ResultSet resultSet;

    private String query;


    @Override
    public boolean crear(Producto entidad) {
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
    public List <Producto> listar() {
        return null;
    }
}
