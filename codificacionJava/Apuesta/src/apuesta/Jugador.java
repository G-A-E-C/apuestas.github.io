package Apuesta;


/**
 * @author Smart
 * @version 1.0
 * @created 14-Ene.-2023 5:51:24 p.�m.
 */
public class Jugador {

    private String historialDeApuestas;
    private String nombre;
    private int saldo;
    public Casino m_Casino;

    public Jugador(){

    }

    public void finalize() throws Throwable {

    }
    public float aumentarSaldo(){
        return saldo;
    }

    public float depositar(){
        return saldo;
    }

    public float realizarPago(){
        return saldo;
    }

    public boolean retirar(){
        return false;
    }

    public float verificarSaldo(){
        return saldo;
    }
}