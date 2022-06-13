package xyz.saulmmbp.view.menubar.menu;

import javax.swing.JMenu;

public class ViewMenu extends JMenu {

    private static final long serialVersionUID = -5157897543934844325L;
    
    private JMenu zoom;

    public ViewMenu() {
        
        /* Configurando */
        setText("Ver");
        setMnemonic('V');
        
        /* Inicializando */
        initComponents();
    }

    public void initComponents() {
        
        /* Inicializando Submenús */
        zoom = new ZoomSubmenu();

        /* Agregando Componentes */
        add(zoom);
    }
}
