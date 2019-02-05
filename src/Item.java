/**
 * 
 * @author Aman K. Patel
 *
 *
 */
public class Item {
	/**Name: cannot be empty*/
	private String Name;
	
	/**quantity: Cannot be negative or 0*/
	private int quantity;
	
	/** price: cannot be negative*/
	private double price;
	
	/** This is a default constructor*/
	public Item() 
	{
		Name = "Missing";
		quantity = 1;
		price = 0;
	}
	
	/** creating a parameterized constructor. Point to note is that we aren't using "this" here*/ 
	public Item(String name,int qtty,double cost)
	{
		this();
		setName(name);		// 'Name' is instant variable while 'name' is formal parameter
		setquantity(qtty);	//'quantity' is instant variable while 'qtty' is formal parameter
		setprice(cost);		//'price' is instant variable while 'cost' is formal parameter
	}
		
	public Item(Item i)
	{
		Name = i.getName();
		quantity = i.getquantity();
		price = i.getprice();
	}
	/**
	 * 
	 * @param name: This is the name of the Item.
	 */
	public void setName(String name)
	{
		if((name.trim()).length() > 0)
			Name = name;
	}
	
	/**
	 * 
	 * @param qtty: This is the amount of same type of item purchased
	 */
	public void setquantity(int qtty)
	{
		if(qtty > 0)
			quantity = qtty;
	}

	/**
	 * 
	 * @param cost: is the cost of each item.
	 */
	public void setprice(double cost)
	{
		if(cost > 0)
			price = cost;
	}
	/**
	 * 
	 * @return Name of item.
	 */
	public String getName()
	{
		return Name;
	}

	/**
	 * 
	 * @return Quantity: of the Item.
	 */
	public int getquantity()
	{
		return quantity;
	}
	
	/**
	 * 
	 * @return price of the Item.
	 */
	public double getprice()
	{
		return price;
	}
	
	/**
	 * @return IT: This method return the formated version of the string IT
	 */
	public String toString()
	{
		String IT = "";
		if(Name == "Missing")	
			return Name;
		else
		{
			IT = Name+"						"+quantity+"			"+price+"		"+(quantity*price);
			return IT;
		}
	}
}
