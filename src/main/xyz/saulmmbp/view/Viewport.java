package xyz.saulmmbp.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Viewport extends JPanel {

    private static final long serialVersionUID = -5653757679455030576L;
    
    private JTextArea editor;
    
    private int width;
    private int height;
    
    private Font font;
    private int fontSize;
    private String fontType;
    private int fontStyle;
    
    public Viewport() {
        
        /* Inicializando Componentes */
        initComponents();
    }
    
    private void initComponents() {
        
        /* Inicializando */
        editor = new JTextArea(32, 58);
        fontSize = 14;
        fontType = "Arial";
        fontStyle = Font.BOLD;
        font = new Font(fontType, fontStyle, fontSize);
        width = 794;
        height = 1123;
        
        /* Configurando */
        editor.setPreferredSize(new Dimension(width, height));
        editor.setBackground(Color.WHITE);
        editor.setLineWrap(true);
        editor.setWrapStyleWord(true);
        editor.setFont(font);
        
        /* Agregando componentes al panel */
        add(editor);
    }
    
    public void zoom(int porcentaje) {
        width = width + porcent(794, porcentaje);
        height = height + porcent(1123, porcentaje);
        fontSize = fontSize + porcent(13, porcentaje);
        editor.setFont(new Font(fontType, fontStyle, fontSize));
        editor.setPreferredSize(new Dimension(width, height));
        
        revalidate();
        repaint();
    }
    
    /* Funciones de utilidad */
    
    private int porcent(int size, int porcentaje) {
        Double porcent = size*(porcentaje/100.00);
        int result = (int) Math.round(porcent);
        return result;
    }
}
