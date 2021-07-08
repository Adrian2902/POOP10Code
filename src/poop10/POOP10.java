package poop10;
/**
 *
 * @author Adrian Gutierrez, De La Cruz Marlene
 */
public class POOP10 {

    public static void main(String[] args) {
        
        System.out.println(" ");
        System.out.println("*****EJERCICIO 1*****");
        System.out.println(" ");
        String mensajes[] = {"Primero","Segundo","Tercero"};
        try{
        for (int i = 0; i <=3; i++){
            System.out.println(mensajes[i]);
        }
        }catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Error: Tu apuntador esta fuera de rango");
        }
        
        System.out.println(" ");
        System.out.println("*****EJERCICIO2*****");
        System.out.println(" ");
        
        int a = 8, b = 6;
        try{
            float c = a/b;
            System.out.println("C = " + c);
        }catch(ArithmeticException ae){
            System.out.println("Error: dividiste entre cero");
        }finally{
            System.out.println("A pesar de todo, este bloque finally se ejecuta");
        }
        
        //Try- Catch anidados: siempre debe ir de lo más particular a lo general 
        System.out.println(" ");
        System.out.println("*****EJERCICIO 3*****");
        System.out.println(" ");
        try{
            int d = 99/0;
            System.out.println("D = " + d);
        }catch(ArithmeticException ae){
            System.out.println("Error: Division entre cero");
        }finally{
            System.out.println("El bloque finally siempre se ejecuta");
        }
    
        System.out.println(" ");
        System.out.println("*****EJERCICIO 4*****");
        System.out.println(" ");
        try{
            int division = metodoPropagaExc(55,0);
            System.out.println("Division = " + division);
        }catch(ArithmeticException ae){
            System.out.println("Exception aritmetica arrojada: ");
            //ae.printStackTrace(); Reaciliza un analisis de porque la operacion no de pudo realizar 
        }
        
    }
    
        public static int metodoPropagaExc(int x, int y)throws ArithmeticException{
            if(y == 0){
                throw new ArithmeticException();
            }
            return x/y;
        }
}

