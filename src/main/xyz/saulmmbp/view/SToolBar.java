package xyz.saulmmbp.view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class SToolBar extends JToolBar {

    private static final long serialVersionUID = -2171724110672225237L;
    
    private FlowLayout layout;
    
    private JButton guardar;
    private JButton abrir;
    private JButton guardarComo;
    private JButton imprimir;
    private JButton seleccionarTodo;
    private JButton alinearIzq;
    private JButton alinearDer;
    private JButton alinearJust;
    private JButton alinearCent;
    
    private ImageIcon guardarIcon;
    private ImageIcon abrirIcon;
    private ImageIcon guardarComoIcon;
    private ImageIcon imprimirIcon;
    private ImageIcon seleccionarTodoIcon;
    private ImageIcon alinearIzqIcon;
    private ImageIcon alinearDerIcon;
    private ImageIcon alinearJustIcon;
    private ImageIcon alinearCentIcon;
    
    private JSeparator separador0;
    private JSeparator separador1;
    private JSeparator separador2;
    
    public SToolBar() {

        /* Configurando Layout */
        layout = new FlowLayout(FlowLayout.LEFT);
        layout.layoutContainer(this);
        setLayout(layout);
        
        /* Inicializa componentes */
        initComponents();
    }
    
    private void initComponents() {
        
        /* Inicializando componentes */
        guardar = new JButton();
        abrir = new JButton();
        guardarComo = new JButton();
        imprimir = new JButton();
        seleccionarTodo = new JButton();
        alinearIzq = new JButton();
        alinearDer = new JButton();
        alinearJust = new JButton();
        alinearCent = new JButton();
        
        guardarIcon = new ImageIcon(getClass().getResource("/icons/saveIcon.png"));
        abrirIcon = new ImageIcon(getClass().getResource("/icons/openIcon.png"));
        guardarComoIcon = new ImageIcon(getClass().getResource("/icons/saveAsIcon.png"));
        imprimirIcon = new ImageIcon(getClass().getResource("/icons/printIcon.png"));
        seleccionarTodoIcon = new ImageIcon(getClass().getResource("/icons/selectAllIcon.png"));
        alinearIzqIcon = new ImageIcon(getClass().getResource("/icons/alignLeftIcon.png"));
        alinearDerIcon = new ImageIcon(getClass().getResource("/icons/alignRigthIcon.png"));
        alinearJustIcon = new ImageIcon(getClass().getResource("/icons/alignJustifyIcon.png"));
        alinearCentIcon = new ImageIcon(getClass().getResource("/icons/alignCenterIcon.png"));
        
        separador0 = new JSeparator(SwingConstants.VERTICAL);
        separador1 = new JSeparator(SwingConstants.VERTICAL);
        separador2 = new JSeparator(SwingConstants.VERTICAL);
        
        /* Configurando componentes */
            /* Buttons */
                /* ToolTipText */
        guardar.setToolTipText("Guardar");
        abrir.setToolTipText("Abrir");
        guardarComo.setToolTipText("Guardar Como");
        imprimir.setToolTipText("Imprimir");
        seleccionarTodo.setToolTipText("Seleccionar Todo");
        alinearIzq.setToolTipText("Alinear a la Izquierda");
        alinearDer.setToolTipText("Alinear a la Derecha");
        alinearJust.setToolTipText("Alinear Justificado");
        alinearCent.setToolTipText("Alinear Centrado");
        
                /* Estado Focus */
        guardar.setFocusPainted(false);
        abrir.setFocusPainted(false);
        guardarComo.setFocusPainted(false);
        imprimir.setFocusPainted(false);
        seleccionarTodo.setFocusPainted(false);
        alinearIzq.setFocusPainted(false);
        alinearDer.setFocusPainted(false);
        alinearJust.setFocusPainted(false);
        alinearCent.setFocusPainted(false);
        
                /* Iconos */
        guardar.setIcon(guardarIcon);
        abrir.setIcon(abrirIcon);
        guardarComo.setIcon(guardarComoIcon);
        imprimir.setIcon(imprimirIcon);
        seleccionarTodo.setIcon(seleccionarTodoIcon);
        alinearIzq.setIcon(alinearIzqIcon);
        alinearDer.setIcon(alinearDerIcon);
        alinearJust.setIcon(alinearJustIcon);
        alinearCent.setIcon(alinearCentIcon);
        
        separador0.setPreferredSize(new Dimension(4, 16));
        separador1.setPreferredSize(new Dimension(4, 16));
        separador2.setPreferredSize(new Dimension(4, 16));
        
        /* Agregando Componentes */
        add(guardar);
        add(guardarComo);
        add(abrir);
        add(separador0);
        add(imprimir);
        add(separador1);
        add(seleccionarTodo);
        add(separador2);
        add(alinearIzq);
        add(alinearCent);
        add(alinearDer);
        add(alinearJust);
    }
    
}
