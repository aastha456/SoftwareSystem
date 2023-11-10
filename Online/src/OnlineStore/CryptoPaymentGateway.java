package OnlineStore;

public class CryptoPaymentGateway implements PaymentGateway {
      private String url;
      private String apiKey;
      
      CryptoPaymentGateway(String apiKey) {
    	  
      }

	@Override
	public void processPayment(Customer customer, double amount) {
		
		
	}
}
