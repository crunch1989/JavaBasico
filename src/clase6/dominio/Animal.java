/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase6.dominio;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author PFR
 */
public class Animal {
    private int codigo;
    private String nombre;
    HashMap<Dieta, Integer>dietas;
    private double peso;
    private Date fechaNacimiento;
    private String observaciones;
    Especie especie;
    private Dieta dieta;
    
    
}
