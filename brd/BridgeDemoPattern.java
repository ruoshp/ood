
public class BridgeDemoPattern {
	public static void main(String args[])
	{
		CustomerBridge c;
		c = new RegularCustomer(new DisSeason1());
		c.purchaseItem("treadmills", 10000.0f);
		c = new RegularCustomer(new DisSeason2());
		c.purchaseItem("treadmills", 10000.0f);
		
	}
}
