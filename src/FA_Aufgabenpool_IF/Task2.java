package FA_Aufgabenpool_IF;

public class Task2 {

	public static void main(String[] args) {
		
		System.out.println("Aufgabe 2: Es soll ein Programm entwickelt werden, das einen Rabatt von 5% auf den Gesamteinkaufs-preis berechnet, "
				+ "\nsofern der Kunde für einen Betrag größer oder gleich 1000,00 € eingekauft hat. Der Benutzer gibt lediglich den "
				+ "\nzu zahlenden Gesamtpreis ein. Das Programm gibt dann den Rabatt und den zu zahlenden "
				+ "\nGesamtbetrag oder die Meldung aus, dass kein Rabatt gewährt wird.");
		double betrag, rabatt;
		String word;
		
		System.out.print("Betrag: ");
		betrag = mainApp.scan.nextDouble();
		if(betrag >= 1000) {
			rabatt = betrag/100*5;
			betrag = betrag-rabatt;
			System.out.println("\nSie erhalten einen Rabatt von 5%: "+ rabatt + "EUR. ");
			System.out.println("Sie muessen "+betrag+" EUR zahlen.");
		}else {
			System.out.println("Sie erhalten erst ab einem Rechnungsbetrag");
			System.out.println("von 1000 EUR einen Rabatt.");
			System.out.println("Sie müssen " +betrag + " EUR zahlen.");
		}
		word = mainApp.scan.nextLine();
		while(true) {
			System.out.print("\nEnter new amount to calculate? y/n: ");
			word = mainApp.scan.nextLine();
			if(word.equals("y") || word.equals("Y")) {
				System.out.print("Betrag: ");
				betrag = mainApp.scan.nextDouble();
				if(betrag >= 1000) {
					rabatt = betrag/100*5;
					betrag = betrag-rabatt;
					System.out.println("\nSie erhalten einen Rabatt von 5%: "+ rabatt + "EUR. ");
					System.out.println("Sie muessen "+betrag+" EUR zahlen.");
					word = mainApp.scan.nextLine();
				}else {
					System.out.println("Sie erhalten erst ab einem Rechnungsbetrag");
					System.out.println("von 1000 EUR einen Rabatt.");
					System.out.println("Sie müssen " +betrag + " EUR zahlen.");
					word = mainApp.scan.nextLine();
				}
			}else {
				break;
			}
		}

	}

}
