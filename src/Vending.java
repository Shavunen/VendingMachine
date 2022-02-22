
import java.util.Scanner;

public class Vending {

 public static void main(String[] args)	{
		double snacks = snackMenu();
 }
	public static double snackMenu() {
		Scanner question = new Scanner(System.in);
		Scanner input = new Scanner(System.in);


		System.out.println(">Hello! Welcome to the vending machine:) \n>Please know that we only accept 1$ bills.");
		System.out.println(">Please select a snack from our vending machine!!");

		
		System.out.println("selection 1: KitKat, price: 2.00 ");
		System.out.println("selection 2: Orange Juice, price: 3.00");
		System.out.println("selection 3: Cape Code Chips, price: 4.00");
		System.out.println("selection 4: Water, price: 1.00");
		System.out.println("selection 5: PopTarts, price: 2.00");

		int Selection = question.nextInt();
		
		System.out.println(">Please insert your money.");
		
		int money = question.nextInt();
		
		return Selection;
	}
	
}
