
public abstract class OrderProcessingTemplate {
	abstract ItemTemplate selectItem();
	abstract String doPayment(ItemTemplate item);
	abstract void doDelivery();
	
	void purchase()
	{
		ItemTemplate item = selectItem();
		System.out.println(doPayment(item));
		doDelivery();
	}
}
