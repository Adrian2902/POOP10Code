package p10inscripcion;

/**
 * @author Gutierrez Adrian, De La Cruz Marlene
 */
public class Cajero {
    public static void main(String[] args){
        
        CuentaBancaria cuenta = new CuentaBancaria();
        
        try{
            try{
                cuenta.depositar(1000);
                cuenta.getSaldo();
                cuenta.retirar(500);
                cuenta.getSaldo();
                cuenta.retirar(250);
                cuenta.getSaldo();
                cuenta.retirar(100);
                cuenta.getSaldo();
                cuenta.retirar(50);
            }catch(SaldoInsuficienteException sie){
                System.out.println("Error, no tienes tanto dinero");
            }
        }catch(DepositoExcedenteException sie){
            System.out.println("El deposito excede el monto maximo permitido");
        }
    }
    
}
