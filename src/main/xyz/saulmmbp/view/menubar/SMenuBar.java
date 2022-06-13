package xyz.saulmmbp.view.menubar;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import xyz.saulmmbp.view.menubar.menu.EditMenu;
import xyz.saulmmbp.view.menubar.menu.FileMenu;
import xyz.saulmmbp.view.menubar.menu.FormatMenu;
import xyz.saulmmbp.view.menubar.menu.HelpMenu;
import xyz.saulmmbp.view.menubar.menu.ViewMenu;

public class SMenuBar extends JMenuBar{

    private static final long serialVersionUID = 3047307722877646966L;
    
    /* Declaración de menús */
    private JMenu archivo;
    private JMenu edicion;
    private JMenu formato;
    private JMenu ver;
    private JMenu ayuda;

    public SMenuBar() {
        
        /* Inicializando componentes */
        initComponents();
        
        /* Agregando componentes*/
        add(archivo);
        add(edicion);
        add(formato);
        add(ver);
        add(ayuda);
    }
    
    /* Inicializa menus */
    private void initComponents() {
    
        /* Inicializando */
        archivo = new FileMenu();
        edicion = new EditMenu();
        formato = new FormatMenu();
        ver = new ViewMenu();
        ayuda = new HelpMenu();
    }

}
