
public class Slabs1_2018 
{
	static float returnSlab(String item)
	{
		if(item.equals("tennis racket"))
			return 0.20f;
		else if(item.equals("cricket bats"))
			return 0.15f;
		else if(item.equals("treadmills"))
			return 0.30f;
		else if(item.equals("boxing gloves"))
			return 0.25f;
		else
			return 0.10f;
		
	}
}
