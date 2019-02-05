/**
 * This Invoice class collects the information of the Items we purchased and stores it into array of type Item and keeps track of number of Item customer buy
 * @author Aman K. Patel
 *
 */

public class Invoice {
	
	/**numItems: claculates number of Items*/
	int numItems=0;
	
	/**Items: can not be empty*/
	private final int MAXITEM = 10;
	/**
	 * Item[]: Array of the type item which stores the Information of each Item  
	 */
	Item[] itemObject = new Item[MAXITEM];
	
	/**
	 * 
	 * @param itm: this is the instant variable of Item class.
	 * @return	False if numItems is greater then MaxItem else return true
	 */
	public boolean addItem(Item itm)
	{
		if(numItems>MAXITEM)	
			{
				System.err.println("Maximum number of item reached, you can't add any more!");
				return false;
			}
		else
			{
				itemObject[numItems++] = new Item(itm);	// call the copy constructor;
				//itemObject[numItems++] = new Item(itm.getName(),itm.getquantity(),itm.getprice());	// call the constructure;
				return true;
			}
				
	}
	
	/**
	 * 
	 * @return fullInvoice: This is a formated string in a way that looks like a bill. 
	 */
	public String getItem() 
	{
		
		int i;
		String fullInvoice = "";
		for(i=0;i<numItems;i++)
		{
			fullInvoice += itemObject[i].toString();
			fullInvoice += "\n";
			
		}
		return fullInvoice;
	}
	
	int n=0;
	double Sum=0;
	/**
	 * 
	 * @return Sum: the sum of the total of each item.
	 */
	public double sum()
	{
		while(n<numItems)
		{
			Sum += (itemObject[n].getprice()) * (itemObject[n].getquantity());
			n++;
		}
		return Sum;
	}
	
}
