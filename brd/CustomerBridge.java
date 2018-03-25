
public abstract class CustomerBridge 
{
	abstract float getDiscount(String name);
	
	void purchaseItem(String name,float price)
	{
		float discount = getDiscount(name)*price;
		float bill = price - discount;
		System.out.println(name);
		System.out.println("discount="+discount);
		System.out.println("bill="+bill);
	}
}
