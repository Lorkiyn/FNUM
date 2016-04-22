package arrays;

public class Array2Aufg1 {

	public static void main ( String[] args ) {

		int[][] data = {

				{3, 2, 5, 7},

				{1, 4, 4, 8},

				{9, 1, 0, 2},

				{0, 2, 6, 3} };

		// Summe deklarieren
		double sum = 0;
		// Summe berechnen

		for ( int zeile=0; zeile < data.length; zeile++) {

			for ( int spalte = 0; spalte < data[zeile].length; spalte++){
				sum += data[zeile][spalte];
			}

		}

		// Summe ausgeben
		System.out.println(sum);


	}

}