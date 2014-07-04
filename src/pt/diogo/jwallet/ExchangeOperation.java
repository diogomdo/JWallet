package pt.diogo.jwallet;

public class ExchangeOperation implements CallMethod{

	@Override
	public void execute(String[] cmd, WalletContainer cont) {
		// TODO Auto-generated method stub
		Utils Opp = new Utils();
		if(Opp.ExchangeInputValidation(cmd)){
			String url = "http://rate-exchange.appspot.com/currency?from=&to=EUR";
			String charset = "UTF-8";
			String convertTo = "USD";
			
		}
	}

}
