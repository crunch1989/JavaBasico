
package clase3.Aula;

import java.util.Date;

public class ClaseObject {
    
    public static void main(String[] args) {
        
        
        //ClaseObject.doEquals();
        
       // ClaseObject.overrideToString();
        
        ClaseObject.rareCompare();
        
    }
    
    public static void rareCompare()
    {
        
        Integer numeroA = 12;
        Integer numeroB = 12;
        
        Integer numeroX = new Integer(12);
        Integer numeroY = new Integer(12);
        if(numeroA==numeroB)
        {
            System.out.println("Iguales A y B");
        }
        if(numeroX==numeroY)
        {
            System.out.println("Iguales X y Y");
        }
        if(numeroX.intValue() == numeroY)
        {
            System.out.println("Iguales X e Y by getint ");
        }
        
        if(numeroX.equals(numeroY))
        {
            System.out.println("Iguales X e Y by equals");
        }
        
        
        
        
        
        
    }
    
    
    public static void doEquals()
    {
        
        Date fechaNacimiento = new Date();
        //Date fechaCumpleaños = fechaNacimiento;
        Date fechaCumpleaños = new Date();
        
        if(fechaCumpleaños==fechaNacimiento)
        {
            System.out.println("Iguales");
        }
        if(fechaNacimiento.equals(fechaCumpleaños))//comprarando contenido equals
        {
            System.out.println("Iguales");
        }
        
        
    }
    
    public static void doToString()
    {
        Date fechaNacimiento = new Date();
        fechaNacimiento.toString();
        System.out.println(fechaNacimiento.toString());
    }
    
    public static void overrideToString()
    {
        ClaseObject object = new ClaseObject();
        System.out.println(object.toString());
    }
    
    @Override
    public String toString()
    {
        return "Explicado la clase object";
    }
    
    
    
}
