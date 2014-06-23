package pt.diogo.jwallet;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class Wallet {

	public static void main(String[] args) {

		String command = null;
		WalletContainer cont = new WalletContainer();
		// http://codereview.stackexchange.com/a/27505
		Map<String, CallMethod> commandList = new HashMap<>();

		commandList.put("add", new AddOperation());
		commandList.put("total", new ContainerTotal());
		commandList.put("notas", new DescribeNotas());
		commandList.put("moedas", new DescribeMoedas());

		System.out.println("Starting JWallet");
		while (true) {
			// http://stackoverflow.com/a/5488107
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.println("\nPlease enter command:");
			command = input.nextLine();

			Utils parse = new Utils();
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
					final CallMethod serviceMethod = commandList.get(cmd[0]);
					//remove add from string http://stackoverflow.com/a/12812355
					List<String> list = new ArrayList<String>(Arrays.asList(cmd));
					list.remove("add");
					cmd = list.toArray(new String[0]);
					serviceMethod.execute(cmd, cont);
				}

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}