package xyz.saulmmbp.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
    private static JTextArea textArea;
    
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
    
    private JButton btnCopiar;
    private JButton btnCortar;
    private JButton btnPegar;
    
    private static Font fuentePred;
    
    public MainWindow() throws HeadlessException {

        /* Configura la ventana */
        setTitle("STextEditor");
        setSize(500, 300);
        
        /* Configuración para la acción de cerrar la ventana */
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        /* Inicializa los componentes */
        initComponents();
        
        /* Escuchadores de ventana */
        addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent event) {
                formWindowOpened(event);
            }
        });
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
        
        btnCopiar = new JButton();
        btnCortar = new JButton();
        btnPegar = new JButton();
        
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
        mnItmSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                salirActionPerformed(event);
            }
        });
        
        mnItmCortar.setText("Cortar");
        mnItmCortar.setMnemonic('R');
        mnItmCortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        mnItmCortar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                cortarActionPerformed(event);
            }
        });
        
        mnItmCopiar.setText("Copiar");
        mnItmCopiar.setMnemonic('C');
        mnItmCopiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        mnItmCopiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                copiarActionPerformed(event);
            }
        });
        
        mnItmPegar.setText("Pegar");
        mnItmPegar.setMnemonic('P');
        mnItmPegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
        mnItmPegar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                pegarActionPerformed(event);
            }
        });
        
        mnItmCourierNew.setText("Courier New");
        mnItmCourierNew.setMnemonic('C');
        mnItmCourierNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                courierNewActionPerformed(event);
            }
        });
        
        mnItmArial.setText("Arial");
        mnItmArial.setMnemonic('A');
        mnItmArial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                arialActionPerformed(event);
            }
        });
        
        mnItmFuentePred.setText("Predeterminada");
        mnItmFuentePred.setMnemonic('P');
        mnItmFuentePred.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                fuentePredActionPerformed(event);
            }
        });
        
        mnItm16.setText("16");
        mnItm16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                tamano16ActionPerformed(event);
            }
        });
        
        mnItm24.setText("24");
        mnItm24.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                tamano24ActionPerformed(event);
            }
        });
        
        mnItmTamanoPred.setText("Predeterminado");
        mnItmTamanoPred.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                tamanoPredActionPerformed(event);
            }
        });
        
        /* Configuración de botones */
        btnCopiar.setFocusPainted(false);
        btnCopiar.setToolTipText("Copiar");
        btnCopiar.setIcon(new ImageIcon(getClass().getResource("/icons/copy.png")));
        btnCopiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                copiarActionPerformed(event);
            }
        });
        
        btnCortar.setFocusPainted(false);
        btnCortar.setToolTipText("Cortar");
        btnCortar.setIcon(new ImageIcon(getClass().getResource("/icons/cut.png")));
        btnCortar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                cortarActionPerformed(event);
            }
        });
        
        btnPegar.setFocusPainted(false);
        btnPegar.setToolTipText("Pegar");
        btnPegar.setIcon(new ImageIcon(getClass().getResource("/icons/paste.png")));
        btnPegar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                pegarActionPerformed(event);
            }
        });
        
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
        
        /* añado botones a barra de herramientas */
        toolBar.add(btnCopiar);
        toolBar.add(btnCortar);
        toolBar.add(btnPegar);

        /* añado barra de menus a la ventana */
        setJMenuBar(menuBar);

        /* añado componentes a la ventana */
        add(toolBar, BorderLayout.NORTH);
        add(scrollPane);
    }
    
    /**
     * Método que responde a eventos de ventana 
     * @param event
     */
    private static void formWindowOpened(WindowEvent event) {
        /* Enfoca el textArea al abrir la ventana */
        textArea.requestFocus();
        
        /* Almacena la fuente inicial */
        fuentePred = textArea.getFont();
    }
    
    /**
     * Método que responde a eventos para terminar la ejecución
     * @param event
     */
    private static void salirActionPerformed(ActionEvent event) {
        System.exit(0);
    }
    
    /**
     * Método que responde a eventos para cortar texto
     * @param event
     */
    private static void cortarActionPerformed(ActionEvent event) {
        textArea.cut();
    }
    
    /**
     * Método que responde a eventos para copiar texto
     * @param event
     */
    private static void  copiarActionPerformed(ActionEvent event) {
        textArea.copy();
    }
    
    /**
     * Método que responde a eventos para pegar texto
     * @param event
     */
    private static void pegarActionPerformed(ActionEvent event) {
        textArea.paste();
    }

    /**
     * Método que responde a eventos de cambio de fuente a fuente tipo 'Courier New'
     * @param event
     */
    private static void courierNewActionPerformed(ActionEvent event) {
        Font fuente = textArea.getFont();
        fuente = new Font("Courier New", fuente.getStyle(), fuente.getSize());
        textArea.setFont(fuente);
    }
    
    /**
     * Método que responde a eventos de cambio de fuente a fuente tipo 'Arial'
     * @param event
     */
    private static void arialActionPerformed(ActionEvent event) {
        Font fuente = textArea.getFont();
        fuente = new Font("Arial", fuente.getStyle(), fuente.getSize());
        textArea.setFont(fuente);
    }
    
    /**
     * Método que responde a eventos de cambio de fuente a la fuente predeterminada
     * @param event
     */
    private static void fuentePredActionPerformed(ActionEvent event) {
        Font fuente = textArea.getFont();
        fuente = new Font(fuentePred.getFamily(), fuente.getStyle(), fuente.getSize());
        textArea.setFont(fuente);
    }
    
    /**
     * Método que responde a eventos de cambio de tamaño de fuente a fuente 16
     * @param event
     */
    private static void tamano16ActionPerformed(ActionEvent event) {
        Font fuente = textArea.getFont();
        fuente = new Font(fuente.getFamily(), fuente.getStyle(), 16);
        textArea.setFont(fuente);
    }
    
    /**
     * Método que responde a eventos de cambio de tamaño de fuente a fuente 24
     * @param event
     */
    private static void tamano24ActionPerformed(ActionEvent event) {
        Font fuente = textArea.getFont();
        fuente = new Font(fuente.getFamily(), fuente.getStyle(), 24);
        textArea.setFont(fuente);
    }
    
    /**
     * Método que responde a eventos de cambio de tamaño de fuente a la fuente predeterminada
     * @param event
     */
    private static void tamanoPredActionPerformed(ActionEvent event) {
        Font fuente = textArea.getFont();
        fuente = new Font(fuente.getFamily(), fuente.getStyle(), fuentePred.getSize());
        textArea.setFont(fuente);
    }

}
