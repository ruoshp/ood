import java.util.*;
public class OnlineOrderTemplate extends OrderProcessingTemplate {

	Cycle c_menu = new Cycle();
	Scanner sc = new Scanner(System.in);
	@Override
	ItemTemplate selectItem() {
		c_menu.displayMenu();
		System.out.println("enter 1/2/3/4");
		int ch = Integer.parseInt(sc.next());
		ItemTemplate i1;
		if(ch>=1&&ch<=4)
		{
			i1 = c_menu.al.get((ch-1));
			return i1;

		}
		else
		{
			System.out.println("item does not exist!");
			return null;
		}
			
	}

	@Override
	String doPayment(ItemTemplate item) {
		System.out.println("you have purchased: "+item.name);
		System.out.println("Amount to be paid: "+item.price+"Enter \n1.Card\2.Paytm");
		int ch = Integer.parseInt(sc.next());
		switch(ch)
		{
		case 1:card();
		break;
		case 2:Paytm();
		break;
		}
		
		return "Thanks for Shopping!!";
	}

	@Override
	void doDelivery() {
		System.out.println("Item will be delivered to your desired location");
		System.out.println("Enter delivery location");
		String addr = sc.next();
		System.out.println("Item will be delivered to "+addr+". You need to pay Rs.100 as shipping charges");
		
	}
	
	void card()
	{
		System.out.println("You have selected card as mode of payment");
		
	}
	void Paytm()
	{
		System.out.println("You have decide to pay using PayTm");
		
	}

}
