package ca.ciccc.java.jara.model;

/**
 * Pawn is a piece of chesspiece that has a "forward 1" movement
 * 
 * @author jara
 *
 */
public class Pawn extends ChessPiece {
	/**
	 * We define the boolean instance variable hasBeenPromoted
	 * 
	 */
	private boolean hasBeenPromoted;
	/**
	 * We define the boolean instance variable newPiece
	 * 
	 */
	private ChessPiece newPiece;

	/**
	 * We define the boolean instance variable hasBeenPromoted
	 * @return hasBeenPromoted
	 */
	public boolean isHasBeenPromoted() {
		return hasBeenPromoted;
	}

	/**
	 * We create the process a new value for hasBeenPromoted
	 * @param hasBeenPromoted
	 * assign a new value for hasBeenPromoted
	 */
	public void setHasBeenPromoted(boolean hasBeenPromoted) {
		this.hasBeenPromoted = hasBeenPromoted;
	}

	/**
	 * We create the process a new value for newPiece
	 * @param newPiece
	 *  we assign a new value for newPiece
	 */
	public void setNewPiece(ChessPiece newPiece) {
		this.newPiece = newPiece;
	}

	/**
	 * We define value number 1 for piece Pawn
	 * 
	 */
	public Pawn() {
		super(1);
	}

	@Override
	public void move() {

		System.out.println("forward 1");
	}

	@Override
	public String toString() {
		return "Pawn [hasBeenPromoted=" + hasBeenPromoted + ", newPiece=" + newPiece + ", getValue()=" + getValue()
				+ "]";
	}

	public ChessPiece getNewPiece() {
		return newPiece;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Pawn)) {
			return false;
		}

		Pawn other = (Pawn) obj;
		if (this.hasBeenPromoted != other.hasBeenPromoted) {
			return false;
		}

		if (newPiece == null) {
			if (other.newPiece != null) {
				return false;
			}
		} else if (!this.newPiece.equals(other.newPiece)) {
			return false;
		}

		return true;
	}

	/**
	 * Method to promote a pawn to a different piece.
	 * 
	 * defines the if conditions for new piece considering the situation if isn't an
	 * instance of king, isn't an instance of pawn and if isn't hasBeenPromoted
	 * 
	 * @param newPiece
	 * the new piece to promote
	 * 
	 */
	public void promote(ChessPiece newPiece) {
		if (!(newPiece instanceof King) && !(newPiece instanceof Pawn) && !hasBeenPromoted) {
			this.newPiece = newPiece;
			this.hasBeenPromoted = true;
		}

	}
}
