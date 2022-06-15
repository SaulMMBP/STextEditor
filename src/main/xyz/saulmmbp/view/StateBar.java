package xyz.saulmmbp.view;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StateBar extends JPanel {

    private static final long serialVersionUID = -3490958561187539244L;
    
    private FlowLayout layout;
    
    private JLabel description;

    public StateBar() {
        
        /* Configurando Layout */
        layout = new FlowLayout(FlowLayout.LEFT);
        layout.layoutContainer(this);
        setLayout(layout);
        
        /* Inicializando componentes */
        initComponents();
    }
    
    private void initComponents() {
        
        /* Inicializando componentes */
        description = new JLabel();
        
        /* Configurando */
        description.setText("Listo");
        
        /* Agregando componentes */
        add(description);
        
    }
}
