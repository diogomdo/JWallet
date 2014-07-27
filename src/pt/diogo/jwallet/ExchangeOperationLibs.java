package pt.diogo.jwallet;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ExchangeOperationLibs implements CallMethod {

	@SuppressWarnings("unchecked")
	@Override
	public void execute(String[] cmd, WalletContainer cont) throws IOException {
		String content = null;
		HttpClient client = new DefaultHttpClient();
		HttpGet request = null;
		try {
			request = new HttpGet(
					"http://rate-exchange.appspot.com/currency?from=USD&to=EUR");
		} catch (URISyntaxException e1) {
			e1.printStackTrace();
		}

		try {
			HttpResponse response = null;
			try {
				response = client.execute(request);
			} catch (HttpException e) {
				e.printStackTrace();
			}
			HttpEntity entity = response.getEntity();

			content = EntityUtils.toString(entity);
			// System.out.println(content);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Map<String, Object> myMap = new HashMap<String, Object>();

		ObjectMapper objectMapper = new ObjectMapper();
		myMap = objectMapper.readValue(content, HashMap.class);
		double rate = (double) myMap.get("rate");
		System.out.println("rate: " + rate + "\n");

		List<ICurrency> totalList = cont.container;
		Integer total = 0;

		for (ICurrency value : totalList) {
			total = value.getValue() + total;
		}

		System.out.printf("%.2f$", (total / rate) / 100);
	}

}
