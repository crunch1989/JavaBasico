/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.Figura;

/**
 *
 * @author PFR
 */

public class Cuadrado extends Shape{

    @Override
    public Double getArea() {
       Double resultado = this.getAlto() * getAncho();
       return resultado;
    }
    
    
    
    
}
