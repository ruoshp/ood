import java.util.*;
public class TemplateOrderDemo {

	public static void main(String[] args) {
		System.out.println("Enter 1 for online payment 2 for offine payment");
		Scanner sc = new Scanner(System.in);
		int c = Integer.parseInt(sc.next());
		switch(c)
		{
		case 1:
			OnlineOrderTemplate obj1 = new OnlineOrderTemplate();
			obj1.purchase();
			break;
		case 2:
			OfflineOrderTemplate obj2 = new OfflineOrderTemplate();
			obj2.purchase();
			break;
		default:System.out.println("wrong choice");
				
		}
		
	}

}
