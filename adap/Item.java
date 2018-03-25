public class Item {
	String name;
	double price;
	int qty;
	CalcTax ct;
	
	Item(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	
	void setQuantity(int qty)
	{
		this.qty=qty;
	}
	
	void setTax(CalcTax ct )
	{
		this.ct = ct;
	}
	
	void printPrice()
	{
		double tax =ct.taxAmount(price, qty);
		double bill_amount = price*qty +tax;
		System.out.println("name of item="+name);
		System.out.println("price of item="+price);
		System.out.println("number of units="+qty);
		System.out.println("tax="+tax);
		System.out.println("Total amount="+bill_amount);
		System.out.println();
	}
}