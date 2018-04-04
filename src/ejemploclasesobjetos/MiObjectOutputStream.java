/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesobjetos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author dani
 */
public class MiObjectOutputStream extends ObjectOutputStream {
    
    public MiObjectOutputStream()throws IOException{
        
    }
    public MiObjectOutputStream(OutputStream ou)throws IOException{
        super(ou);
    }
    
    @Override
    protected void writeStreamHeader() throws IOException
    {
    } 
}