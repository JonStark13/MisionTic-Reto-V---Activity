/**
 *
 * @author dafpa
 */
package modelo;

public class Usuario {
    private int usrId;
    private String username;
    private String usrNombre;
    private String usrApellido;
    private String usrEmail;
    private int usrCelular;
    private String usrClave;
    private String fechaNto;

    public Usuario(int usrId, String username, String usrNombre, 
            String usrApellido, String usrEmail, int usrCelular, 
            String usrClave, String fechaNto) {
        this.usrId = usrId;
        this.username = username;
        this.usrNombre = usrNombre;
        this.usrApellido = usrApellido;
        this.usrEmail = usrEmail;
        this.usrCelular = usrCelular;
        this.usrClave = usrClave;
        this.fechaNto = fechaNto;
    }

    @Override
    public String toString() {
        return "usuario{" + "usrId=" + usrId + 
                ", username=" + username + 
                ", usrNombre=" + usrNombre + 
                ", usrApellido=" + usrApellido + 
                ", usrEmail=" + usrEmail + 
                ", usrCelular=" + usrCelular + 
                ", usrClave=" + usrClave + 
                ", fechaNto=" + fechaNto + '}';
    }

    public int getUsrId() {
        return usrId;
    }

    public void setUsrId(int usrId) {
        this.usrId = usrId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsrNombre() {
        return usrNombre;
    }

    public void setUsrNombre(String usrNombre) {
        this.usrNombre = usrNombre;
    }

    public String getUsrApellido() {
        return usrApellido;
    }

    public void setUsrApellido(String usrApellido) {
        this.usrApellido = usrApellido;
    }

    public String getUsrEmail() {
        return usrEmail;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail;
    }

    public int getUsrCelular() {
        return usrCelular;
    }

    public void setUsrCelular(int usrCelular) {
        this.usrCelular = usrCelular;
    }

    public String getUsrClave() {
        return usrClave;
    }

    public void setUsrClave(String usrClave) {
        this.usrClave = usrClave;
    }

    public String getFechaNto() {
        return fechaNto;
    }

    public void setFechaNto(String fechaNto) {
        this.fechaNto = fechaNto;
    }
    
    
    
}
