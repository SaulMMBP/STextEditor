package xyz.saulmmbp.view.viewport;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.text.BadLocationException;

public class Viewport extends JPanel {

    private static final long serialVersionUID = -5653757679455030576L;
    
    private JEditorPane editor;
    
    private int width;
    private int height;
    
    private Font font;
    private int fontSize;
    private String fontType;
    private int fontStyle;
    
    private String testText;
    
    public Viewport() {
        
        /* Inicializando Componentes */
        initComponents();
    }
    
    private void initComponents() {
        
        /* Inicializando */
        editor = new JEditorPane() {

            @Override
            public boolean getScrollableTracksViewportWidth() {
                return true;
            }

            @Override
            public boolean getScrollableTracksViewportHeight() {
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
        this.testText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In semper eget massa sed tristique. Aliquam pellentesque, nulla vitae interdum accumsan, urna lorem vestibulum sem, sit amet mattis orci lectus at nisi. Fusce quis dapibus dui. Donec eleifend sit amet tellus sed gravida. Suspendisse imperdiet eros sem, eget laoreet dui aliquet nec. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Ut ut felis nulla. Sed sed risus in lectus aliquet ultricies. Sed vitae nunc dictum, tristique nulla vitae, posuere mi. Duis cursus vitae turpis ut ornare. Sed cursus lobortis urna vitae tincidunt. Fusce ornare ipsum at nisi molestie vulputate. Donec et scelerisque mi. Sed mattis rutrum egestas. Phasellus vulputate nisl non felis ultrices, eget efficitur nunc dignissim.\n"
                + "\nDonec ac dolor a augue accumsan euismod. Praesent luctus urna ac velit bibendum eleifend. Quisque molestie, risus et cursus vestibulum, justo dui vulputate odio, interdum commodo dui lacus non augue. Maecenas tincidunt orci vitae hendrerit ornare. Mauris suscipit dolor eget nulla accumsan aliquet. Etiam elementum pretium augue at hendrerit. Aenean turpis lectus, iaculis commodo mattis vitae, viverra quis nisl. Mauris ac ultrices sapien, non gravida ligula. Sed facilisis nisl et lacus imperdiet eleifend. Maecenas vel dui lacinia, convallis nulla id, rhoncus velit. Praesent nisi erat, fermentum at dapibus eget, iaculis sed leo. In a ligula mollis, tempus ante ut, scelerisque erat. Suspendisse dui mauris, elementum laoreet lectus vitae, vehicula sagittis justo. Donec a interdum tortor, vel efficitur diam.\n"
                + "\nDonec laoreet dui risus, pellentesque egestas mi porta sed. Etiam dignissim scelerisque purus molestie luctus. Fusce sapien dui, placerat id metus nec, egestas dapibus lectus. Duis tortor leo, viverra nec sollicitudin id, consequat non quam. Donec eget lectus sit amet erat viverra iaculis in egestas ante. Suspendisse mollis laoreet risus quis mollis. Pellentesque molestie gravida ligula ultrices accumsan. Nullam eget nunc ex. Maecenas in urna at lorem scelerisque ornare. Nullam ullamcorper, massa sit amet vulputate tincidunt, velit nibh cursus quam, rutrum convallis purus arcu elementum dolor.\n"
                + "\nDuis ut vestibulum lacus. Vivamus id viverra massa. Phasellus vitae justo sollicitudin, dignissim metus a, hendrerit neque. Donec mollis sed magna eget tincidunt. Vivamus elit lacus, fringilla sed justo non, feugiat malesuada est. Nam sed nibh mi. Nunc ut ornare tortor, sed consequat urna. Nullam ac nisl id velit ullamcorper fringilla. Nam vel eros non ligula aliquet varius placerat a est. Proin varius, elit ac venenatis pharetra, tortor metus malesuada leo, a efficitur nisl nisi vel leo.\n"
                + "\nMauris porta quam id ligula malesuada, aliquam auctor odio ullamcorper. Quisque quis mi porta, ultricies eros ac, euismod est. Maecenas at dapibus urna, ac fermentum orci. Nam placerat vitae lectus vitae commodo. Maecenas rhoncus libero bibendum diam dignissim, nec blandit dui molestie. Duis cursus sed lectus id pellentesque. Curabitur in egestas metus. Vestibulum in fringilla tellus. Maecenas eget urna sapien. Aenean ac auctor turpis. Vivamus ac maximus lectus.\n";
    
        try {
            editor.getDocument().insertString(editor.getDocument().getLength(), testText, null);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
