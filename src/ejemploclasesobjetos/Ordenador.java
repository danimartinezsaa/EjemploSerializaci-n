/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesobjetos;

import java.io.Serializable;

/**
 *
 * @author dani
 */
public class Ordenador implements Serializable{
    private Cpu cpu;
    private Pantalla pantalla;
    private Rato rato;

    public Ordenador(){
        cpu=new Cpu();
        pantalla=new Pantalla();
        rato=new Rato();
    }

    public Ordenador(Cpu cpu, Pantalla pantalla, Rato rato){
        this.cpu=cpu;
        this.pantalla=pantalla;
        this.rato=rato;
    }

    public Cpu getCpu(){
        return cpu;
    }

    public void setCpu(Cpu cpu){
        this.cpu=cpu;
    }

    public Pantalla getPantalla(){
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla){
        this.pantalla=pantalla;
    }

    public Rato getRato(){
        return rato;
    }

    public void setRato(Rato rato){
        this.rato=rato;
    }

    @Override
    public String toString(){
        return "cpu="+cpu+", pantalla="+pantalla+", rato="+rato;
    }
    
}
