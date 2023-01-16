package Apuesta;


/**
 * @author Smart
 * @version 1.0
 * @created 14-Ene.-2023 5:51:23 p.�m.
 */
public class Ruleta extends Juego {

    private int apuestasDisponibles;
    private int numeroGanador;

    public Ruleta(){

    }

    public void finalize() throws Throwable {
	super.finalize();
    }
    public boolean girarRueda(){
	return false;
    }

    public boolean verificarApuesta(){
	return false;
    }
}