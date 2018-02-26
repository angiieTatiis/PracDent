
package com.appweb.control;

import com.appweb.modelo.vo.Empleado;
import com.appweb.modelo.dao.EmpleadoDAO;
import java.sql.Connection;
import java.sql.SQLException;

public class ControlEmpleado {
    Connection cnx;
    EmpleadoDAO dao;
    
    public ControlEmpleado(Connection cnx){
        this.cnx = cnx;
        this.dao = new EmpleadoDAO(cnx);
    }
    
    public boolean insertarEmpleado(Empleado vo){
     if(vo.getNombres()== null || vo.getNombres().isEmpty()
         || vo.getApellidos() == null || vo.getApellidos().isEmpty()
         || vo.getTipodocumento() == null || vo.getTipodocumento().isEmpty()
         || vo.getDocumento() == null || vo.getDocumento().isEmpty()
         || vo.getDireccion() == null || vo.getDireccion().isEmpty()){
        return false;
     }else{
         try {
                dao.insertarEmpleado(vo);
                return true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        
        }
    }
    
    public boolean modificarEmpleado(Empleado vo){
        if(vo.getNombres()== null || vo.getNombres().isEmpty()
         || vo.getApellidos() == null || vo.getApellidos().isEmpty()
         || vo.getTipodocumento() == null || vo.getTipodocumento().isEmpty()
         || vo.getDocumento() == null || vo.getDocumento().isEmpty()
         || vo.getDireccion() == null || vo.getDireccion().isEmpty()){
            return false;
        }else{
            try {
                dao.modificarEmpleado(vo);
                return true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
        
    }
    
    public boolean borrarEmpleado(Empleado vo){
        if(vo.getIdempleado()== 0){
            return false;
        }else{
            try {
                dao.borrarEmpleado(vo);
                return true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        }
    }
}
