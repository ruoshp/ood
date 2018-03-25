package Fac;
public class Sports2000Facade 
{
	Sports2000ProcessSales re;
	ItemPurchased it;
	public Sports2000Facade(ItemPurchased it)
	{
		this.it=it;
		//if gift certificate is available
		re = new Sports2000ProcessSales(true, it.qty,it.price);
		re.processSale();
		
		/*//if you dont have gift certificate
		re = new Sports2000ProcessSales(false, it.qty,it.price);
		re.processSale();*/
	}
}
