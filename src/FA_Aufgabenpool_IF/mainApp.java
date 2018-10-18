package FA_Aufgabenpool_IF;

import java.util.Scanner;

public class mainApp {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean doing =  true;
		
		while(doing) {
			
			scan = new Scanner(System.in);
			int taskNum = 0;
			System.out.println("\nType 0 to close program");
			System.out.print("\nWrite a task's number to show: ");
			taskNum = scan.nextInt();
			
			switch (taskNum) {
			
			case 0:
				System.out.println("End of Program");
				doing = false;
				break;
				
			case 1:
				Task1.main(null);
				System.out.println("\nEnd of task: " + taskNum);
				break;
				
			case 2:
				Task2.main(null);
				System.out.println("\nEnd of task: " + taskNum);
				break;
				
			case 3:
				Task3.main(null);
				System.out.println("\nEnd of task: " + taskNum);
				break;
				
			case 4:
				Task4.main(null);
				System.out.println("\nEnd of task: " + taskNum);
				break;
				
			case 5:
				Task5.main(null);
				System.out.println("\nEnd of task: " + taskNum);
				break;
				
			case 6:
				Task6.main(null);
				System.out.println("\nEnd of task: " + taskNum);
				break;
				
			}
		}

	}

}
