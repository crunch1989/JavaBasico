/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5.aula.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author PFR
 */
public class ServidorHilo {
    private Socket cliente;	

	public ServidorHilo(Socket cliente) {
		this.cliente = cliente;
	}

	public void run() {
		try {
			// Crear los canales de lectura y escritura
			PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(
					cliente.getInputStream()));

			// COMUNICACION 1
			out.println("SERVIDOR: Bienvenido, ¿Cómo te llamas? ");

			// COMUNICACION 2
			String resp2 = in.readLine();
			System.out.println(resp2);

			/* Cerramos el canal */
			in.close();
			out.close();
			cliente.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (cliente != null)
					cliente.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

    void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
