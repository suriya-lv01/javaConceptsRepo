package adapterPattern;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public void pay(int dollars) {
		System.out.println("Paid the client "+dollars+"$");

	}

}
