
package com.appweb.modelo.dao;

import com.appweb.modelo.vo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class EmpleadoDAO {
    
    Connection cnx;

    public EmpleadoDAO(Connection cnx) {
        this.cnx = cnx;
    }
    
    public void insertarEmpleado(Empleado vo) throws SQLException{
        PreparedStatement sentencia = 
                cnx.prepareStatement(
                        "INSERT INTO empleado (nombres,apellidos,tipodocumento,documento,direccion,fechanacimiento,telefono,correo) "
                + "VALUES(?,?,?,?,?,?,?,?)");
        sentencia.setString(1, vo.getNombres());
        sentencia.setString(2, vo.getApellidos());
        sentencia.setString(3, vo.getTipodocumento());
        sentencia.setString(4, vo.getDocumento());
        sentencia.setString(5, vo.getDireccion());
        sentencia.setDate(6, new java.sql.Date(vo.getFechanacimiento().getTime()));
        sentencia.setString(7, vo.getTelefono());
        sentencia.setString(8, vo.getCorreo());
        sentencia.executeUpdate();
    }
    
    public void modificarEmpleado(Empleado vo) throws SQLException{
        PreparedStatement sentencia = 
                cnx.prepareStatement(
                        "UPDATE empleado SET nombres= ?,apellidos= ?,tipodocumento= ?,documento= ?,direccion= ?,fechanacimiento= ?,telefono= ?,correo= ?"
                + "WHERE idempleado = ?");
        sentencia.setString(1, vo.getNombres());
        sentencia.setString(2, vo.getApellidos());
        sentencia.setString(3, vo.getTipodocumento());
        sentencia.setString(4, vo.getDocumento());
        sentencia.setString(5, vo.getDireccion());
        sentencia.setDate(6, new java.sql.Date(vo.getFechanacimiento().getTime()));
        sentencia.setString(7, vo.getTelefono());
        sentencia.setString(8, vo.getCorreo());
        sentencia.setInt(8, vo.getIdempleado());
        sentencia.executeUpdate();
    }
    
    public void borrarEmpleado(Empleado vo) throws SQLException{
        PreparedStatement sentencia = 
                cnx.prepareStatement(
                        "DELETE empleado "
                + "WHERE idempleado = ?");
        sentencia.setInt(1, vo.getIdempleado());
        sentencia.executeUpdate();
    }
}
