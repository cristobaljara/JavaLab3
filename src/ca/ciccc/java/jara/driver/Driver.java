package ca.ciccc.java.jara.driver;

import ca.ciccc.java.jara.model.Bishop;
import ca.ciccc.java.jara.model.ChessPiece;
import ca.ciccc.java.jara.model.King;
import ca.ciccc.java.jara.model.Knight;
import ca.ciccc.java.jara.model.Pawn;
import ca.ciccc.java.jara.model.Queen;
import ca.ciccc.java.jara.model.Rook;

public class Driver {
	public static void main(String[] args) {

		Pawn pawn1 = new Pawn();
		Pawn pawn2 = new Pawn();
		pawn1.move();
		King king2 = new King();
		king2.move();
		Bishop bishop3 = new Bishop();
		bishop3.move();
		Rook rook4 = new Rook();
		Rook rook5 = new Rook();
		rook4.move();
		Knight knight5 = new Knight();
		knight5.move();
		Queen queen6 = new Queen();
		queen6.move();

		System.out.println("Pawn equals to King? " + pawn1.equals(king2));
		System.out.println("Pawn equals to Bishop? " + pawn1.equals(bishop3));
		System.out.println("Pawn equals to Rook? " + pawn1.equals(rook4));
		System.out.println("Pawn equals to Kight? " + pawn1.equals(knight5));
		System.out.println("Pawn equals to Queen? " + pawn1.equals(queen6));
		System.out.println("Queen equals to Rook? " + queen6.equals(rook4));
		System.out.println("Queen equals to Queen? " + queen6.equals(queen6));
		System.out.println("Rook equals to Rook? " + rook4.equals(rook5));
		System.out.println("Knight equals to Bishop? " + knight5.equals(bishop3));
		System.out.println("Bishop equals to Queen? " + bishop3.equals(queen6));

		Pawn pawn3 = new Pawn();
		pawn2.promote(pawn3);
		System.out.println("Promoted pawn is equal to pawn?: " + (pawn2.getNewPiece() == null));

		pawn3.promote(king2);
		System.out.println("Promoted pawn is not equal to king?: " + (pawn3.getNewPiece() == null));

		Pawn pawn4 = new Pawn();
		pawn4.promote(rook5);
		System.out.println("Promoted pawn is not equal to rook?: " + (pawn4.getNewPiece().equals(rook5)));

		Pawn pawn5 = new Pawn();
		pawn5.promote(queen6);
		System.out.println("Promoted pawn is not equal to queen?: " + (pawn5.getNewPiece().equals(queen6)));

		pawn5.promote(knight5);
		System.out.println("Promoted pawn is equal to knight?: " + (pawn5.getNewPiece().equals(knight5)));
	}
}
