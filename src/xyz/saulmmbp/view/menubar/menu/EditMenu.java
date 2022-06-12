package xyz.saulmmbp.view.menubar.menu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class EditMenu implements SMenu {

    private JMenu menu;
    
    private JMenuItem undo;
    private JMenuItem redo;
    private JMenuItem cut;
    private JMenuItem copy;
    private JMenuItem paste;
    private JMenuItem selectAll;
    private JMenuItem search;
    
    @Override
    public JMenu create() {
        return menu;
    }

    @Override
    public void initItems() {
    }

}
