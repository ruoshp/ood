
public class DisSeason1 implements DiscountBridge {

	@Override
	public float getSlab(String item) {
		// TODO Auto-generated method stub
		return Slabs1_2018.returnSlab(item);
	}

}
