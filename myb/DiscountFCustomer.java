

public class DiscountFCustomer implements Idecathlon{
	public void calculateBillAmt(double mrportal){
		double billamt=0.0;
		double disc = 0.0;
		double offamt =0.0;
		
		disc =0.10;
		
		if(mrportal>6000)
			offamt= 200;
			
		billamt = mrportal - mrportal*disc - offamt;
		System.out.println("After discount , your bill is :- " + billamt);
			
	}
}