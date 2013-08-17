
package clase2.tarea;

public class Mediatica {
    private Cliente cliente1,cliente2,cliente3;
   
    
	
    public Mediatica() {
        cliente1=new Cliente("Juan");
        cliente2=new Cliente("Ana");
        cliente3=new Cliente("Pedro"); 
        
    }

    public void operar() {
        cliente1.Comprar (100);
        cliente2.Comprar (150);
        cliente3.Comprar (200);
        
    }
	
    public void Totales ()
    {
        int t = cliente1.retornarMonto () + cliente2.retornarMonto () + cliente3.retornarMonto ();
        System.out.println ("El total de dinero  es:" + t);
        cliente1.imprimir();
        cliente2.imprimir();
        cliente3.imprimir();
    }

    public static void main(String[] ar) {
        Mediatica banco1=new Mediatica();
        banco1.operar();
        banco1.Totales();
        System.out.println("------------");
        Libros libro1=new Libros();
        libro1.setTitulo("Harry Potter");
        System.out.println(libro1.getTitulo());
        libro1.setGenero("Accion");
        System.out.println(libro1.getGenero());
        libro1.Consulta();
    }
}
