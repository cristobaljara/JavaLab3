package ca.ciccc.java.jara.model;

/**
 * Rook is a piece of chesspiece that has an "horizontally or vertically"
 * movement
 * 
 * @author jara
 *
 */
public class Rook extends ChessPiece {
	/**
	 * We define value number 5 for piece Rook
	 * 
	 */
	public Rook() {
		super(5);
	}

	@Override
	public void move() {

		System.out.println("horizontally or vertically");
	}

	@Override
	public String toString() {
		return "Rook [getValue()=" + getValue() + "]";
	}

}
