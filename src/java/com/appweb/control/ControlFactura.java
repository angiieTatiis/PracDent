
package com.appweb.control;

import com.appweb.modelo.vo.Factura;
import com.appweb.modelo.dao.FacturaDAO;
import java.sql.Connection;
import java.sql.SQLException;

public class ControlFactura {
    Connection cnx;
    FacturaDAO dao;
    
    public ControlFactura(Connection cnx){
        this.cnx = cnx;
        this.dao = new FacturaDAO(cnx);
    }
    
    public boolean insertarFactura(Factura vo){
     if(vo.getFechacreacionfactura()== null 
         || vo.getValor() == null || vo.getValor()!=0
         || vo.getDescripcion()== null || vo.getDescripcion().isEmpty()
         || vo.getFechagarantia() == null 
         || vo.getIva() == null || vo.getIva()!=0
         || vo.getImpuesto() == null || vo.getImpuesto()!=0
             ){
        return false;
     }else{
         try {
                dao.insertarFactura(vo);
                return true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        
        }
    }
    
    public boolean modificarFactura(Factura vo){
        if(vo.getValor() == null || vo.getValor()!=0
         || vo.getDescripcion()== null || vo.getDescripcion().isEmpty()
         || vo.getFechagarantia() == null 
         || vo.getIva() == null || vo.getIva()!=0
         || vo.getImpuesto() == null || vo.getImpuesto()!=0){
            return false;
        }else{
            try {
                dao.modificarFactura(vo);
                return true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
        
    }
    
    public boolean borrarFactura(Factura vo){
        if(vo.getIdfactura() == 0){
            return false;
        }else{
            try {
                dao.borrarFactura(vo);
                return true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
    }
}
