package arrays;

public class Array2Aufg4 {

	public static void main ( String[] args ) {
		int minima = 0;
		int maxima = 0;

		int[][] data = {

				{3, 2, 5, 7},

				{1, 4, 4, 8},

				{9, 1, 0, 2},

				{0, 2, 6, 3} };

		// Summe berechnen

		for ( int zeile=0; zeile < data.length; zeile++) {

			for ( int spalte = 0; spalte < data[zeile].length; spalte++){
				if (data[zeile][spalte] < minima) {
					minima = data[zeile][spalte];
				}
				
				if (data[zeile][spalte] > maxima) {
					maxima = data[zeile][spalte];
				}
				
			}

		}

		// Summe ausgeben
		System.out.println("Minima: " +minima
				+"\nMaxima: " +maxima);


	}

}