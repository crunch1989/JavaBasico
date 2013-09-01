/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5.aula.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PFR
 */
public class EntradaSalida {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //EntradaSalida.escribirArchivo();
        //EntradaSalida.leerArchivo();
        EntradaSalida.ejemploIO();
    }
    public static void ejemploIO() throws FileNotFoundException, IOException
    {
        
	List<String>listado = new ArrayList<String>();
        FileReader fr = new FileReader("E:\\musica\\hola.txt");
        BufferedReader br = new BufferedReader(fr);
        String sInput;
        while((sInput=br.readLine())!=null)
        {
            listado.add(sInput);
        }
	FileWriter fw = new FileWriter("E:\\musica\\hola.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for(String string : listado)
        {
            bw.write(string);
            bw.newLine();
        }
        bw.write("Es una linea");
        bw.newLine();
        bw.write("Es otra linea");
        bw.close();
        fw.close();
    }
    public static void escribirArchivo ()
    {
        
		try {
                    FileWriter fw = null;
		BufferedWriter bw = null;
			fw = new FileWriter("E:\\musica\\hola.txt");
			bw = new BufferedWriter(fw);
			bw.write("Es una linea");
			bw.newLine();
			bw.write("Es otra linea");
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

    }
    public static void leerArchivo()
    {
        
		
		try {
                    FileReader fr = null;
		BufferedReader br = null;
		String sInput = null;
			fr = new FileReader("E:\\musica\\hola.txt");
			br = new BufferedReader(fr);
			while ((sInput = br.readLine()) != null) {
				System.out.println(sInput);
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

    }
    
}
