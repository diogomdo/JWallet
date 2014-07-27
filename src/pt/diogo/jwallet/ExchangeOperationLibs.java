package pt.diogo.jwallet;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class ExchangeOperationLibs implements CallMethod{

	@Override
	public void execute(String[] cmd, WalletContainer cont) throws IOException {
		
		HttpClient client = new DefaultHttpClient();
        HttpGet request = null;
		try {
			request = new HttpGet("http://rate-exchange.appspot.com/currency?from=USD&to=EUR");
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

            String content = EntityUtils.toString(entity);
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

		
	}
	
	
}
