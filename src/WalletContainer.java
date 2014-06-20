import java.util.*;

public class WalletContainer {

	private static final Map<String, Integer> moedasDefault = new HashMap<String, Integer>();
	private static final Map<String, Integer> notasDefault = new HashMap<String, Integer>();
	ArrayList<Integer> container = new ArrayList<Integer>();

	static {
		moedasDefault.put("1c", 1);
		moedasDefault.put("2c", 2);
		moedasDefault.put("5c", 5);
		moedasDefault.put("10c", 10);
		moedasDefault.put("20c", 20);
		moedasDefault.put("50c", 50);
		moedasDefault.put("1e", 100);
		moedasDefault.put("2e", 200);
		notasDefault.put("5e", 500);
		notasDefault.put("10e", 1000);
		notasDefault.put("20e", 2000);
		notasDefault.put("50e", 5000);
		notasDefault.put("100e", 10000);
		notasDefault.put("200e", 20000);
		notasDefault.put("500e", 50000);
	}

	public Map<String, Integer> getMoedasDefault() {
		return moedasDefault;
	}

	public Map<String, Integer> getNotasDefault() {
		return notasDefault;
	}

	public void setContainer(ArrayList<Integer> Container) {
		this.container = Container;
	}

	public ArrayList<Integer> getContainer() {
		return container;
	}
}
