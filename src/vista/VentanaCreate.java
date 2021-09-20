/**
 *
 * @author dafpa
 */
package vista;

import java.awt.Dimension;
import javax.swing.JFrame;

public class VentanaCreate extends JFrame{
    
    public VentanaCreate(){
        iniciarVentana();
    }
    
    private void iniciarVentana(){
        setTitle("CRUD BICICLETAS");
        setLocation(600, 400);
        setSize(550,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PanelCreate panelCreate = new PanelCreate();
        add(panelCreate);
        setVisible(true);
        
        
    } 
    
}
