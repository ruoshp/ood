public class GST implements CalcTax 
{
	@Override
	public double taxAmount(double price, int qty)
	{
		return price*qty*0.18f;
	}

}