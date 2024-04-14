package src.com.chessgame;

public abstract class Piece { 

	private boolean white = false; 
	/*
	value: valor de las piezas esta relacionado con el tipo de pieza

	peones: 10 punto
	caballo: 35 puntos
	alfil: 30 puntos *Realmente el caballo y el alfil tienen el mismo valor, estamos haciendo este truco para poder identificar cual de la piezas es
	torre: 50 puntos
	reina: 90 puntos
	rey: 10000 *Realmente el rey es ganar el juego, pero necesitamos tener un valor para poder identificar la pieza
    */

	private int value = 0;




	public Piece(boolean white, int value) 
	{ 
		this.white = white; 
		this.value = value;
	} 

	


	public boolean isWhite() 
	{ 
		return this.white; 

	} 

	public int getValue ()
	{

		return this.value;
		
	}




	public abstract boolean canMove(Spot start, Spot end); 
} 
