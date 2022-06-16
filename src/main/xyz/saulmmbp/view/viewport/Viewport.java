package xyz.saulmmbp.view.viewport;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.io.IOException;
import java.net.URL;

import javax.swing.JEditorPane;
import javax.swing.JPanel;

public class Viewport extends JPanel {

    private static final long serialVersionUID = -5653757679455030576L;
    
    private JEditorPane editor;
    
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
        editor = new JEditorPane() {

            private static final long serialVersionUID = -2043112489770676986L;

            @Override
            public boolean getScrollableTracksViewportWidth() {
                return false;
            }

        };
        
        width = 794;
        height = 1123;
        
        fontSize = 14;
        fontType = "Arial";
        fontStyle = Font.PLAIN;
        font = new Font(fontType, fontStyle, fontSize);
        
        
        editor.setPreferredSize(new Dimension(width, height));
        editor.setBackground(Color.WHITE);
        editor.setMargin(new Insets(20, 20, 20, 20));
        editor.setForeground(Color.BLACK);
        editor.setFont(font);
        

        initDocument();
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
    
    private void initDocument() {
        URL url = Viewport.class.getResource("/html/image.html");
        try {
            editor.setPage(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
