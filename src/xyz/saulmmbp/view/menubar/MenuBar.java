package xyz.saulmmbp.view.menubar;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import xyz.saulmmbp.view.menubar.menu.EditMenu;
import xyz.saulmmbp.view.menubar.menu.FileMenu;
import xyz.saulmmbp.view.menubar.menu.FormatMenu;
import xyz.saulmmbp.view.menubar.menu.HelpMenu;
import xyz.saulmmbp.view.menubar.menu.SMenu;
import xyz.saulmmbp.view.menubar.menu.ViewMenu;

public class MenuBar {

    /* Inicialización de barra de menús */
    private static JMenuBar menuBar;
    
    /* Declaración de menús */
    private JMenu archivo;
    private JMenu edicion;
    private JMenu formato;
    private JMenu ver;
    private JMenu ayuda;
    
    /* Inicializa menus */
    private void initMenus() {
    
        /* Inicializando */
        SMenu tempArchivo = new FileMenu();
        SMenu tempEdicion = new EditMenu();
        SMenu tempFormato = new FormatMenu();
        SMenu tempVer = new ViewMenu();
        SMenu tempAyuda = new HelpMenu();
        
        /* Creando menus */
        archivo = tempArchivo.create();
        edicion = tempEdicion.create();
        formato = tempFormato.create();
        ver = tempVer.create();
        ayuda = tempAyuda.create();
        
    }
    
    /**
     * 
     * @return Regresa la barra de menús configurada
     */
    public JMenuBar create() {
        
        /* Inicializa barra de menús */
        menuBar = new JMenuBar();
        
        /* Inicializando menús */
        initMenus();
        
        /* Agrega menús a barra de menús */
        menuBar.add(archivo);
//        menuBar.add(edicion);
//        menuBar.add(formato);
//        menuBar.add(ver);
//        menuBar.add(ayuda);
        
        return menuBar;
    }

}
