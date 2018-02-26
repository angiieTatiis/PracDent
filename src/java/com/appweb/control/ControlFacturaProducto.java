
package com.appweb.control;

import com.appweb.modelo.vo.FacturaProducto;
import com.appweb.modelo.dao.FacturaProductoDAO;
import java.sql.Connection;
import java.sql.SQLException;

public class ControlFacturaProducto {
    Connection cnx;
    FacturaProductoDAO dao;
    
    public ControlFacturaProducto(Connection cnx){
        this.cnx = cnx;
        this.dao = new FacturaProductoDAO(cnx);
    }
    
    public boolean insertarFacturaProducto(FacturaProducto vo){
     if(vo.getValor() == null || vo.getValor()!=0){
        return false;
     }else{
         try {
                dao.insertarFacturaProducto(vo);
                return true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        
        }
    }
    
    public boolean modificarFacturaProducto(FacturaProducto vo){
        if(vo.getValor() == null || vo.getValor()!=0){
            return false;
        }else{
            try {
                dao.modificarFacturaProducto(vo);
                return true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
        
    }
//    
    public boolean borrarFacturaProducto(FacturaProducto vo){
        if(vo.getIdFacturaproducto()== 0){
            return false;
        }else{
            try {
                dao.borrarFacturaProducto(vo);
                return true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
    }
}
