/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.Zoologico;

/**
 *
 * @author PFR
 */
public class Animal {
    
     private int numeroPatas;
     private String especie;
     private String nombre;
     private double tamaño;
     
     //----------------------
   
    
      void hacerRuido()
    {
        System.out.println("zzzZZZzZZZZzz");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    void printNombrePatas()
    {
        System.out.println(this.nombre+" "+this.numeroPatas);
    }
      
      
      
      
}
