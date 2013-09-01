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
      // AplicacionHilos.doHiloImplements
        //AplicacionHilos.doSeelp();
        //AplicacionHilos.doSeelp2();
        //AplicacionHilos.doSeelp2Priority();
       AplicacionHilos.Ejercicio();
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
    public static void doSeelp()
    {
        SimpleDelayThread delay = new SimpleDelayThread();
        delay.start();
    
    }
    public static void doSeelp2()
    {
       	int delay1 = (int)(Math.random()*2000);
		int delay2 = (int)(Math.random()*2000);
		int delay3 = (int)(Math.random()*2000);

		Simple2DelayThread thread1 = new Simple2DelayThread("thread1",delay1);
		Simple2DelayThread thread2 = new Simple2DelayThread("thread2",delay2);
		Simple2DelayThread thread3 = new Simple2DelayThread("thread3",delay3);

		thread1.start();
		thread2.start();
		thread3.start();

        
    }
    public static void doSeelp2Priority()
    {
        
		Simple2DelayThread thread1 = new Simple2DelayThread("thread1", 0);
		Simple2DelayThread thread2 = new Simple2DelayThread("thread2", 0);

		// Modificando las prioridades
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);

		thread1.start();
		thread2.start();

    }
    public static void Ejercicio()
    {
        ReamThread run = new ReamThread(2);
        run.start();
        
    }
}
