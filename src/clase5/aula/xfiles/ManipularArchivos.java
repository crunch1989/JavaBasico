/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5.aula.xfiles;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author PFR
 */
public class ManipularArchivos {
    public static void main(String[] args) throws IOException {
        //ManipularArchivos.compruebaArchivos();
       // ManipularArchivos.ListDirectory();
        ManipularArchivos.renameFiles();
    }
    public static void renameFiles()
    {
        File dir = new File("E:\\musica");
        if(dir.exists() && dir.isDirectory())
        {
            String[] listado = dir.list();
            for(int i=0; i<listado.length;i++)
            {
             String fileName = listado[i];
             String newName = i + "."+fileName;
             File file = new File(dir,fileName);
             file.renameTo(new File(dir,newName));
                System.out.println(listado[i]);
            }
            
        }else
        {
            System.out.println("el directorio no existe");
        }
    }
    public static void ListDirectory()
    {
        File file = new File("c:\\windows");
        if(file.exists() && file.isDirectory())
        {
           String[] listado = file.list();
           for(String string : listado)
           {
               System.out.println(string);
           }
        }
        else
        {
            System.out.println("El directory nio existe");
        }
    }
    public static void compruebaArchivos() throws IOException
    {
           
        
        File f = new File("e:\\temario.txt");
        System.out.println("Nombre: " + f.getName());
        System.out.println("Ruta : " + f.getPath());
        System.out.println("Ruta Absoluta: " + f.getAbsolutePath());

        if(f.exists()){
            System.out.println("Archivo sí existe!");
            System.out.println((f.canRead()) ? "Sí se puede leer" : "");
            System.out.println((f.canWrite()) ? "Sí se puede escribir" : "");
            System.out.println("La longitud del archivo es de " + f.length() + " bytes");
        } else {
            System.out.println("El archivo no existe");
            f.createNewFile();
        }
    }

    
}
