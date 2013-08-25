/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.aula.hilos;

/**
 *
 * @author PFR
 */
public class AplicacionHilos {
    
    public static void main(String[] args) {
      //AplicacionHilos.doHiloHerencia();
       AplicacionHilos.doHiloImplements();
    }
    public static void doHiloHerencia()
    {
        HiloHerencia hilo = new HiloHerencia();
		hilo.start();

    }
    public static void doHiloImplements()
    {
        HiloImplements hilo = new HiloImplements ();
		Thread th = new Thread(hilo);
		th.start();

    }
}
