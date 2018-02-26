
package com.appweb.control;

import com.appweb.modelo.dao.ProductoDAO;
import java.sql.Connection;
import com.appweb.modelo.vo.Producto;
import java.sql.SQLException;

public class ControlProducto {
    Connection cnx;
    ProductoDAO dao;
    
    public ControlProducto(Connection cnx){
        this.cnx = cnx;
        this.dao = new ProductoDAO(cnx);
    }
    
    public boolean insertarProducto(Producto vo){
     if(vo.getNombre()== null || vo.getNombre().isEmpty()
             || vo.getMarca() == null || vo.getMarca().isEmpty()
             || vo.getFechavencimiento()== null 
             || vo.getLote() == null || vo.getLote().isEmpty()
             || vo.getCantidad()!=0 || vo.getPrecio()!=0
             ){
        return false;
     }else{
         try {
                dao.insertarProducto(vo);
                return true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        
        }
    }
    
    public boolean modificarProducto(Producto vo){
        if(vo.getNombre()== null || vo.getNombre().isEmpty()
             || vo.getMarca() == null || vo.getMarca().isEmpty()
             || vo.getFechavencimiento()== null 
             || vo.getLote() == null || vo.getLote().isEmpty()
             || vo.getCantidad()!=0 || vo.getPrecio()!=0
             ){
            return false;
        }else{
            try {
                dao.modificarProducto(vo);
                return true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
        
    }
    
    public boolean borrarProducto(Producto vo){
        if(vo.getIdproducto()== 0){
            return false;
        }else{
            try {
                dao.borrarProducto(vo);
                return true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
    }
    
}