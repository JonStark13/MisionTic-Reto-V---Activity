/**
 *
 * @author dafpa
 */
package modelo;

public class Ventas {
    private int ventaId;
    private int venUsrId;
    private int venBicId;
    private String venFecha;

    public Ventas(int ventaId, int venUsrId, int venBicId, String venFecha) {
        this.ventaId = ventaId;
        this.venUsrId = venUsrId;
        this.venBicId = venBicId;
        this.venFecha = venFecha;
    }

    @Override
    public String toString() {
        return "ventas{" + "ventaId=" + ventaId + ", venUsrId=" + venUsrId + 
                ", venBicId=" + venBicId + ", venFecha=" + venFecha + '}';
    }

    public int getVentaId() {
        return ventaId;
    }

    public void setVentaId(int ventaId) {
        this.ventaId = ventaId;
    }

    public int getVenUsrId() {
        return venUsrId;
    }

    public void setVenUsrId(int venUsrId) {
        this.venUsrId = venUsrId;
    }

    public int getVenBicId() {
        return venBicId;
    }

    public void setVenBicId(int venBicId) {
        this.venBicId = venBicId;
    }

    public String getVenFecha() {
        return venFecha;
    }

    public void setVenFecha(String venFecha) {
        this.venFecha = venFecha;
    }
    
    
    
    
}
