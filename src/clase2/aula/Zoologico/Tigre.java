/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.Zoologico;

/**
 *
 * @author PFR
 */
public class Tigre extends Animal{

    public Tigre() {
    }

    public Tigre(String nombre) {
        
        this.setNombre(nombre);
        this.setNumeroPatas(4);
    }

    
    
    
    
    @Override
            //anotaciones, acciones adicionales
            //este es un metodo sobreescrito
            //existe este metodo en la casa padre
            //forma explicita de decirlo
            //este metodo existe en una clase padre
    void hacerRuido() {
       System.out.println("rugir");
    }
    void hacerRuido(boolean molestar)
    {
        if(molestar)
        {
        System.out.println("rugir y zarpar");
        }
    }
    
   
            
    void hacerRuido(String mensaje) {
       System.out.println("rugir"+""+mensaje);
    }
    void zarpar()
    {
        System.out.println("Estoy Zarpando");
    }
    
    
   
}
