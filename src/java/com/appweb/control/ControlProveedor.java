
package com.appweb.control;


import java.sql.Connection;
import com.appweb.modelo.dao.ProveedorDAO;
import com.appweb.modelo.vo.Proveedor;
import java.sql.SQLException;


public class ControlProveedor {
    Connection cnx;
    ProveedorDAO dao;
    
    public ControlProveedor(Connection cnx){
        this.cnx = cnx;
        this.dao = new ProveedorDAO(cnx);
    }
    
    public boolean insertarProveedor(Proveedor vo){
     if(vo.getNombreprov() == null || vo.getNombreprov().isEmpty()
             || vo.getNit()== null || vo.getNit().isEmpty()
             || vo.getDireccionprov()== null || vo.getDireccionprov().isEmpty()
             || vo.getTelefonoprov() == null || vo.getTelefonoprov().isEmpty()){
        return false;
     }else{
         try {
                dao.insertarProveedor(vo);
                return true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        
        }
    }
    
    public boolean modificarProveedor(Proveedor vo){
        if(vo.getNombreprov() == null || vo.getNombreprov().isEmpty()
             || vo.getNit()== null || vo.getNit().isEmpty()
             || vo.getDireccionprov()== null || vo.getDireccionprov().isEmpty()
             || vo.getTelefonoprov() == null || vo.getTelefonoprov().isEmpty()){
            return false;
        }else{
            try {
                dao.modificarProveedor(vo);
                return true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
        
    }
    
    public boolean borrarProducto(Proveedor vo){
        if(vo.getIdproveedor()== 0){
            return false;
        }else{
            try {
                dao.borrarProveedor(vo);
                return true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
    }
    
    
}
