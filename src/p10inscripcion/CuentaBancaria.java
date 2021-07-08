package p10inscripcion;

/**
 * @author Gutierrez Adrian, De La Cruz Marlene
 */
public class CuentaBancaria {
    
    int contadorRetiros = 0;
    
    private double saldo;

    public CuentaBancaria(){
        saldo = 0;
    }
    
    public void getSaldo(){
        System.out.println("Saldo "+saldo);
    }
    
    public void depositar(double monto)throws DepositoExcedenteException{
        System.out.println("Depositando "+monto+" pesos");
        if (monto > 20000)
            throw new DepositoExcedenteException();
        else
            saldo += monto;
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando "+monto);
        if(saldo < monto)
            throw new SaldoInsuficienteException();
        else
            saldo -= monto;
        contadorRetiros += 1;
        if (contadorRetiros > 3){
            System.out.println("Solo se aceptan tres retiros");
        }    
    }

    
    
    

    
}
