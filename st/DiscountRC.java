
public class DiscountRC implements Discount {

	@Override
	public double calcDiscount(double amount) {
		if(amount>6000)
		{
			double offer = 100;
			double d = amount * 0.12f;
			return (d+offer);
		}
		else
			return amount*0.12f;
	}

}
