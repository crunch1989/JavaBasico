
package clase1;


public class PrimeraAplicacion {
    
    public static void main(String[] args) {
       //PrimeraAplicacion.swtich();
       //PrimeraAplicacion.ejercicioWhile();
       //PrimeraAplicacion.ejercicioDoWhile();
       //PrimeraAplicacion.EjercicioFor();
       // PrimeraAplicacion.ejercicio7();
        PrimeraAplicacion.ejerciciomatriz();
        //PrimeraAplicacion.ejerciciomatrizbidimensional();
        //PrimeraAplicacion.ejercicio8(31);
    }
    public static void swtich() {
        
        int diaSemana = 0;
        String textoSemana = "";
        switch(diaSemana){
            
            case 0:
                 textoSemana="Domingo";
                break;
            case 1:
                 textoSemana="Lunes";
                break;
            case 2:
                textoSemana="Martes";
                break;
            case 3:
                textoSemana="Miercoles";
                break;
            case 4:
                textoSemana="Jueves";
                break;
            case 5:
                textoSemana="Viernes";
                break;
            case 6:
                textoSemana="Sabado";
                break;
            default :
                textoSemana="Dia Feriado";
                break;
                        
        }
        System.out.println(textoSemana);
    }
   
    public static void ejercicioWhile() {
        
        
        int contador = 0;
        while(contador<10){
            System.out.println(contador);
            ++contador;
            if(contador==6)
            {
               // break;
                //++contador;
                //continue;
              
                
            }
        }
    }
    public static void ejercicioDoWhile() {
        int contador = 0;
        
        do{
            System.out.println(contador);
            ++contador;
        }while(contador<10);
    }
    public static void EjercicioFor() {
        
        for (int i = 0; i < 10; i++) {
            if(i==6){
                break;
            }
            System.out.println(i);
        }
        
    }
    public static void ejercicio7() {
        int edad = 65 ;
        double descuento =0.0;
        if(edad<18){
            descuento = 0.15;
        }else if(edad>60){
        
            descuento = 0.3;
            
        }
            
        System.out.println(descuento);
    }
    public static void ejerciciomatriz() {
        
        int[] matrizNumeros = new int [5];
        matrizNumeros[0] = 648;
        matrizNumeros[1] = 342;
        matrizNumeros[2] = 3424;
        matrizNumeros[3] = 642;
        for (int i = 0; i < matrizNumeros.length; i++) {
            System.out.println(matrizNumeros[i]);
            
        }
    }
    public static void ejerciciomatrizbidimensional() {
        
        int [][] matrizBiDimensional = new int[5][2];
        matrizBiDimensional[0][0] = 12345;
        matrizBiDimensional[0][1] = 36521;
        
        matrizBiDimensional[1][0] = 12464;
        matrizBiDimensional[1][1] = 656;
        
        matrizBiDimensional[2][0] = 45144;
        matrizBiDimensional[2][1] = 65;
        
        for (int i = 0; i < matrizBiDimensional.length; i++) {
            for (int j = 0; j < matrizBiDimensional[i].length; j++) {
                System.out.println(matrizBiDimensional[i][j]);
            }
        }
    }
    public static void ejercicio8(int mes) {
        int[]meses = {30, 28, 31, 30, 31, 30, 31, 30, 31, 31, 31, 30};
        if(mes<=meses.length){
             System.out.println(meses[mes+1]);
        }
       
    }
    
}
