
package com.appweb.modelo.dao;

import com.appweb.modelo.vo.FacturaProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class FacturaProductoDAO {
    Connection cnx;
    
    public FacturaProductoDAO(Connection cnx) {
        this.cnx = cnx;
    }
    
    public void insertarFacturaProducto(FacturaProducto vo) throws SQLException{
        PreparedStatement sentencia = 
                cnx.prepareStatement(
                        "INSERT INTO FacturaProducto (idFactura,idProducto,valor) "
                + "VALUES(?,?,?)");
        sentencia.setInt(1, vo.getIdFactura());
        sentencia.setInt(2, vo.getIdProducto());
        sentencia.setDouble(3, vo.getValor());
        sentencia.executeUpdate();
    }
    
    public void modificarFacturaProducto(FacturaProducto vo) throws SQLException{
        PreparedStatement sentencia = 
                cnx.prepareStatement(
                        "UPDATE FacturaProducto SET idFactura= ?,idProducto= ?,valor= ?"
                + "WHERE idFacuraProducto = ?");
        sentencia.setInt(1, vo.getIdFactura());
        sentencia.setInt(2, vo.getIdProducto());
        sentencia.setDouble(3, vo.getValor());
        sentencia.executeUpdate();
    }
    
    public void borrarFacturaProducto(FacturaProducto vo) throws SQLException{
        PreparedStatement sentencia = 
                cnx.prepareStatement(
                        "DELETE FacuraProducto "
                + "WHERE idFacturaProducto = ?");
        sentencia.setInt(1, vo.getIdFacturaproducto());
        sentencia.executeUpdate();
    }
    
}
