package adapterPattern;

public class PaymentAdapter {

	public void pay(int rupees)
	{
		int dollars=0;
		if(rupees>0)
		{
			dollars=rupees/70;
		}
		PaymentProcessor paymentProcess=new PaymentProcessorImpl();
		paymentProcess.pay(dollars);
		
	}
}
