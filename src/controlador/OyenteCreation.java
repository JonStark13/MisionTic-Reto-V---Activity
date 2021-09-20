/**
 *
 * @author dafpa
 */
package controlador;

import acceso.bicicletaDAO;
import conexion.ConnectionDB;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;
import modelo.Bicicleta;


public class OyenteCreation implements ActionListener {

    JTextField campo1;
    JTextField campo2;
    ButtonGroup botonesOpciones;
    JScrollPane jsp;

    public OyenteCreation(JTextField campo1, JTextField campo2,
            ButtonGroup botonesOpciones, JScrollPane jsp) {
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.botonesOpciones = botonesOpciones;
        this.jsp = jsp;
    }

    private void limpiarCampos() {
        campo1.setText("");
        campo2.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        int bicId = Integer.parseInt(campo1.getText());
        String numMarco = campo2.getText();

        Bicicleta bicicleta = new Bicicleta(bicId, numMarco);
        Connection conn = ConnectionDB.conectarBD();

        ArrayList<AbstractButton> botones = Collections.list(botonesOpciones.getElements());

        for (AbstractButton boton : botones) {
            if (boton.isSelected()) {
                switch (boton.getText()) {
                    case "CREATE":
                        boolean resultCreate = bicicletaDAO.createCicla(conn, bicicleta);
                        limpiarCampos();
                        break;
                    case "UPDATE":
                        boolean resultUpdate = bicicletaDAO.updateCicla(conn, bicicleta);
                        limpiarCampos();
                        break;
                    case "DELETE":
                        boolean resultDelete = bicicletaDAO.deleteCicla(conn, bicId);
                        limpiarCampos(); 
                        break;
                }
            }
        }
        
        ArrayList<Bicicleta>listaCiclas = bicicletaDAO.readCicla(conn);
        
        String[] heads = {"Bic_ID", "NoMarco"};
        DefaultTableModel table = new DefaultTableModel(null, heads);

        for (Bicicleta cicla : listaCiclas) {
            String[] registro = new String[2];
            registro[0] = Integer.toString(cicla.getBicId());
            registro[1] = cicla.getBicMarco();
            table.addRow(registro);
        }
        JTable tableRead = new JTable(table);
        
        JViewport viewport2 = new JViewport();
        viewport2.setView(tableRead);
        jsp.setViewport(viewport2);
        
        

    }

}
