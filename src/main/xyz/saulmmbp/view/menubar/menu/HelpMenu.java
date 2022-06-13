package xyz.saulmmbp.view.menubar.menu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class HelpMenu extends JMenu {

    private static final long serialVersionUID = -5958520071885116228L;
    
    private JMenuItem acerca;

    public HelpMenu() {
        
        /* Configurando */
        setText("Ayuda");
        setMnemonic('U');
        
        /* Inicializando */
        initComponents();
    }

    public void initComponents() {
        
        /* Inicializando Items */
        acerca = new JMenuItem();
        
        /* Configurando */
        acerca.setText("Acerca");
        acerca.setMnemonic('A');

        /* Agregando componentes */
        add(acerca);
    }
}
