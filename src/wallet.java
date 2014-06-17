import java.util.*;


public class Wallet {
	
	public static void main(String[] args) {
		
		String command = null;
		
		//http://codereview.stackexchange.com/a/27505
		Map<String, CallMethod> commandList = new HashMap<>();
		
		commandList.put("add", new AddOperation());
		
		System.out.println("Starting JWallet");

		//http://stackoverflow.com/a/5488107
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter command:");
		command = input.nextLine();
		
		CommandLineParsing parse = new CommandLineParsing();
		parse.Parser(command);
		
		try{
			if (command.length() == 0)
	        	{
	            	System.out.println("No command entered");
	        	}
	        else
	        	{
	        	
	        		final CallMethod serviceMethod = commandList.get(command);
					serviceMethod.execute();
	        	}

		}catch(Exception e){
			System.out.println(e);
		}
	}	
}

