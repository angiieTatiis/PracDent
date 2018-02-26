
package com.appweb.modelo.vo;
import java.util.Date;

public class Factura {
    private int idfactura;
    private Date fechacreacionfactura;
    private Double valor;
    private String descripcion;
    private Date fechagarantia;
    private Double iva;
    private Double impuesto;
    
     public int getIdfactura() {
        return idfactura;
    }

    public void setIdFactura(int idfactura) {
        this.idfactura = idfactura;
    }
    
    public Date getFechacreacionfactura() {
        return fechacreacionfactura;
    }

    public void setFechacreacionfactura(Date fechacreacionfactura) {
        this.fechacreacionfactura = fechacreacionfactura;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechagarantia() {
        return fechagarantia;
    }

    public void setFechagarantia(Date fechagarantia) {
        this.fechagarantia = fechagarantia;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }
    
    public Double getImpuesto() {
        return impuesto;
    }
    
    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }
}
