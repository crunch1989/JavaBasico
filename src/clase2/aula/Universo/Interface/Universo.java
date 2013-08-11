/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.Universo.Interface;

/**
 *
 * @author PFR
 */
public class Universo {
    
    public static void main(String[] args) {
        
       Humano humano = new Humano();
       humano.contaminar();
       humano.comunicarse();
        System.out.println("---------------");
       ET et = new ET();
       et.alimentarse();
       et.volarBicicleta();
        System.out.println("----------------");
       Hibrido hibrido =new Hibrido();
       hibrido.alimentarse();
       hibrido.ComerGato();
    }
    
    
}
