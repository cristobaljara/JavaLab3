package ca.ciccc.java.jara.model;
/**
 * Knight is a piece of chesspiece that has a "like an L" movement 
 * @author jara
 *
 */
public class Knight extends ChessPiece {
	/**
	 * We define value number 2 for piece knight
	 * 
	 */
	public Knight() {
		super(2);
	}

	@Override
	public void move() {
	
		System.out.println("like an L");
	}

	@Override
	public String toString() {
		return "Knight [getValue()=" + getValue() + "]";
	}

	
}
