/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author PFR
 */
public class Utiles {

   
    public static Date stringToDate(String fecha) {
        
        DateFormat dateFormat = DateFormat.getDateInstance();

        Date date = null;
        try {

            date = dateFormat.parse(fecha);
        } catch (ParseException e) {
            System.out.println("Formato de la fecha incorrecto");
        }
        return date;
        
    }
}
