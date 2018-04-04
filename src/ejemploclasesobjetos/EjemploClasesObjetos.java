/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesobjetos;

import ejemploclasesobjetos.Mouse;

/**
 *
 * @author dani
 */
public class EjemploClasesObjetos{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Metodos.escribir("ordenadores.dat");
        Metodos.leer("ordenadores.dat");
        Metodos.anadir("ordenadores.dat");
        Metodos.leer("ordenadores.dat");
    }
    
}
