package Apuesta;


/**
 * @author Smart
 * @version 1.0
 * @created 14-Ene.-2023 5:51:21 p.�m.
 */
public class Tragamonedas extends Juego {

    private int lineasDePago;
    private int simbolos;

    public Tragamonedas(){

    }

    public void finalize() throws Throwable {
	super.finalize();
    }
    public boolean girarRuedas(){
        return false;
    }

    public String verificarCombinacion(){   
	return "";
    }
}