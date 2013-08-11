/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.Universo.Interface;

/**
 *
 * @author PFR
 */
public class Alienigena implements SerVivo {

    @Override
    public void alimentarse() {
        System.out.println("energia");
    }

    @Override
    public void comunicarse() {
        System.out.println("mentalmente");
    }

    @Override
    public void reproducirse() {
        System.out.println("asexual");
    }
    
    
}
