
import java.util.*;

public class Bridge{
	public static void main(String args[]){
			double mrportal;
			int ch;
			Decathlon oRC = new RegCustomer("Sindhu",24);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your Category :-\n1.Senior Citizen\n2.Regular Customer\n3.First \nChoice:- ");
			ch = sc.nextInt();
			System.out.println("Enter the Amount :- ");
			mrportal = sc.nextDouble();
			
			switch(ch) {
					case 1:
						DiscountSnrCitizen odtype1 = new DiscountSnrCitizen();
						oRC.setDiscountType(odtype1);
						oRC.display();
						oRC.calculateDiscount(mrportal);
								break;
								
								
					case 2:
						oRC.setDiscountType(new DiscountRegCustomer());
						oRC.display();
						oRC.calculateDiscount(mrportal);
								break;
					case 3:
						oRC.setDiscountType(new DiscountFCustomer());
						oRC.display();
						oRC.calculateDiscount(mrportal);
								break;
					default:
						System.out.println("THANK YOU FOR SHOPPING WITH DECATHLON");
			sc.close();
			}	
    }
}