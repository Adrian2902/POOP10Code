package p10inscripcion;

/**
 *
 * @author adriangutierrez
 */
public class DepositoExcedenteException extends Exception{
    public DepositoExcedenteException(){
        super("El deposito excede el limite permitido");
    }
    
}
