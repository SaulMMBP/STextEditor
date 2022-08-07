package xyz.saulmmbp.view;

import java.awt.HeadlessException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class MainWindow extends JFrame {

    private static final long serialVersionUID = -3354882865572732093L;

    /* Componentes */
    private JMenuBar menuBar;
    private JToolBar toolBar;
    private JScrollPane scrollPane;
    private JTextArea textArea;
    
    private JMenu menuArchivo;
    private JMenu menuEdicion;
    private JMenu menuOpciones;
    
    private JMenu submnFuente;
    private JMenu submnTamano;
    
    private JMenuItem mnItmSalir;
    private JMenuItem mnItmCortar;
    private JMenuItem mnItmCopiar;
    private JMenuItem mnItmPegar;
    private JMenuItem mnItmCourierNew;
    private JMenuItem mnItmArial;
    private JMenuItem mnItmFuentePred;
    private JMenuItem mnItm16;
    private JMenuItem mnItm24;
    private JMenuItem mnItmTamanoPred;
    
    
    public MainWindow() throws HeadlessException {

        /* Configura la ventana */
        setTitle("STextEditor");
        setSize(500, 300);
        
        /* Configuración para la acción de cerrar la ventana */
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        /* Inicializa los componentes */
        initComponents();
    }

    private void initComponents() {
        
        /* Inicialización de componentes */
        menuBar = new JMenuBar();
        toolBar = new JToolBar();
        scrollPane = new JScrollPane();
        textArea = new JTextArea();
        
        menuArchivo = new JMenu();
        menuEdicion = new JMenu();
        menuOpciones = new JMenu();
        
        submnFuente = new JMenu();
        submnTamano = new JMenu();
        
        mnItmSalir = new JMenuItem();
        mnItmCortar = new JMenuItem();
        mnItmCopiar = new JMenuItem();
        mnItmPegar = new JMenuItem();
        mnItmCourierNew = new JMenuItem();
        mnItmArial = new JMenuItem();
        mnItmFuentePred = new JMenuItem();
        mnItm16 = new JMenuItem();
        mnItm24 = new JMenuItem();
        mnItmTamanoPred = new JMenuItem();
        
        /* Configuración de scrollPane */
        scrollPane.setViewportView(textArea);
        
        /* Configuración de textArea */
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        
        /* Configuración de menus */
        menuArchivo.setText("Archivo");
        menuArchivo.setMnemonic('A');
        
        menuEdicion.setText("Edición");
        menuEdicion.setMnemonic('E');
        
        menuOpciones.setText("Opciones");
        menuOpciones.setMnemonic('O');
        
        submnFuente.setText("Fuente");
        submnFuente.setMnemonic('F');
        
        submnTamano.setText("Tamaño");
        submnTamano.setMnemonic('T');
        
        /* Configuración de Items de menú */
        mnItmSalir.setText("Salir");
        mnItmSalir.setMnemonic('S');
        
        mnItmCortar.setText("Cortar");
        mnItmCortar.setMnemonic('R');
        mnItmCortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        
        mnItmCopiar.setText("Copiar");
        mnItmCopiar.setMnemonic('C');
        mnItmCopiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));

        mnItmPegar.setText("Pegar");
        mnItmPegar.setMnemonic('P');
        mnItmPegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
        
        mnItmCourierNew.setText("Courier New");
        mnItmCourierNew.setMnemonic('C');
        
        mnItmArial.setText("Arial");
        mnItmArial.setMnemonic('A');
        
        mnItmFuentePred.setText("Predeterminada");
        mnItmFuentePred.setMnemonic('P');
        
        mnItm16.setText("16");
        
        mnItm24.setText("24");
        
        mnItmTamanoPred.setText("Predeterminado");
        
        /* añado items a menus y submenus */
        menuArchivo.add(mnItmSalir);
        
        menuEdicion.add(mnItmCopiar);
        menuEdicion.add(mnItmCortar);
        menuEdicion.add(mnItmPegar);
        
        menuOpciones.add(submnFuente);
        menuOpciones.add(submnTamano);
        
        submnFuente.add(mnItmCourierNew);
        submnFuente.add(mnItmArial);
        submnFuente.add(mnItmFuentePred);
        
        submnTamano.add(mnItm16);
        submnTamano.add(mnItm24);
        submnTamano.add(mnItmTamanoPred);
        
        /* añado menus a barra de menus */
        menuBar.add(menuArchivo);
        menuBar.add(menuEdicion);
        menuBar.add(menuOpciones);
        
        /* añado componentes a la ventana */
        add(toolBar);
        add(scrollPane);

        /* añado barra de menus a la ventana */
        setJMenuBar(menuBar);

    }


}
