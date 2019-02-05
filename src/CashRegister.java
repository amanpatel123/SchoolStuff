
import java.text.DecimalFormat;
import java.util.*;

/**
 * 
 * @author Aman K. Patel
 *	This CashRegister class just with the help of Invoice and Item class helps to show the user the bill of the Items the purchased
 */
public class CashRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**Here we use Scanner class and make its instance variable with the help of which I can take inputs from user*/
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter number of Item: ");
		int numItem = sn.nextInt();
		sn.nextLine();
		Item item = new Item();
		Invoice in = new Invoice();
		
		
		/**Here We ask user to input number of Items he purchased and runs the for loop for that number of time to ask for values of attributes of class Item*/
		for(int i=1;i<=numItem;i++)
		{
			System.out.println("Input name of item  "+i+": ");
			String str = sn.nextLine();
			item.setName(str);
			System.out.println("Input Quantity of item "+i+": ");
			int qty = sn.nextInt();
			item.setquantity(qty);
			System.out.println("input price of item  "+i+": ");
			double pr = sn.nextDouble();
			item.setprice(pr);
			sn.nextLine();
			in.addItem(item);
		
		}
		/**Here we print the content collected and calculated as The professor wants us to display*/
		System.out.println("\nYour Bill:\n");
		System.out.println("Item						Quantity		Price		Total");
		System.out.println(in.getItem());
		double Sum = in.sum();
		DecimalFormat df = new DecimalFormat(".##");
		Sum =Double.valueOf(df.format(Sum));
		double tax;
		tax = (Sum * 6.25)/100;
		
		double totalWithTax = Sum + Double.valueOf(df.format(tax));
		
		System.out.println("Subtotal"+"										"+Sum);
		System.out.println("6.25% sales tax"+"										"+Double.valueOf(df.format(tax)));
		System.out.println("Toatl:"+"											"+totalWithTax);
	}

}
