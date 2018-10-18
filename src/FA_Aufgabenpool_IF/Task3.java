package FA_Aufgabenpool_IF;

public class Task3 {

	public static void main(String[] args) {
		
		System.out.println("Aufgabe 3. Es soll ein Programm geschrieben werden, in dem ein Benutzer drei unterschiedliche Größen"
				+ "\neingibt. Das Programm sortiert die eingegebenen Daten in absteigender Reihenfolge und gibt sie aus.");
		double zahl1, zahl2, zahl3, keep;
		String word;
		
		System.out.print("Geben Sie die erste Groesse ein: ");
		zahl1 = mainApp.scan.nextDouble();
		System.out.print("Geben Sie die zweite Groesse ein: ");
		zahl2 = mainApp.scan.nextDouble();
		System.out.print("Geben Sie die dritte Groesse ein: ");
		zahl3 = mainApp.scan.nextDouble();
		
		if (zahl1 < zahl2) {
			keep = zahl1;
			zahl1 = zahl2;
			zahl2 = keep;
		} 
		if (zahl1 < zahl3) {
			keep = zahl1;
			zahl1 = zahl3;
			zahl3 = keep;
		} 
		if (zahl2 < zahl3) { 
			keep = zahl2; 
			zahl2 = zahl3; 
			zahl3 = keep; 
		}
		System.out.println("\n1. "+zahl1+"\n2. "+zahl2+"\n3. "+zahl3);
		word = mainApp.scan.nextLine();
		while(true) {
			System.out.print("\nWould you like to enter new numbers? y/n: ");
			word = mainApp.scan.nextLine();
			
			if(word.equals("Y") || word.equals("y")) {
				System.out.print("Geben Sie die erste Groesse ein: ");
				zahl1 = mainApp.scan.nextDouble();
				System.out.print("Geben Sie die zweite Groesse ein: ");
				zahl2 = mainApp.scan.nextDouble();
				System.out.print("Geben Sie die dritte Groesse ein: ");
				zahl3 = mainApp.scan.nextDouble();
				
				if (zahl1 < zahl2) {
					keep = zahl1;
					zahl1 = zahl2;
					zahl2 = keep;
				} 
				if (zahl1 < zahl3) {
					keep = zahl1;
					zahl1 = zahl3;
					zahl3 = keep;
				} 
				if (zahl2 < zahl3) { 
					keep = zahl2; 
					zahl2 = zahl3; 
					zahl3 = keep; 
				}
				System.out.println("\n1. "+zahl1+"\n2. "+zahl2+"\n3. "+zahl3);
				word = mainApp.scan.nextLine();
			}else {
				break;
			}
		}

	}

}
