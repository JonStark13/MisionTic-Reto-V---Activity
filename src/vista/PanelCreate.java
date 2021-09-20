/**
 *
 * @author dafpa
 */
package vista;

import acceso.bicicletaDAO;
import conexion.ConnectionDB;
import controlador.OyenteCreation;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Bicicleta;

public class PanelCreate extends JPanel {

    Connection conn = ConnectionDB.conectarBD();

    List<Bicicleta> listaCiclas = new ArrayList<Bicicleta>();

    public PanelCreate() {
        iniciarPanel();
    }

    public JScrollPane crearTabla(List<Bicicleta> listaCiclas, JScrollPane jsp) {
        String[] heads = {"Bic_ID", "NoMarco"};
        DefaultTableModel table = new DefaultTableModel(null, heads);
        for (Bicicleta cicla : listaCiclas) {
            String[] registro = new String[2];
            registro[0] = Integer.toString(cicla.getBicId());
            registro[1] = cicla.getBicMarco();
            table.addRow(registro);
        }
        JTable jtabla = new JTable(table);
 
        jsp = new JScrollPane(jtabla);
        JScrollBar bar = new JScrollBar(JScrollBar.VERTICAL, 30, 40, 0, 500);
        jsp.add(bar);
        return jsp;
    }

    private void iniciarPanel() {

        JLabel tituloEtiqueta = new JLabel("BICICLETAS");
        tituloEtiqueta.setFont(new Font("Arial", Font.BOLD, 50));
        tituloEtiqueta.setForeground(Color.DARK_GRAY);
        tituloEtiqueta.setHorizontalAlignment(JLabel.CENTER);

        JLabel idEtiqueta = new JLabel("ID Bicicleta: ");
        idEtiqueta.setFont(new Font("Arial", Font.BOLD, 40));
        idEtiqueta.setHorizontalAlignment(JLabel.CENTER);

        JTextField campo1 = new JTextField(10);
        campo1.setFont(new Font("Arial", Font.ITALIC, 30));
        campo1.setHorizontalAlignment(JTextField.CENTER);

        JLabel velEtiqueta = new JLabel("No Marco: ");
        velEtiqueta.setFont(new Font("Arial", Font.BOLD, 40));
        velEtiqueta.setHorizontalAlignment(JLabel.CENTER);

        JTextField campo2 = new JTextField(10);
        campo2.setFont(new Font("Arial", Font.ITALIC, 30));
        campo2.setHorizontalAlignment(JTextField.CENTER);

        ButtonGroup botonesOpciones = new ButtonGroup();

        JRadioButton rbCreate = new JRadioButton("CREATE");
        JRadioButton rbUpdate = new JRadioButton("UPDATE");
        JRadioButton rbDelete = new JRadioButton("DELETE");

        botonesOpciones.add(rbCreate);
        botonesOpciones.add(rbUpdate);
        botonesOpciones.add(rbDelete);

        listaCiclas = bicicletaDAO.readCicla(conn);
        JScrollPane jsp = new JScrollPane();
        
        jsp = crearTabla(listaCiclas, jsp);
        
        
        JButton botonCrear = new JButton("ENVIAR");
        botonCrear.setFont(new Font("Arial", Font.BOLD, 60));
        ActionListener oyenteCreation = new OyenteCreation(campo1, campo2,
                botonesOpciones, jsp);
        botonCrear.addActionListener(oyenteCreation);

        add(tituloEtiqueta);
        
        add(idEtiqueta);
        add(campo1);

        add(velEtiqueta);
        add(campo2);

        add(rbCreate);
        add(rbUpdate);
        add(rbDelete);

        add(botonCrear);
        
        add(jsp);
        setVisible(true);

    }

}
