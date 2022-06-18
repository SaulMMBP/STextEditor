package xyz.saulmmbp.view.viewport;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Viewport extends JPanel {

    private static final long serialVersionUID = -5653757679455030576L;
    
    private JTextPane editor;
    
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
        editor = new JTextPane();
        
        width = 794;
        height = 1123;
        
        fontSize = 14;
        fontType = "Arial";
        fontStyle = Font.PLAIN;
        font = new Font(fontType, fontStyle, fontSize);
        
//        document = editor.getDocument();
//        doc = (AbstractDocument) document;
//        doc.setDocumentFilter(new DocumentHeightFilter());
        
        /* Configurando */
        editor.setPreferredSize(new Dimension(width, height));
        editor.setMaximumSize(new Dimension(width, height));
        editor.setBackground(Color.WHITE);
        editor.setMargin(new Insets(20, 20, 20, 20));
        editor.setForeground(Color.BLACK);
        editor.setFont(font);
        
        initDocument();
        /* Agregando componentes al panel */
        add(editor);
        
    }
    
    /* Estoy en duda de este método */
    
    public void zoom(int porcentaje) {
        width = width + porcent(794, porcentaje);
        height = height + porcent(1123, porcentaje);
        fontSize = fontSize + porcent(14, porcentaje);
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
        editor.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean consectetur nulla facilisis auctor sodales. Praesent id finibus dolor, non commodo purus. Nam vel mi eu purus vehicula commodo. Ut urna ligula, iaculis et ullamcorper et, interdum nec lacus. Vivamus faucibus tincidunt nisi, sit amet sagittis sapien maximus vel. Mauris et faucibus augue. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Donec sed lorem velit. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Proin vestibulum sodales arcu, nec vehicula nunc viverra non. Pellentesque euismod rutrum risus ut consequat.\r\n" 
                + "Proin et nisi nec lectus ornare rutrum. Nulla laoreet tempor felis, at feugiat sem sagittis maximus. Vestibulum interdum vehicula metus sit amet accumsan. Sed ante lacus, volutpat ut est vel, egestas luctus nibh. Nullam nec velit sed lorem condimentum tempus ut quis dolor. In et tincidunt eros. Sed est sem, viverra ac malesuada in, consequat non eros. Aenean varius ac libero et luctus. Mauris volutpat arcu magna. Praesent arcu nunc, pulvinar eu erat id, malesuada mattis lacus. Cras varius sem neque, non sagittis ex pulvinar a.\r\n" 
                + "Aliquam commodo lorem in diam pretium, porttitor lobortis felis facilisis. Morbi rhoncus luctus neque, vel placerat est faucibus at. Duis sagittis libero risus, sed porttitor erat volutpat eget. Pellentesque hendrerit enim vitae placerat cursus. Maecenas luctus, justo vitae finibus rutrum, nisl tortor cursus massa, sit amet sollicitudin erat nisl non sapien. Maecenas eget fringilla augue, a fringilla erat. Fusce imperdiet sed dolor sit amet fringilla. Sed quis eleifend leo. Mauris a felis ligula. Nulla euismod, purus a dapibus eleifend, nulla lorem volutpat velit, ac sodales leo urna ac orci. Phasellus sit amet convallis sem. Morbi fermentum dui arcu, et hendrerit eros interdum nec. Nunc varius, arcu eget gravida mollis, orci lorem congue diam, a condimentum enim eros sed felis. Nulla porta justo faucibus, aliquam mi nec, venenatis nisi. Quisque venenatis vel orci sed lobortis.\r\n" 
                + "Etiam porttitor justo ut luctus blandit. Proin placerat, metus eu tincidunt dictum, diam neque vestibulum arcu, at convallis lorem mauris vitae dolor. Praesent mi nunc, pharetra vel blandit sed, porttitor ut lacus. Fusce risus libero, volutpat at ullamcorper eu, lobortis at ex. Duis faucibus tellus eu lectus gravida pellentesque. Aenean imperdiet tempus aliquet. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Nullam lacinia congue ullamcorper. Maecenas lobortis magna id nunc accumsan iaculis. Sed scelerisque egestas turpis.\r\n" 
                + "Fusce sit amet risus tortor. Aliquam aliquet felis vel elementum congue. Quisque ultrices turpis urna, nec gravida ante pulvinar ut. Vivamus et neque viverra, consectetur lorem id, posuere massa. Quisque id risus nec ipsum sollicitudin feugiat sit amet id nulla. Cras fermentum dolor id quam sagittis, a placerat nisi faucibus. Etiam ac ex erat. Nunc interdum quam a faucibus mattis. Phasellus blandit metus tortor, vestibulum consequat metus finibus a. Quisque eleifend eros massa, vitae ultricies neque molestie at. Donec sagittis urna eget massa suscipit, rhoncus suscipit mi vestibulum. Nullam fringilla dui dolor, sed accumsan sem auctor id. Curabitur semper mauris ante, sit amet laoreet mi luctus non. Aenean bibendum ultricies nisi vitae porttitor.");    
    }
}
