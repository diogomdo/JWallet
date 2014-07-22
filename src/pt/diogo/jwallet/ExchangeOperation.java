package pt.diogo.jwallet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class ExchangeOperation implements CallMethod {

	@Override
	public void execute(String[] cmd, WalletContainer cont) throws IOException {
		// TODO Auto-generated method stub
		Map<String, String> myMap = new HashMap<String, String>();
		String[] s = null;
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
						line = line.replace("{", "");
					  	line = line.replace("}", "");
						line = line.replace("\"", "");
						s = line.split(",");
						System.out.print(line+"\n");
						String[] pairs = line.split(",");
						for (int i=0;i<pairs.length;i++) {
						    String pair = pairs[i];
						    String[] keyValue = pair.split(":");
						    System.out.print(keyValue[1]+"\n");
						    myMap.put(keyValue[0], keyValue[1]);
						}
					}
				}
			}
			
			System.out.print(myMap.get("rate"));
		}
	}
}
