package einUndAusgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReader {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Name: ");
		String name = br.readLine();

		System.out.print("Nachname: ");
		String nachname = br.readLine();

		System.out.print("Geschl�cht m/w: ");
		String geschl�cht = br.readLine();

		if (geschl�cht.equals("w")){
			System.out.println("Hallo Frau, " +name +" " +nachname);
			return;
		}
		if (geschl�cht.equals("m")){
			System.out.println("Hallo Herr, " +name +" " +nachname);
			return;
		}

		else {
			System.out.println("Falsche Eingabe!");
		}

	}

}

