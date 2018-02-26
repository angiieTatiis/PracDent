
package com.appweb.modelo.dao;

import com.appweb.modelo.vo.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class ProveedorDAO {
    
    Connection cnx;

    public ProveedorDAO(Connection cnx) {
        this.cnx = cnx;
    }
    
    public void insertarProveedor(Proveedor vo) throws SQLException{
        PreparedStatement sentencia = 
                cnx.prepareStatement(
                        "INSERT INTO proveedor (nombreprov,nit,direccionprov,correoprov, telefonoprov) "
                + "VALUES(?,?,?,?,?)");
        sentencia.setString(1, vo.getNombreprov());
        sentencia.setString(2, vo.getNit());
        sentencia.setString(3, vo.getDireccionprov());
        sentencia.setString(4, vo.getCorreoprov());
        sentencia.setString(5, vo.getTelefonoprov());
        sentencia.executeUpdate();
    }
    
    public void modificarProveedor(Proveedor vo) throws SQLException{
        PreparedStatement sentencia = 
                cnx.prepareStatement(
                        "UPDATE proveedor SET nombreprov= ?,nit= ?,direccionprov= ?,correoprov= ?,telefonoprov= ?"
                + "WHERE idproveedor = ?");
        sentencia.setString(1, vo.getNombreprov());
        sentencia.setString(2, vo.getNit());
        sentencia.setString(3, vo.getDireccionprov());
        sentencia.setString(4, vo.getCorreoprov());
        sentencia.setString(5, vo.getTelefonoprov());
        sentencia.setInt(6, vo.getIdproveedor());
        sentencia.executeUpdate();
    }
    
    public void borrarProveedor(Proveedor vo) throws SQLException{
        PreparedStatement sentencia = 
                cnx.prepareStatement(
                        "DELETE proveedor "
                + "WHERE idproveedor = ?");
        sentencia.setInt(1, vo.getIdproveedor());
        sentencia.executeUpdate();
    }
    
}
