
package com.appweb.modelo.vo;

public class Proveedor {
    private int idproveedor;
    private String nombreprov;
    private String nit;
    private String direccionprov;
    private String correoprov;
    private String telefonoprov;
    
    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }
    
    public String getNombreprov() {
        return nombreprov;
    }

    public void setNombreprov(String nombreprov) {
        this.nombreprov = nombreprov;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccionprov() {
        return direccionprov;
    }

    public void setDireccionprov(String direccionprov) {
        this.direccionprov = direccionprov;
    }

    public String getCorreoprov() {
        return correoprov;
    }

    public void setCorreoprov(String correoprov) {
        this.correoprov = correoprov;
    }

    public String getTelefonoprov() {
        return telefonoprov;
    }

    public void setTelefonoprov(String telefonoprov) {
        this.telefonoprov = telefonoprov;
    }

}