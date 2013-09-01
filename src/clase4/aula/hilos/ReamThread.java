/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.aula.hilos;

/**
 *
 * @author PFR
 */
public class ReamThread extends Thread {

    private int opcion;

    public ReamThread(int opcion) {
        this.opcion = opcion;
    }

    public void run() {
        // 
        for (int i = 0; i < 5; i++) {
            try {
                // 1000 ms
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            switch (opcion) {
                case 1:
                    System.out.println("Memoria Libre");
                    break;
                case 2:
                    System.out.println("Memoria llena");
                    break;
                case 3:
                    System.out.println("Falta Memoria");
                    break;
                case 4:
                    System.out.println("Memoria insuficiente");
                    break;
                case 5:
                    System.out.println("Memoria reducida");
                    break;
                default:
                    System.out.println("la memoria se malogro....!");
                    break;
            }
            long mem1 = Runtime.getRuntime().freeMemory();
            System.out.println(mem1);
        }
    }
}
