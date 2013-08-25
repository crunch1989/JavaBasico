/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.aula.hilos;

/**
 *
 * @author PFR
 */
public class HiloHerencia extends Thread{
    
       String nombre;
    
    @Override
    public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i);
		}
	}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    
}
