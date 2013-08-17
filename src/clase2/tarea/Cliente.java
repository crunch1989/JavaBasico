
package clase2.tarea;

public class Cliente {
    private String nombre;
    private int monto;
    
    public Cliente(String nom) {
        nombre=nom;
        monto=0;
    }			
    
    public void Comprar(int m) {
        monto=monto+m;
    }
    
    
    
    public int retornarMonto() {
        return monto;
    }
    
    public void imprimir() {
        System.out.println(nombre+" "+" registro"+" "+monto);
    }
}


