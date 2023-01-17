package Apuesta;


/**
 * @author Smart
 * @version 1.0
 * @created 14-Ene.-2023 5:51:20 p.�m.
 */
public class Blackjack extends Juego {

    private int cartas;
    private int manoCasa;
    private int manoJugador;

    public Blackjack(){

    }

    
    public boolean pedirCarta(){
	return false;
    }

    public boolean plantarse(){
	return false;
    }
}  