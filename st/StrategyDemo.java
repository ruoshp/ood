
public class StrategyDemo
{
	public static void main(String args[])
	{
		Customer cust;
		cust = new FTC("c1","abc",new DiscountFTC());
		cust.printBill(10000);
		cust = new RC("c2","def",new DiscountRC());
		cust.printBill(1000);
		cust = new SC("c3","ghi",new DiscountSC());
		cust.printBill(10000);
		cust.setDiscountType(new DiscountFTC());
		cust.printBill(10000);	
		
	}
}
