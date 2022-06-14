package xyz.saulmmbp.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListeners {
    
    private static ActionPerformer actionPerformer;
    
    

    /**
     * Crea una clase anónima que sobreescribe el método acitonPerformed
     * para delegar el trabajo a {@link xyz.saulmmbp.actions.ActionPerformer.salir}
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
    
    /**
     * Crea una clase anónima que sobreescribe el método acitonPerformed
     * para delegar el trabajo a {@link xyz.saulmmbp.actions.ActionPerformer.salir}
     * @return ActionListener que aumenta el tamaño del documento a crear.
     */
    public static ActionListener positiveZoom() {
        
        actionPerformer = new ActionPerformer();
        
        ActionListener zoomActionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionPerformer.positiveZoom(e);
                
            }
        };
        
        return zoomActionListener;
    }
    
    /**
     * Crea una clase anónima que sobreescribe el método acitonPerformed
     * para delegar el trabajo a {@link xyz.saulmmbp.actions.ActionPerformer.salir}
     * @return ActionListener que disminuye el tamaño del documento a crear.
     */
    public static ActionListener negativeZoom() {
        
        actionPerformer = new ActionPerformer();
        
        ActionListener zoomActionListener = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                actionPerformer.negativeZoom(e);
            }
        };
        
        return zoomActionListener;
    }
    
}
