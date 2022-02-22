
import java.util.Scanner;

public class Vending {

	public static void main(String[] args) {
		double snacks = snackMenu();
	}

	public static double snackMenu() {
		Scanner question = new Scanner(System.in);
		Scanner input = new Scanner(System.in);

		System.out.println(">Hello! Welcome to the vending machine:) \n>Please know that we only accept 1$ bills.");
		System.out.println(">Please select a snack below!");

<<<<<<< HEAD
		
		System.out.println("1: KitKat, price: 2.00 ");
		System.out.println("2: Orange Juice, price: 3.00");
		System.out.println("3: Cape Code Chips, price: 4.00");
		System.out.println("4: Water, price: 1.00");
		System.out.println("5: PopTarts, price: 2.00");
=======
		System.out.println("selection 1: KitKat, price: 2.00 ");
		System.out.println("selection 2: Orange Juice, price: 3.00");
		System.out.println("selection 3: Cape Code Chips, price: 4.00");
		System.out.println("selection 4: Water, price: 1.00");
		System.out.println("selection 5: PopTarts, price: 2.00");
>>>>>>> 8e03e41cda2876771f970682b547caabd47c4675

		
		double price = 0.00;
				
		int Selection = question.nextInt();
<<<<<<< HEAD
			if (Selection == 1) {
				price = 2.00;
			}else if (Selection == 2) {
				price = 3.00;
			}else if (Selection == 3) {
				price = 4.00;
			}else if (Selection == 4) {
				price = 1.00;
			}else if (Selection == 5) {
				price = 2.00;
			}else {
				System.out.println("You did not enter a correct selection.");
			}
		
		System.out.println(">Please insert your money.");
		
		double money = question.nextInt();
		
		boolean enoughMoney = false;
				
		while (enoughMoney == false) {
		 price = price - money;
		  if (price == 0) {
			  
			  System.out.println("Thank you for the transaction");
			  enoughMoney = true;
	
		  }else {
			  System.out.println(">Please insert your money.");
			  money = question.nextInt();
			  
		  }
			

		}
		
		return Selection;
		}
		
		
	}
	
=======
		return Selection; }}

		//int money = question.nextInt();
		
	
		//while (snackMenu > money) {
			//System.out.println("Please insert money"); 
		//}
		//return snackMenu-money;
		//System.out.println("You picked a great choice, have a good day :)");
	//}


		
//}}
>>>>>>> 8e03e41cda2876771f970682b547caabd47c4675

