
package com.appweb.modelo.dao;

import com.appweb.modelo.vo.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class FacturaDAO {
    
    Connection cnx;

    public FacturaDAO(Connection cnx) {
        this.cnx = cnx;
    }
    
    public void insertarFactura(Factura vo) throws SQLException{
        PreparedStatement sentencia = 
                cnx.prepareStatement(
                        "INSERT INTO factura (fechacreacionfactura,valor,descripcion,fechagarantia,iva,impuesto) "
                + "VALUES(?,?,?,?,?,?)");
        sentencia.setDate(1, new java.sql.Date(vo.getFechacreacionfactura().getTime()));
        sentencia.setDouble(2, vo.getValor());
        sentencia.setString(3, vo.getDescripcion());
        sentencia.setDate(4, new java.sql.Date(vo.getFechagarantia().getTime()));
        sentencia.setDouble(5, vo.getIva());
        sentencia.setDouble(6, vo.getImpuesto());
        sentencia.executeUpdate();
    }
    
    public void modificarFactura(Factura vo) throws SQLException{
        PreparedStatement sentencia = 
                cnx.prepareStatement(
                        "UPDATE factura SET fechacreacionfactura= ?,valor= ?,descripcion= ?,fechagarantia= ?,iva= ?,impuesto= ?"
                + "WHERE idfactura = ?");
        sentencia.setDate(1, new java.sql.Date(vo.getFechacreacionfactura().getTime()));
        sentencia.setDouble(2, vo.getValor());
        sentencia.setString(3, vo.getDescripcion());
        sentencia.setDate(4, new java.sql.Date(vo.getFechagarantia().getTime()));
        sentencia.setDouble(5, vo.getIva());
        sentencia.setDouble(6, vo.getImpuesto());
        sentencia.executeUpdate();
    }
    
    public void borrarFactura(Factura vo) throws SQLException{
        PreparedStatement sentencia = 
                cnx.prepareStatement(
                        "DELETE factura "
                + "WHERE idfactura = ?");
        sentencia.setInt(1, vo.getIdfactura());
        sentencia.executeUpdate();
    }
    
}
