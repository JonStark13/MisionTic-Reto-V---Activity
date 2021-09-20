/**
 *
 * @author dafpa
 */
package modelo;

public class Mtb {
    private int mtbId;
    private String mtbDescripcion;
    private int mtbAnho;
    private int mtbCreador;

    public Mtb(int mtbId, String mtbDescripcion, int mtbAnho, int mtbCreador) {
        this.mtbId = mtbId;
        this.mtbDescripcion = mtbDescripcion;
        this.mtbAnho = mtbAnho;
        this.mtbCreador = mtbCreador;
    }

    @Override
    public String toString() {
        return "mtb{" + "mtbId=" + mtbId + ", mtbDescripcion=" + mtbDescripcion + 
                ", mtbAnho=" + mtbAnho + ", mtbCreador=" + mtbCreador + '}';
    }

    public int getMtbId() {
        return mtbId;
    }

    public void setMtbId(int mtbId) {
        this.mtbId = mtbId;
    }

    public String getMtbDescripcion() {
        return mtbDescripcion;
    }

    public void setMtbDescripcion(String mtbDescripcion) {
        this.mtbDescripcion = mtbDescripcion;
    }

    public int getMtbAnho() {
        return mtbAnho;
    }

    public void setMtbAnho(int mtbAnho) {
        this.mtbAnho = mtbAnho;
    }

    public int getMtbCreador() {
        return mtbCreador;
    }

    public void setMtbCreador(int mtbCreador) {
        this.mtbCreador = mtbCreador;
    }
    
    
    
}
