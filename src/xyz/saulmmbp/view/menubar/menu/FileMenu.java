package xyz.saulmmbp.view.menubar.menu;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import xyz.saulmmbp.actions.ActionListeners;

public class FileMenu implements SMenu {

    private JMenu menu;
    
    private JMenuItem nuevo;
    private JMenuItem abrir;
    private JMenuItem guardar;
    private JMenuItem guardarComo;
    private JMenuItem imprimir;
    private JMenuItem salir;
    
    @Override
    public JMenu create() {
        
        /* Configuraciones del Menú */
        menu = new JMenu();
        menu.setText("File");
        menu.setMnemonic('F');

        /* Inicializando Items */
        initItems();
        
        /* Agregando Items */
        menu.add(nuevo);
        menu.add(abrir);
        menu.add(guardar);
        menu.add(guardarComo);
        menu.add(imprimir);
        menu.add(salir);
        
        return menu;
    }

    @Override
    public void initItems() {
        
        /* inicialización de items */
        nuevo = new JMenuItem();
        abrir = new JMenuItem();
        guardar = new JMenuItem();
        guardarComo = new JMenuItem();
        imprimir = new JMenuItem();
        salir = new JMenuItem();
        
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
        
    }

}
