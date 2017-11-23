package ca.ciccc.java.jara.model;
/**
 * Queen is a piece of chesspiece that has a "like a bishop or a rook" movement
 * 
 * @author jara
 *
 */
public class Queen extends ChessPiece {
	/**
	 * We define value number 9 for piece Queen
	 * 
	 */
	public Queen() {
		super(9);
	}

	@Override
	public void move() {
	
		System.out.println("like a bishop or a rook");
	}

	@Override
	public String toString() {
		return "Queen [getValue()=" + getValue() + "]";
	}

	
}
