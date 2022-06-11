package xyz.saulmmbp.view;

import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import xyz.saulmmbp.view.menubar.MenuBar;

public class MainWindow extends JFrame {

    private static final long serialVersionUID = 7062252125155422559L;
    
    private MenuBar menuBar = new MenuBar();

    /**
     * Constructor de la ventana principal.
     * @throws HeadlessException
     */
    public MainWindow() throws HeadlessException {
        
        /* Asigna el título a la ventana */
        setTitle("MyTextEditor");
        
        /* Asigna el tamaño de la ventana */
        setSize(1280, 720);
        
        /* Asigna su estado extendido, es decir, su estado de inicio
         * en este caso maximiza su ancho y su alto 
         */
        setExtendedState(MAXIMIZED_BOTH);
        
        /* Inicializa los componentes */
        initComponents();
    }

    /**
     * Inicializa los componentes de la ventana principal.
     */
    public void initComponents() {
        
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
        
        /* Carga la barra de menús */
        setJMenuBar(menuBar.render());
    }

    /*
     * Termina la ejecución de la máquina virtual de java
     */
    protected void exitForm(WindowEvent e) {
        System.exit(0);
    }
}
