package xyz.saulmmbp;

import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarkLaf;

import xyz.saulmmbp.view.MainWindow;

public class STextEditorMainApp {
    
    public static MainWindow mainWindow;
    
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            System.out.println("No se pudo establecer el aspecto deseado");
        }
        
        mainWindow = new MainWindow();
        mainWindow.setVisible(true);
    }

}
