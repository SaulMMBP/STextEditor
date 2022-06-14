package xyz.saulmmbp.actions;

import java.awt.event.ActionEvent;

import xyz.saulmmbp.STextEditorMainApp;

public class ActionPerformer {
    
    /**
     * Ejecuta código en respuesta a un ActionEvent
     * @param e
     */
    public void salir(ActionEvent e) {
        System.exit(0);
    }
    
    /**
     * Llama a la función zoom de la ventana principal.
     * @param e Parámetro de zoom positivo
     */
    public void positiveZoom(ActionEvent e) {
        STextEditorMainApp.mainWindow.zoom(10);
    }
    
    /**
     * Llama a la función zoom de la ventana principal.
     * @param e Parámetro de zoom negativo
     */
    public void negativeZoom(ActionEvent e) {
        STextEditorMainApp.mainWindow.zoom(-10);
    }
}
