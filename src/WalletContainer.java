import java.util.*;

public class WalletContainer {
	
	private static final Map<String, Integer> MoedasDefault = new HashMap<String, Integer>();
	private static final Map<String, Integer> NotasDefault = new HashMap<String, Integer>();
	
	static
    {
        MoedasDefault.put("1c", 0);
        MoedasDefault.put("2c", 0);
        MoedasDefault.put("5c", 0);
        MoedasDefault.put("10c", 0);
        MoedasDefault.put("20c", 0);
        MoedasDefault.put("50c", 0);
        MoedasDefault.put("1€", 0);
        MoedasDefault.put("2€", 0);
        NotasDefault.put("5€", 0);
        NotasDefault.put("10€", 0);
        NotasDefault.put("20€", 0);
        NotasDefault.put("50€", 0);
        NotasDefault.put("100€", 0);
        NotasDefault.put("200€", 0);
        NotasDefault.put("500€", 0);
    }
	
}
