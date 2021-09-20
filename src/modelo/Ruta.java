/**
 *
 * @author dafpa
 */ 
package modelo;

public class Ruta {
    private int rutId;
    private int rutVelocidades;
    private int rutPeso;

    public Ruta(int rutId, int rutVelocidades, int rutPeso) {
        this.rutId = rutId;
        this.rutVelocidades = rutVelocidades;
        this.rutPeso = rutPeso;
    }

    @Override
    public String toString() {
        return "ruta{" + "rutId=" + rutId + 
                ", rutVelocidades=" + rutVelocidades + 
                ", rutPeso=" + rutPeso + '}';
    }

    public int getRutId() {
        return rutId;
    }

    public void setRutId(int rutId) {
        this.rutId = rutId;
    }

    public int getRutVelocidades() {
        return rutVelocidades;
    }

    public void setRutVelocidades(int rutVelocidades) {
        this.rutVelocidades = rutVelocidades;
    }

    public int getRutPeso() {
        return rutPeso;
    }

    public void setRutPeso(int rutPeso) {
        this.rutPeso = rutPeso;
    }
    
    
    
}
