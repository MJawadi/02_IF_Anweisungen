package FA_Aufgabenpool_IF;

public class Task4 {

	public static void main(String[] args) {
		
		System.out.println("Aufgabe 4: Während einer Sonderaktion wird ein Rabatt von 10% auf alle Einkäufe mit einem Gesamt-"
				+ "\nbetrag von mehr als $10.00 gewährt. Schreiben Sie ein Programm, das nach dem Gesamtbe-"
				+ "\ntrag fragt und den Discountpreis berechnet. Der Gesamtbetrag wird in Cent (als Ganzzahl) eingegeben.");
		double betrag;
		String word;
		
		System.out.print("Geben Sie den Gesamtbetrag ein: ");
		betrag = mainApp.scan.nextDouble();
		if (betrag >= 1000){
			betrag = betrag *0.9;
		}
		System.out.println("\nDiscountpreis: "+ betrag);
		word = mainApp.scan.nextLine();
		while(true) {
			System.out.print("\nWould you like to give a number? y/n: ");
			word = mainApp.scan.nextLine();
			if(word.equals("y") || word.equals("Y")) {
				System.out.print("Geben Sie den Gesamtbetrag ein: ");
				betrag = mainApp.scan.nextDouble();
				if (betrag >= 1000){
					betrag = betrag *0.9;
				}
				System.out.println("\nDiscountpreis: "+ betrag);
				word = mainApp.scan.nextLine();
			}else {
				break;
			}
			
		}

	}

}
