package pt.diogo.jwallet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WalletEnum {

	public static void main(String[] args) {

		String command = null;
		WalletContainerEnum cont = new WalletContainerEnum();
		// http://codereview.stackexchange.com/a/27505
		Map<String, CallMethodEnum> commandList = new HashMap<>();

		commandList.put("add", new AddOperationEnum());
		commandList.put("total", new ContainerTotalEnum());
		commandList.put("notas", new DescribeNotasEnum());
		commandList.put("moedas", new DescribeMoedasEnum());

		System.out.println("Starting JWallet");
		while (true) {
			// http://stackoverflow.com/a/5488107
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("\nPlease enter command:");
			command = input.nextLine();

			UtilsEnum parse = new UtilsEnum();
			String[] cmd = parse.Parser(command);
			System.out.println("Command: " + cmd[0]);

			try {
				if (command.length() == 0
						&& commandList.containsKey(cmd[0]) != true) {
					System.out.println("\nCommand entered invalid");
				} else if (cmd[0].contains("exit")) {
					System.out.print("\nTerminated");
					break;
				} else {
					final CallMethodEnum serviceMethod = commandList.get(cmd[0]);
					serviceMethod.execute(cmd, cont);
				}

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
