/**
 *
 * @author dafpa
 */
package modelo;

public class Creador {
    private int creId;
    private String creNombre;
    private String creApellido;
    private String creNacionalidad;

    public Creador(int creId, String creNombre, 
            String creApellido, String creNacionalidad) {
        this.creId = creId;
        this.creNombre = creNombre;
        this.creApellido = creApellido;
        this.creNacionalidad = creNacionalidad;
    }

    @Override
    public String toString() {
        return "creador{" + "creId=" + creId + 
                ", creNombre=" + creNombre + 
                ", creApellido=" + creApellido + 
                ", creNacionalidad=" + creNacionalidad + '}';
    }

    public int getCreId() {
        return creId;
    }

    public void setCreId(int creId) {
        this.creId = creId;
    }

    public String getCreNombre() {
        return creNombre;
    }

    public void setCreNombre(String creNombre) {
        this.creNombre = creNombre;
    }

    public String getCreApellido() {
        return creApellido;
    }

    public void setCreApellido(String creApellido) {
        this.creApellido = creApellido;
    }

    public String getCreNacionalidad() {
        return creNacionalidad;
    }

    public void setCreNacionalidad(String creNacionalidad) {
        this.creNacionalidad = creNacionalidad;
    }
    
    
    
    
}
