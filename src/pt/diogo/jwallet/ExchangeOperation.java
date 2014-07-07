package pt.diogo.jwallet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map.Entry;

public class ExchangeOperation implements CallMethod {

	@Override
	public void execute(String[] cmd, WalletContainer cont) throws IOException {
		// TODO Auto-generated method stub
		Utils Opp = new Utils();
		if (Opp.ExchangeInputValidation(cmd)) {
			String url = "http://rate-exchange.appspot.com/currency?from=USD&to=EUR";
			String charset = "UTF-8";
			String convertTo = "USD";

			URLConnection connection = new URL(url).openConnection();

			InputStream response = connection.getInputStream();

			String contentType = connection.getHeaderField("Content-Type");

			if (charset != null) {
				try (BufferedReader reader = new BufferedReader(
						new InputStreamReader(response, charset))) {
					for (String line; (line = reader.readLine()) != null;) {
						System.out.println(line);
					}
				}
			}

		}
	}

}
