import java.util.*;

public class WalletContainer {
	
	private static final Map<String, Integer> MoedasDefault = new HashMap<String, Integer>();
	private static final Map<String, Integer> NotasDefault = new HashMap<String, Integer>();
	ArrayList<Integer> Container = new ArrayList<Integer>();
	
	static
    {
        MoedasDefault.put("1c", 1);
        MoedasDefault.put("2c", 2);
        MoedasDefault.put("5c", 5);
        MoedasDefault.put("10c", 10);
        MoedasDefault.put("20c", 20);
        MoedasDefault.put("50c", 50);
        MoedasDefault.put("1e", 100);
        MoedasDefault.put("2e", 200);
        NotasDefault.put("5e", 500);
        NotasDefault.put("10e", 1000);
        NotasDefault.put("20e", 2000);
        NotasDefault.put("50e", 5000);
        NotasDefault.put("100e", 10000);
        NotasDefault.put("200e", 20000);
        NotasDefault.put("500e", 50000);
    }
	
	public Map<String, Integer> getMoedasDefault(){
		return MoedasDefault;
	}
	public Map<String, Integer> getNotasDefault(){
		return NotasDefault;
	}
	public void setContainer(ArrayList<Integer> Container){
		this.Container = Container;
	}
	public ArrayList<Integer> getContainer(){
		return Container;
	}
}
