package xyz.saulmmbp.view.menubar;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuItem extends JMenuItem {

    private static final long serialVersionUID = 7328067854106363477L;

    public MenuItem() {
    }

    /**
     * 
     * @param text Nombre del item
     */
    public MenuItem(String text) {
        super(text);
    }

    /**
     * 
     * @param text Nombre del item
     * @param mnemonic Mnemónico del item
     */
    public MenuItem(String text, char mnemonic) {
        super(text);
        this.setMnemonic(mnemonic);
    }
    
    /**
     * 
     * @param text Nombre del item
     * @param mnemonic Mnemónico del item
     * @param keyEvent Tecla de acceso rápido {@link java.awt.event.KeyEvent}
     * @param inputEvent Tecla modificadora (alt, ctrl, etc.) {@link java.awt.event.InputEvent} 
     */
    public MenuItem(String text, char mnemonic, int keyEvent, int inputEvent) {
        super(text);
        this.setMnemonic(mnemonic);
        this.setAccelerator(KeyStroke.getKeyStroke(keyEvent, inputEvent));
    }

}
