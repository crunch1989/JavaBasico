/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.usoInterface;

/**
 *
 * @author PFR
 */
public class Oracion implements Capitalizable{

    
    String texto;
    public Oracion(String texto)
    {
        this.texto=texto;
    }
     public String agregaPalabra(String t) {
     texto=texto.concat(" "+t);
     return texto;
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
