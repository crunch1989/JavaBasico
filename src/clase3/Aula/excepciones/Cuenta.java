/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3.Aula.excepciones;

/**
 *
 * @author PFR
 */
public class Cuenta {
        private long idCuenta;
        private double saldoActual;
    
    public Cuenta(long idCuenta) {        
        this.idCuenta = idCuenta;
        this.saldoActual=5000;
    }
    
    public void retirarDeCajero(double cuantoDesea) throws SaldoInsuficienteException {
        
        if(saldoActual < cuantoDesea){
            throw new SaldoInsuficienteException(saldoActual, cuantoDesea);
        } else {
            System.out.println("Monto retirado "+ (saldoActual-cuantoDesea));
        }
          
    }

}
