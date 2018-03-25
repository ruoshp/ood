
public class DiscountSC implements Discount {

	@Override
	public double calcDiscount(double amount) {
		
			return amount*0.10f;
	}

}
