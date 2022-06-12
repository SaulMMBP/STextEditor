package xyz.saulmmbp.view.menubar.menu;

import javax.swing.JMenu;

public interface SMenu {

    /**
     * Configura el menú y agrega items
     * @return JMenu
     */
    JMenu create();
    
    /**
     * Inicializa menuItems
     */
    void initItems();
}
