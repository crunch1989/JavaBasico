/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.Figura;

/**
 *
 * @author PFR
 */
public class Modelamiento {
    
    
    public static void main(String[] args) {
        
    
        Modelamiento.doAbstracto();
        
    }
    
    public static void doAbstracto()
    {
            
      Cuadrado cuadrado = new Cuadrado();
      cuadrado.setAlto(10d);
      cuadrado.setAncho(10d);
      
      Rectangulo rectangulo = new Rectangulo();
      rectangulo.setAlto(10d);
      rectangulo.setAncho(20d);
      
      
      System.out.println(cuadrado.getArea());
        System.out.println(rectangulo.getArea());
      
      
        
    }
    
}
