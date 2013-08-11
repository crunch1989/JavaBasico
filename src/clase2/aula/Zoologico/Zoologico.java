/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2.aula.Zoologico;

/**
 *
 * @author PFR
 */
public class Zoologico {
    
    public static void main(String[] args) {
        
       //Zoologico.doHerencia();
      // Zoologico.doConstructor();
        Zoologico.executeCasting();
    }
    
    public static void executeCasting()
    {
       // Perro perro = new Perro();
        
      // Zoologico.doCasting(perro);
      // Zoologico.doCasting(new Tigre());
       Zoologico.doCasting2();
    }
    
    public static void doCasting2()
    {
        Animal [] animales= { new Tigre("TIGR"), new Perro(" PEP"),new Perro("ty")} ;
        for(Animal animal : animales)
        {
            animal.printNombrePatas();
            if(animal instanceof Tigre)
            {
                ((Tigre) animal).hacerRuido(true);
            }else if(animal instanceof Perro)
            {
                Perro perro = (Perro)animal;
                perro.morder();
            }
        }
    }
    
   
    
    
    public static void doCasting(Animal animal)//testeo 
    {
        if(animal instanceof Tigre)
        {
         /* Tigre tigre = (Tigre) animal;
          tigre.hacerRuido(true);
          tigre.zarpar();*/
            ((Tigre)animal).hacerRuido(true);//otra manera de testear
        }
        else if(animal instanceof Perro)
        {
          Perro perro = (Perro) animal;
          perro.hacerRuido();
          perro.morder();
        }
        
    }
    
    
    public static void doConstructor()
    {
        
        Perro pep =new Perro();
        pep.setNombre("Tyson");
        pep.setNumeroPatas(4);
        pep.printNombrePatas();
        
        Perro pe= new Perro("pepes");
        pe.printNombrePatas();
        
        Tigre tiger = new Tigre("Rafael");
        tiger.printNombrePatas();
        
        
    }
            
            
            
            
            
    public static void doHerencia()
    {
        Tigre tiger = new Tigre();
        tiger.setNumeroPatas(4);
        tiger.hacerRuido();
        System.out.println(tiger.getNumeroPatas());
        tiger.hacerRuido(true);
        tiger.hacerRuido("Hola");
        
        
        Perro pep =new Perro();
        pep.setNumeroPatas(4);
        System.out.println(pep.getNumeroPatas());
        pep.hacerRuido();
        
        
        
      
    }
    public static void doInstance()
    {
         Animal tigre = new Animal();
        tigre.setNombre("Tigre");
        System.out.println(tigre.getNombre());
       
        
        tigre.hacerRuido();
    }
}
