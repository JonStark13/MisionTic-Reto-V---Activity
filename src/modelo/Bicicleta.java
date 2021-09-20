 /**
 *
 * @author dafpa
 */
package modelo;

public class Bicicleta {
    private int bicId;
    private String bicMarco;

    public Bicicleta(int bicId, String bicMarco) {
        this.bicId = bicId;
        this.bicMarco = bicMarco;
    }

    @Override
    public String toString() {
        return "bicicleta{" + "bicId=" + bicId + ", bicMarco=" + bicMarco + '}';
    }
    
    public int getBicId() {
        return bicId;
    }

    public void setBicId(int bicId) {
        this.bicId = bicId;
    }

    public String getBicMarco() {
        return bicMarco;
    }

    public void setBicMarco(String bicMarco) {
        this.bicMarco = bicMarco;
    }
    
    
    
}
