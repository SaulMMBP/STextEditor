package xyz.saulmmbp.view.menubar.menu;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;

public class EditMenu extends JMenu {

    private static final long serialVersionUID = -8046603148588504135L;
    
    private JMenuItem deshacer;
    private JMenuItem rehacer;
    private JMenuItem cortar;
    private JMenuItem copiar;
    private JMenuItem pegar;
    private JMenuItem seleccionarTodo;
    private JMenuItem buscar;
    
    private JSeparator separador0;
    private JSeparator separador1;
    private JSeparator separador2;
    
    public EditMenu() {

        /* Configuramos Menú */
        setText("Edición");
        setMnemonic('E');
        
        /* Inicializamos componentes*/
        initComponents();
        
    }
    
    private void initComponents() {
        
        /* Inicialización */
        deshacer = new JMenuItem();
        rehacer = new JMenuItem();
        cortar = new JMenuItem();
        copiar = new JMenuItem();
        pegar  = new JMenuItem();
        seleccionarTodo = new JMenuItem();
        buscar = new JMenuItem();
        
        separador0 = new JSeparator();
        separador1 = new JSeparator();
        separador2 = new JSeparator();
        
        /* Configuración */
            /* Etiqueta */
        deshacer.setText("Deshacer");
        rehacer.setText("rehacer");
        cortar.setText("Cortar");
        copiar.setText("Copiar");
        pegar.setText("Pegar");
        seleccionarTodo.setText("Seleccionar Todo");
        buscar.setText("Buscar");
        
            /* Mnemónico */
        deshacer.setMnemonic('D');
        rehacer.setMnemonic('R');
        cortar.setMnemonic('C');
        copiar.setMnemonic('C');
        pegar.setMnemonic('P');
        seleccionarTodo.setMnemonic('S');
        buscar.setMnemonic('B');
        
            /* Acceleradores */
        deshacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_DOWN_MASK));
        rehacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_DOWN_MASK));
        cortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        copiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        pegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
        seleccionarTodo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
        buscar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK));
        
        /* Agregando componentes */
        add(deshacer);
        add(rehacer);
        add(separador0);
        add(cortar);
        add(copiar);
        add(pegar);
        add(separador1);
        add(seleccionarTodo);
        add(separador2);
        add(buscar);
    }
}