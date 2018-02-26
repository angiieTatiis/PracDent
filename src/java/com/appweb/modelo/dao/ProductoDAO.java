
package com.appweb.modelo.dao;

import com.appweb.modelo.vo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class ProductoDAO {
    
    Connection cnx;

    public ProductoDAO(Connection cnx) {
        this.cnx = cnx;
    }
    
    public void insertarProducto(Producto vo) throws SQLException{
        PreparedStatement sentencia = 
                cnx.prepareStatement(
                        "INSERT INTO producto (nombre,marca,fechavencimiento,lote,cantidad,precio) "
                + "VALUES(?,?,?,?,?,?)");
        sentencia.setString(1, vo.getNombre());
        sentencia.setString(2, vo.getMarca());
        sentencia.setDate(3, new java.sql.Date (vo.getFechavencimiento().getTime()));
        sentencia.setString(4, vo.getLote());
        sentencia.setInt(5, vo.getCantidad());
        sentencia.setDouble(6, vo.getPrecio());
        sentencia.executeUpdate();
    }
    
    public void modificarProducto(Producto vo) throws SQLException{
        PreparedStatement sentencia = 
                cnx.prepareStatement(
                        "UPDATE producto SET nombre= ?,marca= ?,fechavencimiento= ?,lote= ?,cantidad= ?,precio= ?"
                + "WHERE idproducto = ?");
        sentencia.setString(1, vo.getNombre());
        sentencia.setString(2, vo.getMarca());
        sentencia.setDate(3, new java.sql.Date (vo.getFechavencimiento().getTime()));
        sentencia.setString(4, vo.getLote());
        sentencia.setInt(5, vo.getCantidad());
        sentencia.setDouble(6, vo.getPrecio());
        sentencia.setInt(7, vo.getIdproducto());
        sentencia.executeUpdate();
    }
    
    public void borrarProducto(Producto vo) throws SQLException{
        PreparedStatement sentencia = 
                cnx.prepareStatement(
                        "DELETE producto "
                + "WHERE idproducto = ?");
        sentencia.setInt(1, vo.getIdproducto());
        sentencia.executeUpdate();
    }
}
