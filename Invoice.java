import java.util.*;

public class Invoice{

	private Item[] items = new Item[3];
	private int numItems = 3;

	/**Description: This method places the user's information (items) into an array
	   Input: This method doesn't have any inputs
	   Output: This method doesn't have any outputs
	*/
	public Invoice(){	
		for(int i = 0; i < numItems; i++){
			items[i] = new Item();
		}
	}

	/**Description: This method allows the user to enter all of their items into an array
	   Input: The inputs are an integer for quantity, string for name, and double for price
	   Output: The method stores the information into each item
	*/
	public void getItems(){

		Scanner input = new Scanner(System.in);

		for(int i = 0; i < numItems; i++){
			System.out.printf("Input name of Item "+ (i+1) +": ");
			items[i].setName(input.nextLine());

			System.out.printf("Input quantity of Item " + (i+1) +": ");
			items[i].setQuantity(input.nextInt());

			System.out.printf("Input price of Item " + (i+1) +": ");
			items[i].setPrice(input.nextFloat());
			input.nextLine();
		}

	}
	/**Description: This method prints the users total and all formats the bill properly
	   Input: The inputs for this method is the prices that the user entered in the getItems method
	   Output: The output is the billing information that's calculated based on the user's entries
	*/
	public void printBill(){
		double subTotal = 0;

		for(int i = 0; i < numItems; i++){
			subTotal += items[i].getPrice()*items[i].getQuantity();
		}

		double tax = (subTotal*0.0625);

		double total = subTotal + tax;

		System.out.println("Your Bill:");
		System.out.println("Item: " + String.format("%30s","Quantity: ") + String.format("%10s","Price: ") + String.format("%10s","Total: "));
		for(int i = 0; i < numItems; i++){
			System.out.println(String.format("%1$-" + 25 + "s",items[i].getName()) + String.format("%10d", items[i].getQuantity()) + String.format("%10.2f",items[i].getPrice()) +  String.format("%10.2f",items[i].getPrice()*items[i].getQuantity()));
	
		}
		System.out.println();//Prints a new line
		System.out.println(String.format("%1$-" + 25 + "s","Subtotal") + String.format("%30.2f",subTotal));
		System.out.println(String.format("%1$-" + 25 + "s","6.25% sales tax") + String.format("%30.2f",tax));
		System.out.println(String.format("%1$-" + 25 + "s","Total") + String.format("%30.2f",total));
	}
}
