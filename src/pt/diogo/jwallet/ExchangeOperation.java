package pt.diogo.jwallet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class ExchangeOperation implements CallMethod {

	@Override
	public void execute(String[] cmd, WalletContainer cont) throws IOException {

		Utils Opp = new Utils();
		String url = "http://rate-exchange.appspot.com/currency?from=USD&to=EUR";
		String charset = "UTF-8";
		URLConnection connection = new URL(url).openConnection();

		InputStream response = connection.getInputStream();

		connection.getHeaderField("Content-Type");

		if (charset != null) {
			try (BufferedReader reader = new BufferedReader(
					new InputStreamReader(response, charset))) {
				for (String line; (line = reader.readLine()) != null;) {
					System.out.print("Rate Value: " + Opp.getRate(line) + "\n");
					List<ICurrency> totalList = cont.container;
					Integer total = 0;

					for (ICurrency value : totalList) {
						total = value.getValue() + total;
					}

					System.out.printf("%.2f $",
							(total / Opp.getRate(line)) / 100);
				}
			}
		}
	}
}
