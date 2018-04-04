/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesobjetos;

import ejemploclasesobjetos.Mouse;
import java.io.Serializable;

/**
 *
 * @author dani
 */
public class Rato implements Serializable{
    private Mouse mouse;

    public Rato(){
    }

    public Rato(Mouse mouse){
        this.mouse=mouse;
    }

    public Mouse getMouse(){
        return mouse;
    }

    public void setMouse(Mouse mouse){
        this.mouse=mouse;
    }

    @Override
    public String toString(){
        return "mouse="+mouse;
    }
    
}
