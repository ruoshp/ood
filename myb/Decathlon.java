

public class Decathlon{
	String name;
	int age;
	Idecathlon id;
	
	public Decathlon(String n,int a){
	name=n;
	age=a;
	}
	
	public void setDiscountType(Idecathlon r){
		id=r;
	}
	
	public void calculateDiscount(double mrportal){
		id.calculateBillAmt(mrportal);
	}
	
	public void display(){
		System.out.println("\nName : - "+name+"\nAge :- "+age);
	}
}
