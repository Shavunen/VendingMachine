import java.util.Scanner;

public class Vending {

	public static void main(String[] args) {
		double Snacks = snackmenue();

	}

	private static double snackmenue() {
		Scanner question = new Scanner(System.in);

		double Selection = 0.00;

		System.out.println("Please select a snack from our vending machine!!");
		
		System.out.println("DELETE  DHRUVI");

		System.out.println("selection 1: KitKat, price 1.70");
		System.out.println("selection 2: Orange Juice, price 2.50");
		System.out.println("selection 3: Cape Code Chips, price 3.60");
		System.out.println("selection 4: Water, price 1.40");
		System.out.println("selection 5: PopTarts, price 2.10");

		Selection = question.nextDouble();

		return Selection;

	}

}
