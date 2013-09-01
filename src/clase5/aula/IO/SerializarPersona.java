/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5.aula.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author PFR
 */
public class SerializarPersona {
    public static void main(String[] args) {
        
        //SerializarPersona.seriaLizarPersona();
        SerializarPersona.DeserializarPersona();
    }
    public static void seriaLizarPersona()
    {
              
        ObjectOutputStream salida = null;
        
        Persona p1 = new Persona("Alonso", 23);
        
        try {
              
               
             FileOutputStream archivo = new FileOutputStream("E:\\musica\\Persona.txt");
            salida  = new ObjectOutputStream(archivo);
            salida.writeObject(p1);
            salida.flush();
        } catch (IOException e){
            System.out.println("Imposible crear el archivo o escribir en él");
        } finally {
            try {
                salida.close();
            } catch (IOException e){
                System.out.println("No pudo cerrarse el canal");
            }

        }
    }
     public static void DeserializarPersona ()
     {
                 File archivo = new File("E:\\musica\\Persona.txt ");
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Persona p1 = (Persona)ois.readObject();
            ois.close();
            fis.close();
            
            System.out.println("Persona recuperada: " + p1.toString());
        } catch (IOException e){
            System.err.println(e.toString());
        } catch (ClassNotFoundException e){
            System.err.println(e.toString());
        }

     }
    
}
