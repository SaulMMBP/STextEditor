package xyz.saulmmbp.view.menubar.menu;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;

import xyz.saulmmbp.actions.ActionListeners;

public class FileMenu extends JMenu {

    private static final long serialVersionUID = -3671420503431903360L;
    
    private JMenuItem nuevo;
    private JMenuItem abrir;
    private JMenuItem guardar;
    private JMenuItem guardarComo;
    private JMenuItem imprimir;
    private JMenuItem salir;
    
    private JSeparator separador0;
    private JSeparator separador1;
    private JSeparator separador2;

    public FileMenu() {
        
        /* Configuraciones del Menú */
        setText("Archivo");
        setMnemonic('A');

        /* Inicializando Items */
        initComponents();
        
    }
    
    private void initComponents() {
        
        /* inicialización de items */
        nuevo = new JMenuItem();
        abrir = new JMenuItem();
        guardar = new JMenuItem();
        guardarComo = new JMenuItem();
        imprimir = new JMenuItem();
        salir = new JMenuItem();
        
        separador0 = new JSeparator();
        separador1 = new JSeparator();
        separador2 = new JSeparator();
        
        /* Configuraciones */
            /* Etiqueta */
        nuevo.setText("Nuevo");
        abrir.setText("Abrir");
        guardar.setText("Guardar");
        guardarComo.setText("Guardar Como...");
        imprimir.setText("Imprimir");
        salir.setText("Salir");
        
            /* Mnemónico */
        nuevo.setMnemonic('N');
        abrir.setMnemonic('A');
        guardar.setMnemonic('G');
        guardarComo.setMnemonic('G');
        imprimir.setMnemonic('P');
        salir.setMnemonic('S');
        
            /* Aceleradores */
        nuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        guardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        imprimir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_DOWN_MASK));
        
            /* Escuchadores de acciones */
        salir.addActionListener(ActionListeners.salir());
        
        /* Agregando Componentes */
        add(nuevo);
        add(abrir);
        add(separador0);
        add(guardar);
        add(guardarComo);
        add(separador1);
        add(imprimir);
        add(separador2);
        add(salir);
    }
}
