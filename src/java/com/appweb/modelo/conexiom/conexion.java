/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appweb.modelo.conexiom;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    
    public static Connection getConexionDB() throws ClassNotFoundException, SQLException{
        String servidor = "localhost";
        String nombreDB = "inventario";
        String usuario = "inventarioUsuario";
        String clave = "123456";
        String puerto = "3306";
        
        Class.forName("com.mysql.jdbc.Driver"); 
        
        Connection cnx = DriverManager.getConnection("jdbc:mysql://"+servidor+":"+puerto+"/"+nombreDB, usuario, clave);
        cnx.setAutoCommit(false);
        return cnx;
    }
    
    public static void cerrarConexion(Connection cnx) throws SQLException{
        cnx.commit();
        cnx.close();
    }
    
    public static void cancelarTran(Connection cnx) throws SQLException{
        cnx.rollback();
        cnx.close();
    }
}