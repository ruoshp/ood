
public class SC extends Customer {

	SC(String id,String name,Discount dsc)
	{
		super(id,name);
		this.dsc = dsc;
	}
	@Override
	void typeOfCustomer() {
		// TODO Auto-generated method stub
		System .out.println("SENIOR CUSTOMER");
	}

}
