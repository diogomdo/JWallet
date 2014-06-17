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
        MoedasDefault.put("1e", 0);
        MoedasDefault.put("2e", 0);
        NotasDefault.put("5e", 0);
        NotasDefault.put("10e", 0);
        NotasDefault.put("20e", 0);
        NotasDefault.put("50e", 0);
        NotasDefault.put("100e", 0);
        NotasDefault.put("200e", 0);
        NotasDefault.put("500e", 0);
    }
	
}
