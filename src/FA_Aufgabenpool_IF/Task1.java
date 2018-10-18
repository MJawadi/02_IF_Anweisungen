package FA_Aufgabenpool_IF;

public class Task1 {

	public static void main(String[] args) {
		
		System.out.println("\nAufgabe 1: \nEntwickle ein Programm, bei dem der Benutzer eine Temperatur eingeben muss. Ist die \n"
				+ "Temperatur größer oder gleich 22 Grad Celsius, soll das Programm „Heute ist ein schöner \n"
				+ "Tag!“ ausgeben. Ist die Temperatur kleiner 22 Grad Celsius wird „Heute ist es nicht so schön!“ ausgegeben.");
		
		int temperatur;
		String word;
		
		System.out.print("Temperatur: ");
		temperatur = mainApp.scan.nextInt();
		if(temperatur < 22) {
			System.out.println("\nHeute ist es nicht so achön!");
		}else
			if(temperatur >= 22) {
				System.out.println("\nHeute ist ein schöner Tag!");
			}
		word = mainApp.scan.nextLine();
		while(true) {
			System.out.print("\nwould you like to give a new tempeture? y/n: ");
			word = mainApp.scan.nextLine();
			if(word.equals("Y") || word.equals("y")) {
				System.out.print("Temperatur: ");
				temperatur = mainApp.scan.nextInt();
				if(temperatur < 22) {
					System.out.println("\nHeute ist es nicht so achön!");
					word = mainApp.scan.nextLine();
				}else
					if(temperatur >= 22) {
						System.out.println("\nHeute ist ein schöner Tag!");
						word = mainApp.scan.nextLine();
					}
			}else {
				break;
			}
		}

	}

}
