package xyz.saulmmbp.view;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;

import xyz.saulmmbp.view.menubar.SMenuBar;

public class MainWindow extends JFrame {

    private static final long serialVersionUID = -3354882865572732093L;
    
    private JMenuBar menuBar;
    private JToolBar toolBar;
    private StateBar stateBar;
    private JScrollPane scrollPane;

    public MainWindow() throws HeadlessException {
        
        /* Configura la ventana */
        setTitle("STextEditor");
        setSize(1280, 720);
        
        /* Asigna su estado extendido, es decir, su estado de inicio
         * en este caso maximiza su ancho y su alto 
         */
//        setExtendedState(MAXIMIZED_BOTH);
        
        /* Inicializa los componentes */
        initComponents();
    }

    private void initComponents() {
        
        /* Configuración para la acción de cerrar la ventana */
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        /* Inicializa componentes */
        menuBar = new SMenuBar();
        toolBar = new SToolBar();
        stateBar = new StateBar();
        scrollPane = new JScrollPane();
        
        /* Configuraciones */
            /* scrolls */
        
        /* Agrega Componentes */
        setJMenuBar(menuBar);
        add(toolBar, BorderLayout.NORTH);
        add(stateBar, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.CENTER);
    }
}
