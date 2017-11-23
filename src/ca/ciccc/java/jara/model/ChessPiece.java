package ca.ciccc.java.jara.model;

/**
 * We define Chesspiece abstract class
 * 
 * @author jara
 *
 */

public abstract class ChessPiece {
	/**
	 * 
	 * We define the id or value for the chesspiece, declaring the importancy of it
	 */
	protected int value;

	/**
	 * 
	 * @param value
	 *            set value for ChessPiece class
	 */
	public ChessPiece(int value) {
		setValue(value);
	}

	/**
	 * value for ChessPiece class
	 * 
	 * @return the value of itself
	 */
	public int getValue() {
		return this.value;
	}

	/**
	 * 
	 * @param value
	 *            to be set
	 * 
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * abstract move void
	 */
	public abstract void move();

	@Override
	public String toString() {
		return "ChessPiece [value=" + value + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof ChessPiece)) {
			return false;
		}

		// Cast
		ChessPiece other = (ChessPiece) obj;
		if (this.value != other.value) {
			return false;
		}
		return true;
	}

}
