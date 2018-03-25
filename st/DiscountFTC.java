
public class DiscountFTC implements Discount {

	@Override
	public double calcDiscount(double amount) 
	{
		
			return amount*0.15f;
	}

}
