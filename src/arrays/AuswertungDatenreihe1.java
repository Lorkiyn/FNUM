package arrays;

public class AuswertungDatenreihe1 { // 5 8 6 3 12 3 = 37 arith = 6,167 varianz = 9,8056
	
	public static void main(String args[]) {
		double[] array = {5, 8, 6, 3, 12, 3};
		System.out.println("Minimal: " +Mathe.ermittelMin(array)
		+"\nMaximal: "
		+Mathe.ermittleMax(array)
		+"\nArithbla: "
		+Mathe.berechneArith(array)
		+"\nVarianz: "
		+Mathe.berechneVarianz(array)
		+"\nStandartabweichung: "
		+Mathe.berechneStandartAbw(array));
	}
	
}
