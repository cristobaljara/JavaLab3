package ca.ciccc.java.jara.model;
/**
 * Bishop is a piece of chesspiece that moves diagonally
 * @author jara
 *
 */
public class Bishop extends ChessPiece {
	/**
	 * We define value number 3 for piece bishop
	 * 
	 */
	public Bishop() {
		super(3);
	}

	@Override
	public void move() {
		
		System.out.println("diagonally");
	}

	@Override
	public String toString() {
		return "Bishop [getValue()=" + getValue() + "]";
	}


	
}
