package ca.ciccc.java.jara.model;
/**
 * King is a piece of chesspiece that has a one square movement 
 * @author jara
 *
 */
public class King extends ChessPiece {
	/**
	 * We define value number 1000 for piece king
	 * 
	 */
	public King() {
		super(1000);
	}

	@Override
	public void move() {
	
		System.out.println("one square");
	}

	@Override
	public String toString() {
		return "King [getValue()=" + getValue() + "]";
	}

	
}
