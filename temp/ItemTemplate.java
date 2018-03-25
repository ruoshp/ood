
public class ItemTemplate {
	String name,type,brand;float price;
	ItemTemplate(String type,String name,String brand,float price)
	{
		this.name=name;
		this.type =type;
		this.brand=brand;
		this.price=price;
	}
	public String toString()
	{
		return "cycle TYPE: "+type+" cycle name: "+name+" cycle brand: "+brand+" cycle price: "+price;
	}
}
