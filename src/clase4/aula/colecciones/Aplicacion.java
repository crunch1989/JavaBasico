/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4.aula.colecciones;

import clase2.aula.Zoologico.Animal;
import clase2.aula.Zoologico.Perro;
import clase2.aula.Zoologico.Tigre;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author PFR
 */
public class Aplicacion {
    
    
    public static void main(String[] args) {
        //Aplicacion.ejemplo2();
        
        //Aplicacion.ejemploHashSet();
        
       //Aplicacion.ejemploHashMap();
        Aplicacion.ejemploAnimales();
        
    }
    public static void ejemploAnimales()
    {
        
        Tigre tigreCrunch = new Tigre("Crunch");
        tigreCrunch.setNumeroPatas(4);
        Tigre tigreIchigo = new Tigre("Ichigo");
        tigreCrunch.setNumeroPatas(6);
        Perro perro = new Perro("Labrador");
        perro.setNumeroPatas(8);
        
        //List<Animal> listaAnimal = new ArrayList<Animal>();
        HashSet<Animal> listaAnimal = new HashSet<Animal>();
        listaAnimal.add(tigreIchigo);
        listaAnimal.add(tigreCrunch);
        listaAnimal.add(perro);
        listaAnimal.add(perro);
        
        for (Animal animal : listaAnimal) {
		System.out.println(animal.getNombre()+" "+animal.getNumeroPatas());
	}
        
        
    }
    public static void ejemploHashMap()
    {
        	Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        
        // HashMap
        HashMap<Integer, Estudiante> mapa = new HashMap<Integer, Estudiante>();
        mapa.put(100525, e1);
        mapa.put(100526, e2);
        mapa.put(100527, e3);
        
        Estudiante e = mapa.get(100526);
        System.out.println(e.getNombres() );

        Collection<Estudiante> co = mapa.values();
        for (Estudiante es : co) {
		System.out.println(es.getNombres());
		}        

    }
    public static void ejemploHashSet()
    {
        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        
        // HashSet
        HashSet<Estudiante> set = new HashSet<Estudiante>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e1);
        
        for (Estudiante e : set) {
		System.out.println(e.getNombres() + " " + e.getApellidos());
	}

    }
    
    public static void ejemplo2()
    {
     
        	Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        
        // LinkedList
        LinkedList<Estudiante> listaEstudiantesa = new LinkedList<Estudiante>();
        listaEstudiantesa.addFirst(e1);
        listaEstudiantesa.addFirst(e2);
        listaEstudiantesa.addLast(e3);
        
        ListIterator<Estudiante> ite = listaEstudiantesa.listIterator();
        while(ite.hasNext()){
            Estudiante e = (Estudiante) listaEstudiantesa.poll();
            System.out.println(e.getNombres());
        }
        System.out.println(listaEstudiantesa.size());

        
    }
    
    
    public static void ejemplo1()
    {
        
        Estudiante e1 = new Estudiante("Benjamin", "Zapata", "Bolognesi 123", 100525);
    	Estudiante e2 = new Estudiante("Alberto", "Ayasta", "Libertad 987", 100526);
    	Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        Estudiante e4 = new Estudiante("Crunch","Ichigo","Kurosaki",100528);
        Estudiante e5 = new Estudiante("stevens","Adolfo","Conde meza",100529);
        
        // ArrayList
        List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        listaEstudiantes.add(e1);
        listaEstudiantes.add(e2);
        listaEstudiantes.add(e3);
        listaEstudiantes.add(e4);
        listaEstudiantes.add(e5);
        
        Collections.sort(listaEstudiantes);
        
        for (Estudiante e : listaEstudiantes) {
		System.out.println(e.getNombres() + " " + e.getApellidos());
	}

        
    }
    
}
