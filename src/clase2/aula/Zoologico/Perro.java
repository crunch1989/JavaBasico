/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.Zoologico;

/**
 *
 * @author PFR
 */
public class Perro extends Animal{
    
    String ruido;

    public Perro() {
        
        this.setNumeroPatas(2);
        
    }

    
    
    public Perro(String nombre) {
        
        this.setNombre(nombre);
        this.setNumeroPatas(2);
        
        
    }
    
    
    
    

    @Override
    void hacerRuido() {
        System.out.println("wauwau");
    }

    void morder()
    {
        System.out.println("Estoy mordiendo");
    }
    
    
    
    
    
   
    
    
}
