package arrays;

public class Array2Aufg2 {

	public static void main ( String[] args ) {
		int[] sumArray = new int[4];

		int[][] data = {

				{3, 2, 5, 7},

				{1, 4, 4, 8},

				{9, 1, 0, 2},

				{0, 2, 6, 3} };

		// Summe berechnen

		for ( int zeile=0; zeile < data.length; zeile++) {

			for ( int spalte = 0; spalte < data[zeile].length; spalte++){
				sumArray[zeile] += data[zeile][spalte];
			}

		}

		// Summe ausgeben
		for (int i = 0; i < sumArray.length;i++) System.out.println(i+1 +". Summe Zeile: " +sumArray[i]);


	}

}