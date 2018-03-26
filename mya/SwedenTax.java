package prg1;

public class SwedenTax implements CalcTax{
	double tax;
	public double taxAmt(int qty,double price){
		tax = qty*price*0.05f;
		return tax;
	} 
}