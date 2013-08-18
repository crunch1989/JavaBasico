/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.Aula;

/**
 *
 * @author PFR
 */
public class Matematicas {
    
    public static void main(String[] args) {
        //Matematicas.getConstants();
        //System.out.println(Matematicas.doOperaciones());
        //Matematicas.operaciones();
        Matematicas.wrappers();
    }
    public static void getConstants()
    {
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
    public static double doOperaciones()
    {
        return Math.sqrt(144);
        
     
    }
    public static void operaciones()
    {
        System.out.println(Math.min(2, 6));
    }
    
    
    public static void wrappers()
    {
        Integer entero = new Integer(12);
        System.out.println(entero.toString());
    }
    
    
    
    
    
    
    
}
