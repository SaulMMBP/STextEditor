package xyz.saulmmbp;

import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarkLaf;

import xyz.saulmmbp.view.MainWindow;

public class JTextEditorMainApp {
    
    private static MainWindow mainWindow;
    
    public static void main(String[] args) {

        for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            System.out.println(info.getName() + ", " + info.getClassName());
        }
        
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            System.out.println("No se pudo establecer el aspecto deseado");
        }
        
        mainWindow = new MainWindow();
        mainWindow.setVisible(true);
    }

}
