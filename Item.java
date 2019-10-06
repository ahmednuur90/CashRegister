import java.util.*;

public class Item{

	private String name;
	private int quantity;
	private double price;

	public Item(){
		name = "Nothing";		//if there are no entries then this becomes the default entries
		quantity = 0;
		price = 0;
	}

	/**Description: This constructor is for each of the items
	   Input: This constructor has no input
	   Output: This constructor has no output
	*/
	public Item(String name, int quantity, double price){			//constructor 
		this();				//fills default information if info is missing
		setName(name);
		setQuantity(quantity);
		setPrice(price);
	}


	/**Description: This method sets the name for the Item
	   Input: This method has the input name
	   Output: This method places the input name into the Invoice class
	*/
	public void setName(String name){
		this.name = name;
	}


	/**Description: This method sets the quantity for the Item
	   Input: This method has no input
	   Output: This method places the input quantity into the Inovoice class
	*/
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	/**Description: This method sets the price for the Item
	   Input: This method has no input
	   Output: This methof places the input price into the Invoice class
	*/
	public void setPrice(double price){
		this.price = price;
	}

	/**Description: This method calls the name of the Item
	   Input: This method has no input
	   Output: This method gets the inputted name for the Invoice class
	*/
	public String getName(){
		return name;
	}

	/**Description: This method calls the quantity of the Item
	   Input: This method has no input
	   Output: This method gets the inputted quantity for the Invoice class
	*/
	public int getQuantity(){
		return quantity;
	}


	/**Description: This method calls the price of the Item
	   Input: This method has no input
	   Output: This method gets the inputted price for the Invoice class
	*/
	public double getPrice(){
		return price;
	}

	
}