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
public class Cpu implements Serializable{
    private int velocidade,memoria;

    public Cpu(){
    }

    public Cpu(int velocidade, int memoria){
        this.velocidade=velocidade;
        this.memoria=memoria;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public int getMemoria(){
        return memoria;
    }

    public void setVelocidade(int velocidade){
        this.velocidade=velocidade;
    }

    public void setMemoria(int memoria){
        this.memoria=memoria;
    }

    @Override
    public String toString(){
        return "velocidade="+velocidade+", memoria="+memoria;
    }
    
}
