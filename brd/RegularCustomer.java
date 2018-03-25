
public class RegularCustomer extends CustomerBridge
{
	DiscountBridge dis;
	RegularCustomer(DiscountBridge dis)
	{
		this.dis = dis;
	}
	@Override
	float getDiscount(String name) 
	{
		// TODO Auto-generated method stub
		return dis.getSlab(name);
	}

}
