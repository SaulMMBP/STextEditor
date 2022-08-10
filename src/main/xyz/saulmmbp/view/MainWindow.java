package xyz.saulmmbp.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.undo.UndoManager;

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
    
    private JPopupMenu popupMenu;
    
    private JMenuItem mnItmSalir;
    private JMenuItem mnItmCortar;
    private JMenuItem mnItmCopiar;
    private JMenuItem mnItmPegar;
    private JMenuItem mnItmDeshacer;
    private JMenuItem mnItmRehacer;
    
    private JCheckBoxMenuItem mnItmCourierNew;
    private JCheckBoxMenuItem mnItmArial;
    private JCheckBoxMenuItem mnItmFuentePred;
    private JRadioButtonMenuItem mnItm16;
    private JRadioButtonMenuItem mnItm24;
    private JRadioButtonMenuItem mnItmTamanoPred;
    
    private JMenuItem popMnItmCopiar;
    private JMenuItem popMnItmCortar;
    private JMenuItem popMnItmPegar;
    
    private JButton btnCopiar;
    private JButton btnCortar;
    private JButton btnPegar;
    
    private Font fuentePred;
    
    private ButtonGroup grupoTamano;
    
    private UndoManager undoRedo;
    
    private URL url = getClass().getResource("/icons/logo.png");
    private Image imagen = getToolkit().getImage(url);
    
    private int anchoForm;
    private int altoForm;
    
    public MainWindow() throws HeadlessException {
        
        anchoForm = 500;
        altoForm = 300;
        
        /* Configura la ventana */
        setTitle("STextEditor");
        setSize(anchoForm, altoForm);
        setIconImage(imagen);
        
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
        
        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent event) {
                formComponentResized(event);
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
        mnItmCourierNew = new JCheckBoxMenuItem();
        mnItmArial = new JCheckBoxMenuItem();
        mnItmFuentePred = new JCheckBoxMenuItem();
        mnItm16 = new JRadioButtonMenuItem();
        mnItm24 = new JRadioButtonMenuItem();
        mnItmTamanoPred = new JRadioButtonMenuItem();
        mnItmDeshacer = new JMenuItem();
        mnItmRehacer = new JMenuItem();
        
        btnCopiar = new JButton();
        btnCortar = new JButton();
        btnPegar = new JButton();
        
        grupoTamano = new ButtonGroup();
        
        undoRedo = new UndoManager();
        
        popupMenu = new JPopupMenu();
        
        popMnItmCopiar = new JMenuItem();
        popMnItmCortar = new JMenuItem();
        popMnItmPegar = new JMenuItem();
        
        /* Configuración de scrollPane */
        scrollPane.setViewportView(textArea);
        
        /* Configuración de textArea */
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent event) {
                mousePressedActionPerformed(event);
            }
        });
        
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
        mnItmFuentePred.setSelected(true);
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
        mnItmTamanoPred.setSelected(true);
        mnItmTamanoPred.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                tamanoPredActionPerformed(event);
            }
        });
        
        mnItmDeshacer.setText("Deshacer");
        mnItmDeshacer.setMnemonic('D');
        mnItmDeshacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, InputEvent.CTRL_DOWN_MASK));
        mnItmDeshacer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                deshacerActionPerformed(event);
            }
        });
        
        mnItmRehacer.setText("Rehacer");
        mnItmRehacer.setMnemonic('R');
        mnItmRehacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, InputEvent.CTRL_DOWN_MASK));
        mnItmDeshacer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                rehacerActionPerformed(event);
            }
        });
        
        popMnItmCortar.setText("Cortar");
        popMnItmCortar.setMnemonic('R');
        popMnItmCortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        popMnItmCortar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                cortarActionPerformed(event);
            }
        });
        
        popMnItmCopiar.setText("Copiar");
        popMnItmCopiar.setMnemonic('C');
        popMnItmCopiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        popMnItmCopiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                copiarActionPerformed(event);
            }
        });
        
        popMnItmPegar.setText("Pegar");
        popMnItmPegar.setMnemonic('P');
        popMnItmPegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
        popMnItmPegar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                pegarActionPerformed(event);
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
        menuEdicion.addMenuListener(new MenuListener() {
            public void menuSelected(MenuEvent e) {
                menuEdicionSelected(e);
            }
            
            public void menuDeselected(MenuEvent e) {
            }
            
            public void menuCanceled(MenuEvent e) {
            }
            
        });
        
        menuOpciones.add(submnFuente);
        menuOpciones.add(submnTamano);
        
        submnFuente.add(mnItmCourierNew);
        submnFuente.add(mnItmArial);
        submnFuente.add(mnItmFuentePred);
        
        submnTamano.add(mnItm16);
        submnTamano.add(mnItm24);
        submnTamano.add(mnItmTamanoPred);
        
        menuEdicion.add(mnItmDeshacer);
        menuEdicion.add(mnItmRehacer);
        
        /* añado Items a menu emergente */
        popupMenu.add(popMnItmCopiar);
        popupMenu.add(popMnItmCortar);
        popupMenu.add(popMnItmPegar);

        
        /*Segunda forma para hacer que solo una opción esté seleccionada
         * de un grupo de opciones.
         */
        /* añado items a buttonGroup para agruparlos */
        grupoTamano.add(mnItm16);
        grupoTamano.add(mnItm24);
        grupoTamano.add(mnItmTamanoPred);
        
        /* añado menus a barra de menus */
        menuBar.add(menuArchivo);
        menuBar.add(menuEdicion);
        menuBar.add(menuOpciones);
        
        /* añado botones a barra de herramientas */
        toolBar.add(btnCopiar);
        toolBar.add(btnCortar);
        toolBar.add(btnPegar);
        
        /* Recuerda cada operación de edición para poder deshacer y rehacer */
        textArea.getDocument().addUndoableEditListener(undoRedo);

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
    private void formWindowOpened(WindowEvent event) {
        /* Enfoca el textArea al abrir la ventana */
        textArea.requestFocus();
        
        /* Almacena la fuente inicial */
        fuentePred = textArea.getFont();
    }
    
    /**
     * Método que responde a eventos para terminar la ejecución
     * @param event
     */
    private void salirActionPerformed(ActionEvent event) {
        System.exit(0);
    }
    
    /**
     * Método que responde a eventos para cortar texto
     * @param event
     */
    private void cortarActionPerformed(ActionEvent event) {
        textArea.cut();
    }
    
    /**
     * Método que responde a eventos para copiar texto
     * @param event
     */
    private void  copiarActionPerformed(ActionEvent event) {
        textArea.copy();
    }
    
    /**
     * Método que responde a eventos para pegar texto
     * @param event
     */
    private void pegarActionPerformed(ActionEvent event) {
        textArea.paste();
    }

    /**
     * Método que responde a eventos de cambio de fuente a fuente tipo 'Courier New'
     * @param event
     */
    private void courierNewActionPerformed(ActionEvent event) {
        Font fuente = textArea.getFont();
        fuente = new Font("Courier New", fuente.getStyle(), fuente.getSize());
        textArea.setFont(fuente);
        
        /* selección de una sola opción, primera forma de realizarse */
        mnItmArial.setState(false);
        mnItmFuentePred.setState(false);
    }
    
    /**
     * Método que responde a eventos de cambio de fuente a fuente tipo 'Arial'
     * @param event
     */
    private void arialActionPerformed(ActionEvent event) {
        Font fuente = textArea.getFont();
        fuente = new Font("Arial", fuente.getStyle(), fuente.getSize());
        textArea.setFont(fuente);
        
        /* selección de una sola opción, primera forma de realizarse */
        mnItmCourierNew.setState(false);
        mnItmFuentePred.setState(false);
    }
    
    /**
     * Método que responde a eventos de cambio de fuente a la fuente predeterminada
     * @param event
     */
    private void fuentePredActionPerformed(ActionEvent event) {
        Font fuente = textArea.getFont();
        fuente = new Font(fuentePred.getFamily(), fuente.getStyle(), fuente.getSize());
        textArea.setFont(fuente);
        
        /* selección de una sola opción, primera forma de realizarse */
        mnItmCourierNew.setState(false);
        mnItmArial.setState(false);
    }
    
    /**
     * Método que responde a eventos de cambio de tamaño de fuente a fuente 16
     * @param event
     */
    private void tamano16ActionPerformed(ActionEvent event) {
        Font fuente = textArea.getFont();
        fuente = new Font(fuente.getFamily(), fuente.getStyle(), 16);
        textArea.setFont(fuente);
    }
    
    /**
     * Método que responde a eventos de cambio de tamaño de fuente a fuente 24
     * @param event
     */
    private void tamano24ActionPerformed(ActionEvent event) {
        Font fuente = textArea.getFont();
        fuente = new Font(fuente.getFamily(), fuente.getStyle(), 24);
        textArea.setFont(fuente);
    }
    
    /**
     * Método que responde a eventos de cambio de tamaño de fuente a la fuente predeterminada
     * @param event
     */
    private void tamanoPredActionPerformed(ActionEvent event) {
        Font fuente = textArea.getFont();
        fuente = new Font(fuente.getFamily(), fuente.getStyle(), fuentePred.getSize());
        textArea.setFont(fuente);
    }
    
    /**
     * Método que responde a eventos de selección de texto para activar las opciones copiar
     * y cortar.
     * @param event
     */
    private void menuEdicionSelected(MenuEvent event) {
        boolean textSelect = textArea.getSelectedText() != null;
        mnItmCopiar.setEnabled(textSelect);
        mnItmCortar.setEnabled(textSelect);
    }
    
    /**
     * Método que responde a eventos de deshacer
     * @param event
     */
    private void deshacerActionPerformed(ActionEvent event) {
        if (undoRedo.canUndo()) undoRedo.undo();
    }

    /**
     * Método que responde a eventos de rehacer
     * @param event
     */
    private void rehacerActionPerformed(ActionEvent event) {
        if (undoRedo.canRedo()) undoRedo.redo();
    }
    
    /**
     * Método que responde a eventos de mouse sobre el editor de texto
     * @param event
     */
    private void mousePressedActionPerformed(MouseEvent event) {
        /* Deshabilita las opciones copiar y cortar si no hay testo seleccionado */
        boolean textSelect = textArea.getSelectedText() != null;
        popMnItmCopiar.setEnabled(textSelect);
        popMnItmCortar.setEnabled(textSelect);
        
        /* Visualizar el menu emergente al pulsar el botón derecho */
        if (event.getButton() == MouseEvent.BUTTON3)
            popupMenu.show(textArea, event.getX(), event.getY());
    }
    
    /**
     * Método que responde al evento "componente redimensionado"
     * @param event
     */
    private void formComponentResized(ComponentEvent event) {
        
        /* Tamaño de la ventana después de redimensionarse */
        int xframe = getWidth();
        int yframe = getHeight();
        
        /* Tamaño del scrollpane */
        int xScrollPane = scrollPane.getWidth();
        int yScrollPane = scrollPane.getHeight();
        
        /* Ajusto el tamaño del textarea y del scrollpane */
        scrollPane.setSize(xScrollPane + xframe - anchoForm, yScrollPane + yframe - altoForm);
        textArea.setSize(xScrollPane + xframe - anchoForm, yScrollPane + yframe - altoForm);
        
        /* nuevo tamaño de la ventana */
        anchoForm = xframe;
        altoForm = yframe;
    }
}
