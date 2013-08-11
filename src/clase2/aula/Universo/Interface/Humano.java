/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.Universo.Interface;

/**
 *
 * @author PFR
 */
public class Humano implements SerVivo,humanos{
    
     @Override
    public void alimentarse() {
         System.out.println("Carbohidratos");
    }

    @Override
    public void comunicarse() {
        System.out.println("Hablar");
    }

    @Override
    public void reproducirse() {
        System.out.println("Sexual");
    }

    @Override
    public void contaminar() {
        System.out.println("Votar desechos");
    }
    
}
