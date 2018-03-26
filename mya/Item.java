package prg1;

public class Item{
	String name;
	double price = 0.0;
	double billamt =0.0;
	int qty = 0;
	CalcTax ct;
	
	public Item(String n, double p , int q , CalcTax c){
		name = n;
		price = p;
		qty = q;
		ct = c;
	}
	
	public void setTax(CalcTax c){
		ct = c;
	}
	
	
	public void printPrice(){
		double tax = ct.taxAmt(qty,price);
		billamt = price*qty+tax;
		System.out.println("\n\nTaxTax = "+tax);
		System.out.println("Item :- "+name + " units :-"+qty+" Price/unit :- "+price + "Bill :- "+billamt);
		
	}
	
	
}
