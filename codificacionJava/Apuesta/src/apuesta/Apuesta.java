package Apuesta;


/**
 * @author Smart
 * @version 1.0
 * @created 14-Ene.-2023 5:51:15 p.�m.
 */
public class Apuesta {

    private int fecha;
    private int monto;
    //private (blackjack, tragamonedas, ruleta) tipo;
    public Jugador m_Jugador;
    public Juego m_Juego;

    public Apuesta(){

    }

    public void finalize() throws Throwable {

    }
    public int cancelarApuesta(){
        return 0;
    }

    public int realizarApuesta(){
	return 0;
    }
}//end Apuesta