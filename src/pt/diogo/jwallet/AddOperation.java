package pt.diogo.jwallet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pt.diogo.jwallet.WalletContainer.Moedas;
import pt.diogo.jwallet.WalletContainer.Notas;

public class AddOperation implements CallMethod {

	@Override
	public void execute(String[] cmd, WalletContainer cont) {

		// remove add from string
		// http://stackoverflow.com/a/12812355
		List<String> list = new ArrayList<String>(Arrays.asList(cmd));
		list.remove("add");
		cmd = list.toArray(new String[0]);

		for (String value : cmd) {
			Moedas Moeda = Moedas.find(value);
			Notas Nota = Notas.find(value);
			if (Moeda != null) {
				cont.container.add(Moeda);
				System.out.print("Moeda: " + value + " added\n");
			} else if (Nota != null) {
				cont.container.add(Nota);
				System.out.print("Nota: " + value + " added\n");
			} else {
				System.out.print("Ortodox values\n");
				Utils Opp = new Utils();
				System.out.print("to decomopose: " + value + "\n");
				int valueInt = Opp.deconstruct(value);
				if (valueInt != 0) {
					cont.findAndAdd(valueInt);
					System.out.print("\n");
				}
			}
		}
	}
}
