import prg1.*;

public class TaxAdapter{
	public static void main(String args[]){
		SwedenTax st = new SwedenTax();
		Item i1 = new Item("Shoes",100,3,st);
		i1.printPrice();
		i1.setTax(new MauritiusTax());
		i1.printPrice();
	}
}