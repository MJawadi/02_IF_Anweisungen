package FA_Aufgabenpool_IF;

public class Task6 {
	
	public static void main(String[] args) {
		
		System.out.println("Aufgabe 6: Al's Last Chance Gas Station befindet sich an der Straße 190 am Rande des Death Valley. Die"
				+ "\nnächsten 200 Meilen gibt es keine weitere Tankstelle. Sie sollen ein Programm schreiben,"
				+ "\ndas den Fahrern hilft zu entscheiden, ob sie tanken sollen oder nicht. Das Programm fragt nach:"
				+ "\n\n· Der Tankkapazität in Gallonen (3,78l)"
				+ "\n· Der Benzinanzeige in Prozent (voll= 100, drei viertel voll = 75 usw.)"
				+ "\n· Dem Benzinverbrauch des Fahrzeuges in Meilen pro Gallone."
				+ "\n\nDie Ausgabe des Programms ist \"Tanken!\", oder \"Weiterfahren...\". Je nachdem, ob das"
				+ "\nFahrzeug genug Benzin für 200 Meilen hat oder nicht.");
		int kapazitaet, prozent, meilenProGallone;
		double gallonen, reichweite;
		String word;
		
		System.out.print("Tankkapazität: "); 
		kapazitaet = mainApp.scan.nextInt(); 
		System.out.print("Benzinanzeige: "); 
		prozent = mainApp.scan.nextInt(); 
		System.out.print("Meilen pro Gallone: "); 
		meilenProGallone = mainApp.scan.nextInt();
		
		gallonen = kapazitaet/100.0 * prozent; 
		reichweite = gallonen * meilenProGallone; 
		if (reichweite < 200){ 
			System.out.println("Tanken!"); 
		} else{ 
			System.out.println("Weiterfahren!"); 
		}
		word = mainApp.scan.nextLine();
		while(true) {
			System.out.print("Would you like to give a new number? y/n: ");
			word = mainApp.scan.nextLine();
			if(word.equals("y") || word.equals("Y")) {
				System.out.print("Tankkapazität: "); 
				kapazitaet = mainApp.scan.nextInt(); 
				System.out.print("Benzinanzeige: "); 
				prozent = mainApp.scan.nextInt(); 
				System.out.print("Meilen pro Gallone: "); 
				meilenProGallone = mainApp.scan.nextInt();
				
				gallonen = kapazitaet/100.0 * prozent; 
				reichweite = gallonen * meilenProGallone; 
				if (reichweite < 200){ 
					System.out.println("Tanken!"); 
				} else{ 
					System.out.println("Weiterfahren!"); 
				}
				word = mainApp.scan.nextLine();
			}else {
				break;
			}
			
		}

	}

}
