
package com.appweb.modelo.vo;

import java.util.Date;

public class FacturaProducto {
    private int idfacturaproducto;
    private int idfactura;
    private int idproducto;
    private Double valor;
    
    public int getIdFacturaproducto() {
        return idfacturaproducto;
    }

    public void setIdFacturaProducto(int idfacturaproducto) {
        this.idfacturaproducto = idfacturaproducto;
    }
    
    public int getIdFactura() {
        return idfactura;
    }

    public void setIdFactura(int idfactura) {
        this.idfactura = idfactura;
    }
    
    public int getIdProducto() {
        return idproducto;
    }

    public void setIdProducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
