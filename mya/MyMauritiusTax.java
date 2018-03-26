package prg1;

public class MyMauritiusTax implements CalcTax{
	MauritiusTax obj = new MauritiusTax();
	double tax;
	public double taxAmt(int qty, double price){
		tax = obj.taxAmt(qty,price);
		return tax;
	}
}