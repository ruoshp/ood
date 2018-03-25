
public abstract class Customer 
{
	static String name;
	static String id;
	Discount dsc;
	Customer(String id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	abstract void typeOfCustomer();
	public void setDiscountType(Discount dsc)
	{
		this.dsc =dsc;
	}
	void printBill(double amt)
	{
		double discount = dsc.calcDiscount(amt);
		double bill = amt - discount;
		System.out.println("ID = "+id);
		System.out.println("Name = "+name);
		System.out.println("DISCOUNT = "+discount);
		System.out.println("BILL = "+bill);
		
	}
}
