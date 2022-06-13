package xyz.saulmmbp.view.menubar.menu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FormatMenu extends JMenu {

    private static final long serialVersionUID = 5213399571299426345L;
    
    /* Items */
    private JMenuItem interlineado;
    private JMenuItem fuente;
    
    /* Submenús */
    private JMenu alineacion;

    public FormatMenu() {
        
        /* Configurando */
        setText("Formato");
        setMnemonic('F');
        
        /* Inicializando componentes*/
        initComponents();
    }
    
    public void initComponents() {
        
        /* Inicializamos Items */
        interlineado = new JMenuItem();
        fuente = new JMenuItem();
        
        /* Configuramos */
            /* Etiqueta */
        interlineado.setText("Interlineado");
        fuente.setText("Fuente");
        
            /* Mnemónico */
        interlineado.setMnemonic('I');
        fuente.setMnemonic('F');
        
        /* Inicializando Submenús */
        alineacion = new AlignSubmenu();
        
        /* Agregando items y submenús al menú */
        add(interlineado);
        add(fuente);
        add(alineacion);
    }
}
