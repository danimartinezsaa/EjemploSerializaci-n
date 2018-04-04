/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesobjetos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class Metodos{
    public static void escribir(String fichero){
        ObjectOutputStream escribir=null;
        
        try{
            escribir=new ObjectOutputStream(new FileOutputStream(fichero));
            Ordenador ordenador=new Ordenador(new Cpu(Integer.parseInt(JOptionPane.showInputDialog("Inserte velocidad cpu")),Integer.parseInt(JOptionPane.showInputDialog("Inserte memoria cpu")))
                    ,new Pantalla(JOptionPane.showInputDialog("Inserte marca de la pantalla"),Integer.parseInt(JOptionPane.showInputDialog("Inserte pulgadas de la pantalla"))),
                    new Rato(new Mouse(JOptionPane.showInputDialog("Inserte tipo ratón"))));
            escribir.writeObject(ordenador);
        }catch(FileNotFoundException ex){
            System.out.println("FileNotFoundException");
        }catch(IOException ex){
            System.out.println("IOException");
        }finally{
            try{
                escribir.close();
            }catch(IOException ex){
                System.out.println("ioException");
            }
        }
    }
    
    public static void leer(String fichero){
        ObjectInputStream leer=null;
        Ordenador aux;
        
        try{
            leer=new ObjectInputStream(new FileInputStream(fichero));
            aux=(Ordenador)leer.readObject();
            while(aux!=null){
                System.out.println(aux.toString());
                aux=(Ordenador)leer.readObject();
            }
        }catch(FileNotFoundException ex){
            System.out.println("FileNotFoundException");
        }catch(IOException ex){
            System.out.println("IOException");
        }catch(ClassNotFoundException ex){
            System.out.println("ClassNotFoundException");
        }finally{
            try{
                leer.close();
            }catch(IOException ex){
                System.out.println("IOException");
            }
        }
        
    }
    
    public static void anadir(String fichero){
        MiObjectOutputStream miO=null;
        ObjectOutputStream anadir=null;
        
        try{
            miO=new MiObjectOutputStream(new FileOutputStream(fichero,true));
            Ordenador ordenador=new Ordenador(new Cpu(Integer.parseInt(JOptionPane.showInputDialog("Inserte velocidad cpu")),Integer.parseInt(JOptionPane.showInputDialog("Inserte memoria cpu")))
                    ,new Pantalla(JOptionPane.showInputDialog("Inserte marca de la pantalla"),Integer.parseInt(JOptionPane.showInputDialog("Inserte pulgadas de la pantalla"))),
                    new Rato(new Mouse(JOptionPane.showInputDialog("Inserte tipo ratón"))));
            miO.writeObject(ordenador);
        }catch(FileNotFoundException ex){
            System.out.println("FileNotFoundException");
        }catch(IOException ex){
            System.out.println("IOException");       
        }catch(NullPointerException np){
            System.out.println("Error nullpointer");
        }finally{
            try{
                miO.close();
            }catch(IOException ex){
                System.out.println("IOException");
            }catch(NullPointerException np){
                System.out.println("Fichero no cerrado");
            }
        }
    }
}
