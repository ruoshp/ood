import java.util.*;
public class Cycle implements Menu{
	ArrayList<ItemTemplate> al = new ArrayList<ItemTemplate>();
	public void displayMenu()
	{
		al.add(new ItemTemplate("Gear","MyCycle1","Hercules",20000.0f));
		al.add(new ItemTemplate("Non-Gear","MyCycle2","LadyBird",9000.0f));
		al.add(new ItemTemplate("Racing","MyCycle3","Hero",25000.0f));
		al.add(new ItemTemplate("Mountain Climbing","MyCycle4","BSA",40000.0f));
		
		Iterator<ItemTemplate> i1 = al.iterator();
		while(i1.hasNext())
		{
			ItemTemplate iobj = i1.next();
			System.out.println(iobj);
		}
	}
}
