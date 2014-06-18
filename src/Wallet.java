import java.util.*;

public class Wallet {
	
	public static void main(String[] args) {
		
		String command = null;
		
		//http://codereview.stackexchange.com/a/27505
		Map<String, CallMethod> commandList = new HashMap<>();
		
		commandList.put("add", new AddOperation());
		
		System.out.println("Starting JWallet");
		while(true){
			//http://stackoverflow.com/a/5488107
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter command:");
			command = input.nextLine();
			
			Utils parse = new Utils();
			String[] cmd = parse.Parser(command);
			System.out.println("Command: "+cmd[0]);
			
			try{
				if (command.length() == 0 && commandList.containsKey(cmd[0]) != true )
		        	{
		            	System.out.println("No command entered or invalid");
		        	}
				else if(cmd[0].contains("exit")){
					System.out.print("Terminated");
					break;
					}
		        else
		        	{
		        		final CallMethod serviceMethod = commandList.get(cmd[0]);
						serviceMethod.execute(cmd);
		        	}
	
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}	
}

