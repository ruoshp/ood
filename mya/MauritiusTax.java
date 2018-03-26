package prg1;

public class MauritiusTax implements CalcTax{
	double tax;
	
	public double taxAmt(int qty , double price){
		tax = qty*price*0.025f;
		return tax;
	}
}