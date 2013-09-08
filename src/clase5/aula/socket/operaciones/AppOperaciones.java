package clase5.aula.socket.operaciones;

import java.net.ServerSocket;
import java.net.Socket;

public class AppOperaciones {

    private int port;

    public AppOperaciones(int port) {
        this.port = port;
    }
    
    public static void main(String[] args) {
        AppOperaciones play = new AppOperaciones(9999);
        play.ejecutar();
    }

    public void ejecutar() {
        try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Servidor iniciado...");

            while (true) {
                System.out.println("Esperando ...");
                Socket cliente = server.accept();

                ServidorOperaciones ts = new ServidorOperaciones(cliente);
                ts.start();
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
