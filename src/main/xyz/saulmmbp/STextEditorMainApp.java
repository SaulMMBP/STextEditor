package xyz.saulmmbp;

import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarkLaf;

import xyz.saulmmbp.view.MainWindow;

public class STextEditorMainApp {
    
    /* Declaración de ventana */
    public static MainWindow mainWindow;
    
    public static void main(String[] args) {

        /* Diseño de gui */
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            System.out.println("No se pudo establecer el aspecto deseado");
        }
        
        /* Instancia de ventana principal */
        mainWindow = new MainWindow();
        
        /* Hace visible la ventana */
        mainWindow.setVisible(true);
    }

}
