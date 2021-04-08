package adapterPattern;

public class PaymentApp {

	public void pay(int rupees) 
	{
		PaymentAdapter payAdapter=new PaymentAdapter();
		payAdapter.pay(rupees);
		
	}
	
	public static void main(String args[])
	{
		PaymentApp payApp=new PaymentApp();
		payApp.pay(140);
	}
}
