package xyz.saulmmbp.view.menubar.menu;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class AlignSubmenu extends JMenu{

    private static final long serialVersionUID = 6638587767970172317L;
    
    private JMenuItem centrado;
    private JMenuItem justificado;
    private JMenuItem derecha;
    private JMenuItem izquierda;

    public AlignSubmenu() {
        
        /* Configuración */
        setText("Alineación");
        setMnemonic('A');
        
        /* Inicializando items */
        initComponents();

    }
    
    private void initComponents() {
        
        /* Inicializando Items */
        centrado = new JMenuItem();
        justificado = new JMenuItem();
        derecha = new JMenuItem();
        izquierda = new JMenuItem();
        
        /* Configuración */
            /* Etiqueta */
        centrado.setText("Centrado");
        justificado.setText("Justificado");
        derecha.setText("Derecha");
        izquierda.setText("Izquierda");
        
            /* Mnemónico */
        centrado.setMnemonic('C');
        justificado.setMnemonic('J');
        derecha.setMnemonic('D');
        izquierda.setMnemonic('I');
        
            /* Aceleradores */
        centrado.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_DOWN_MASK));
        justificado.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, InputEvent.CTRL_DOWN_MASK));
        derecha.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
        izquierda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
        
        /* Agregando items a submenú */
        add(centrado);
        add(justificado);
        add(derecha);
        add(izquierda);
        
    }

    

}
