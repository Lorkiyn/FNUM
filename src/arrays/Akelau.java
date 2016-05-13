package arrays;

import java.io.IOException;

import IOClass.IO;

public class Akelau {

	public static void main(String[] args) throws IOException {
		/* Array Deklarierung */
		double[][] marks = null;
		double[] avg = null;
		
		/* Eingabe der Werte */
		System.out.print("Anzahl der Schüler: ");
		int count = IO.readInt(0);
		
		System.out.print("Anzahl der Noten pro Schüler: ");
		int countMark = IO.readInt(0);
		
		/* Array Instantiierung */
		marks = new double[count][countMark];
		avg = new double[count];
		
		/* Einlesen der Daten */
		for (int i = 0; i < count; i++) {
			System.out.println("\nNoten für den Schüler " +(i+1));
			for (int j = 0; j < countMark; j++) {
				System.out.print(" Note " +(j+1) +": ");
				marks[i][j] = IO.readDouble();
				avg[i] += marks[i][j];
				
			}
			
			avg[i] /= countMark;
			avg[i] = Math.round(avg[i]);
			
		}
		
		/* Ausgabe Noten */
		System.out.println("\nNoten:");
		for (int i = 0; i < count; i++) {
			System.out.print("Schüler " +(i+1) +": ");
			for (int j = 0; j < countMark; j++) {
				System.out.print(+marks[i][j] +"  ");
				
			}
			System.out.println("");
			
		}
		
		/* Ausgabe Durschschnitt */
		System.out.println("\nDurchschnittsnote:");
		for(int i = 0; i < count; i++) {
			System.out.println("Schüler " +(i+1) +": " +avg[i]);
		}
	}

}
