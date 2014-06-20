import java.util.*;

public class AddOperation implements CallMethod {

	@Override
	public void execute(String[] cmd, WalletContainer cont) {
		// System.out.print(cmd[2]);

		// http://stackoverflow.com/a/8722886
		Map<String, Integer> moedas = cont.getMoedasDefault();
		Map<String, Integer> notas = cont.getNotasDefault();

		for (String value : cmd) {
			if (moedas.containsKey(value) == true) {
				System.out.print("\nMoeda: " + value + "\n");
				cont.container.add(moedas.get(value));

			} else if (notas.containsKey(value) == true) {
				System.out.print("\nNotas: " + value + "\n");
				cont.container.add(notas.get(value));
			} else {
				System.out.print("\nInvalid value: " + value + "\n");
			}
		}
	}
}
