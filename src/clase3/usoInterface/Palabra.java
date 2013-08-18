/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.usoInterface;

/**
 *
 * @author PFR
 */
public class Palabra implements Capitalizable{

    
    String texto;
    
    Palabra(String n){
    texto=n.replaceAll(" ","");
    }

    @Override
    public String cambiaMayuscula() {
        return texto.toUpperCase();
    }

    @Override
    public String cambiaMinuscula() {
            return texto.toLowerCase();
    }
    
    
}
