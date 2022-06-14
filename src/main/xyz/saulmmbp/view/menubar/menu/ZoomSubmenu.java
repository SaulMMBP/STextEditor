package xyz.saulmmbp.view.menubar.menu;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import xyz.saulmmbp.actions.ActionListeners;

public class ZoomSubmenu extends JMenu {

    private static final long serialVersionUID = -8878408576516269629L;
    
    private JMenuItem acercar;
    private JMenuItem alejar;
    
    public ZoomSubmenu() {
        
        /* Configurando */
        setText("Zoom");
        setMnemonic('Z');
        
        /* Inicializando y agregando items */
        initComponents();
    }
    
    public void initComponents() {
        
        /* Inicializando items */
        acercar = new JMenuItem();
        alejar = new JMenuItem();
        
        /* Configurando */
            /* Etiquetas */
        acercar.setText("Acercar");
        alejar.setText("Alejar");
        
            /* Mnemónico */
        acercar.setMnemonic('A');
        alejar.setMnemonic('E');
        
            /* Aceleradores */
        acercar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, InputEvent.CTRL_DOWN_MASK));
        alejar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS, InputEvent.CTRL_DOWN_MASK));
        
            /* Listeners */
        acercar.addActionListener(ActionListeners.positiveZoom());
        alejar.addActionListener(ActionListeners.negativeZoom());

        /* Agregando Componentes */
        add(acercar);
        add(alejar);
        
    }
}
