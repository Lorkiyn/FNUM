package KinoGui;

import java.io.IOException;
import java.util.Scanner;

import IOClass.IO;

public class Kino {

	private static String[][] cinema = null;

	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) throws IOException {

		/* Einhabe der Daten */
		System.out.print("Wie viele Reihen hat der Saal: ");
		int row = sc.nextInt();

		System.out.print("Wie viele Sitze pro Reihe hat der Saal: ");
		int chair = sc.nextInt();

		/* Deklarierung und Initialisierung des Arrays */
		cinema = new String[row][chair];

		/* Array füllen */
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < chair; c++) {
				cinema[r][c] = "O";
			}
		}

		/* Ausgaben */
		choose(row, chair);

	}

	/* Aausgabe der Sitze */
	private static void printSeats(int row, int chair) throws IOException {
		System.out.println("\nBelegte Sitze:\n");
		for (int r = 0; r < chair; r++) {
			if (r < 10) {
				System.out.print("  " +(r+1));
			} else {
				System.out.print(" " +(r+1));
			}
		}
		System.out.println("");
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < chair; c++) {
				System.out.print("  " +cinema[r][c]);
			}
			System.out.print(" |" +(r+1) +"\n");
		}

	}

	/* Auswahl */
	private static void choose(int row, int chair) throws IOException {
		System.out.println("\nAuswahl: "
				+ "\n[1]Sitz buchen."
				+ "\n[2]Sitz stonieren."
				+ "\n[3]Belegte plätze azeigen."
				+ "\n[4]Program beenden.");

		System.out.print("\nWas möchten Sie tun: ");
		int i = IO.readInt(0);

		if (i < cinema.length && i >= 0) {
			switch (i) {
			case 1:
				printSeats(row, chair);
				blockSeat(row, chair);
				choose(row, chair);
				break;

			case 2:
				printSeats(row, chair);
				cancelSeat(row, chair);
				break;

			case 3:
				printSeats(row, chair);
				choose(row, chair);
				break;

			case 4:
				break;

			default:
				break;
			}

		} else {
			System.out.println("Bitte eine Zahl zwischen 1 und" +cinema.length  +" angeben.");
			choose(row, chair);
		}

	}


	/* Sitz belegen */
	private static void blockSeat(int row, int chair) throws IOException {
		System.out.println("\nWelchen Sitz möchten Sie belegen(z.B. '2 3'): ");
		System.out.print("Sitz: ");
		int y = sc.nextInt();
		System.out.print("In der Reihe: ");
		int x = sc.nextInt();

		if (x >= 0 && y >= 0 && x <= row && y <= chair) {
			if (cinema[x-1][y-1].equals("O")) {
				cinema[x - 1][y - 1] = "X";
				printSeats(row, chair);
			} else {
				System.out.println("Der Sitz ist bereits belegt, bitte wählen sie einen anderen.");
				blockSeat(row, chair);
			}
			
		} else {
			System.out.println("Die Zahl ist ncht aktzeptabel.");
			blockSeat(row, chair);
		}

	}


	/* Sitz Stonieren */
	private static void cancelSeat(int row, int chair) throws IOException {
		System.out.println("\nWelchen Sitz möchten sie Stonieren(z.B. '2 3'): ");
		System.out.print("Sitz: ");
		int y = sc.nextInt();
		System.out.print("In der Reihe: ");
		int x = sc.nextInt();

		if (cinema[x-1][y-1].equals("X")) {
			cinema[x-1][y-1] = "O";
			System.out.println("Sitz wurde stoniert.");
			choose(row, chair);

		} else {
			System.out.println("Der Sitz ist nicht belegt.");
			cancelSeat(row, chair);
		}

	}

}
