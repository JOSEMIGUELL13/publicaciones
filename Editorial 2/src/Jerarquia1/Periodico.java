/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jerarquia1;

import jerarquia.*;

/**
 *
 * @author miguelgudinogalindo
 */
public class Periodico extends Publicaciones implements Periodicidad  {
    private String editor;
    private String periodicidad;

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public static String getPeriodo() {
        return periodo;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
    
}
