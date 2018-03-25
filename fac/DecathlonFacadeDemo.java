import Fac.*;
public class DecathlonFacadeDemo 
{
	public static void main(String[] args)
	{
		ItemPurchased it = new ItemPurchased("i1","btwin 320",1,15000.0f);
		Sports2000Facade sf = new Sports2000Facade(it);
	}

}
