package FA_Aufgabenpool_IF;

public class Task5 {
	
	public static void main(String[] args) {
		
		System.out.println("Aufgabe 5: Schreibe ein Programm, das den Anwender nach der Anzahl der Schrauben, Muttern und"
				+ "\nBeilegscheiben fragt und dann den Gesamtbetrag berechnet und ausgibt. Zusätzlich über-"
				+ "\nprüft das Programm die Bestellung. Es ist normalerweise ein Fehler, wenn mehr Schrauben"
				+ "\nals Muttern bestellt werden. In diesem Fall gibt das Programm die Meldung aus \"Kontrollie-"
				+ "\nren Sie Ihre Bestellung!\". Andernfalls gibt das Programm aus \"Die Bestellung ist okay.\" In"
				+ "\njedem Fall wird der Gesamtbetrag ausgegeben.");
		int schrauben, muttern, scheiben, betrag;
		String word;
		
		System.out.print("Anzahl Schrauben: ");
		schrauben = mainApp.scan.nextInt();
		System.out.print("Anzahl Muttern: "); 
		muttern = mainApp.scan.nextInt(); 
		System.out.print("Anzahl scheiben: "); 
		scheiben = mainApp.scan.nextInt();
		
		if (schrauben != muttern){ 
			System.out.println("\nKontrollieren Sie Ihre Bestellung!"); 
		} else{ 
				System.out.println("Die Bestellung ist okay."); 
		  } 
		betrag = schrauben * 5 + muttern* 3 + scheiben * 1; 
		System.out.println("Gesamtbetrag: "+ betrag);
		word = mainApp.scan.nextLine();
		while(true) {
			System.out.print("\nWould you like to enter a new number? y/n: ");
			word = mainApp.scan.nextLine();
			if(word.equals("y") || word.equals("Y")) {
				System.out.print("Anzahl Schrauben: ");
				schrauben = mainApp.scan.nextInt();
				System.out.print("Anzahl Muttern: "); 
				muttern = mainApp.scan.nextInt(); 
				System.out.print("Anzahl scheiben: "); 
				scheiben = mainApp.scan.nextInt();
				
				if (schrauben != muttern){ 
					System.out.println("\nKontrollieren Sie Ihre Bestellung!"); 
				} else{ 
						System.out.println("Die Bestellung ist okay."); 
				  } 
				betrag = schrauben * 5 + muttern* 3 + scheiben * 1; 
				System.out.println("Gesamtbetrag: "+ betrag);
				word = mainApp.scan.nextLine();
			}else {
				break;
			}
			
		}

	}

}
