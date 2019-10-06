/**Author: Ahmed Nuur
   Date: October 02, 2019
   Student ID: 105031864
   Program: This program allows the user to enter 3 different items with information like price, quantity and name then displays a bill to the user with a tax rate of 6.25%
*/
import java.util.*;

/**Description: This method calls the Invoice which gets the Items from the Item class and prints the bill
   Input: This method has no input
   Output: This method outputs a printed bill for your items
*/
public class CashRegister{
	public static void main(String[] args){
		Invoice invoice = new Invoice();

		invoice.getItems();
		invoice.printBill();
	}
}