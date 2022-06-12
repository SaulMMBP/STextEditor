package xyz.saulmmbp.view;

import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

import xyz.saulmmbp.view.menubar.SMenuBar;

public class MainWindow extends JFrame {

    private static final long serialVersionUID = -3354882865572732093L;
    
    private JMenuBar menuBar;

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
        
        /* Asigna el Layout de la ventana */
        getContentPane().setLayout(null);
        
        /* Agrega un listener a la ventana */
        addWindowListener(new WindowAdapter() {
            
            /**
             * Sobreescribe el método windowClosing para ejecutar el método exitForm 
             * cuando se cierre la ventana
             */
            @Override
            public void windowClosing(WindowEvent e) {
                exitForm(e);
            }
            
        });
        
        /* Inicializa componentes */
        menuBar = new SMenuBar();
        
        /* Agrega Componentes */
        setJMenuBar(menuBar);
    }

    /*
     * Termina la ejecución de la máquina virtual de java
     */
    protected void exitForm(WindowEvent e) {
        System.exit(0);
    }
}
