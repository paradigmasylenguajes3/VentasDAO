/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventasdao.objetos;

import java.util.Date;

/**
 *
 * @author Hugo Chanampe
 */
public class Cliente {
    
    private Integer id;
    
    private String documento;
    
    private String nombre;
    
    private String apellido;
    
    private TipoCliente tipoCliente;
    
    private Date fechaNacimiento;

    private String cuil;

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }
    
    
    
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getDocumento() { return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido + ", tipoCliente=" + tipoCliente + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

 
    
}
