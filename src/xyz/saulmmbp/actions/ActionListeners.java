package xyz.saulmmbp.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListeners {
    
    private static ActionPerformer actionPerformer;

    /**
     * Crea una clase anónima que sobreescribe el método acitonPerformed
     * para delegar esta función a un {@link xyz.saulmmbp.actions.ActionPerformer}
     * @return ActionListener con función de teminar la ejecución.
     */
    public static ActionListener salir() {
        
        actionPerformer = new ActionPerformer();
        
        ActionListener salirActionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionPerformer.salir(e);
            }
            
        };
        
        return salirActionListener;
    }
    
}
