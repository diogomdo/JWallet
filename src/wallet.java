import java.util.*;


public class wallet {
	
	public static void main(String[] args) {
		
		String command = null;
		
		//http://codereview.stackexchange.com/a/27505
		Map<String, callMethod> commandList = new HashMap<>();
		
		commandList.put("add", new callMethod() {
		    public void execute() {
		    	addOperation();
		    }});

		System.out.println("Starting JWallet");
		
		final callMethod serviceMethod = commandList.get("add");
		serviceMethod.execute();
		//http://stackoverflow.com/a/5488107
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter command:");
		command = input.nextLine();
		
		System.out.println("Command inserted: "+command);
			
	}
	
	static void addOperation() { 
		System.out.println("ADD");
	}


}
