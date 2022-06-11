package xyz.saulmmbp.view.menubar;

import javax.swing.JMenu;

public class Menu extends JMenu {

    private static final long serialVersionUID = 199917575069665599L;

    public Menu() {
    }

    /**
     * 
     * @param s Nombre del menú
     */
    public Menu(String s) {
        super(s);
    }

    /**
     * 
     * @param s Nombre del menú
     * @param mnemonic Mnemónico del menú
     */
    public Menu(String s, char mnemonic) {
        super(s);
        this.setMnemonic(mnemonic);
    }
}
