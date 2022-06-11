package xyz.saulmmbp.view.menubar;

import java.awt.Color;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenuBar;

public class MenuBar {

    /* Inicialización de barra de menús */
    private static JMenuBar menuBar = new JMenuBar();
    
    /* Declaración de menús */
    private Menu file = new Menu("File", 'F');
    private Menu edit = new Menu("Edit", 'E');
    private Menu format = new Menu("Format", 'O');
    private Menu view = new Menu("View", 'V');
    private Menu help = new Menu("Help", 'H');
    
    /* Inicialización de items que componenen cada menú */
    /* Menú File */
    private MenuItem nuevo = new MenuItem("New", 'N', KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK);
    private MenuItem open = new MenuItem("Open", 'N');
    private MenuItem save = new MenuItem("Save", 'S', KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK);
    private MenuItem saveAs = new MenuItem("Save as...", 'S');
    private MenuItem print = new MenuItem("Print", 'P', KeyEvent.VK_P, InputEvent.CTRL_DOWN_MASK);
    private MenuItem exit = new MenuItem("Exit", 'E');
    
    /* Menú edit */
    private MenuItem undo = new MenuItem("Undo", 'U', KeyEvent.VK_Z, InputEvent.CTRL_DOWN_MASK);
    private MenuItem redo = new MenuItem("Redo", 'R', KeyEvent.VK_Y, InputEvent.CTRL_DOWN_MASK);
    private MenuItem cut = new MenuItem("Cut", 'C', KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK);
    private MenuItem copy = new MenuItem("Copy", 'C', KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK);
    private MenuItem paste = new MenuItem("Paste", 'P', KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK);
    private MenuItem selectAll = new MenuItem("Select All", 'A', KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK);
    private MenuItem search = new MenuItem("Search", 'S');
    
    /* Menú format */
    private MenuItem lineSpacing = new MenuItem("Line Spacing", 'L');
    private MenuItem font = new MenuItem("Font", 'F');
    private MenuItem align = new MenuItem("Align", 'A');
    
    /* Menú view */
    private MenuItem zoom = new MenuItem("Zoom", 'Z');
    
    /* Menú help */
    private MenuItem about = new MenuItem("About", 'B');
    
    /**
     * 
     * @return Regresa la barra de menús configurada
     */
    public JMenuBar render() {
        
        /* Agrego items a menús */
        /* Menú File */
        file.add(nuevo);
        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(print);
        file.add(exit);
        
        /* Menú edit */
        edit.add(undo);
        edit.add(redo);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        edit.add(search);
        
        /* Menú format */
        format.add(lineSpacing);
        format.add(font);
        format.add(align);
        
        /* Menú View */
        view.add(zoom);
        
        /* Menú Help */
        help.add(about);
       
        /* Agrega menús a barra de menús */
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(format);
        menuBar.add(view);
        menuBar.add(help);
        
        menuBar.setBackground(Color.BLACK);
        
        return menuBar;
    }

}
