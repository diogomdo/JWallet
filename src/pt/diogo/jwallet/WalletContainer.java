package pt.diogo.jwallet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WalletContainer {

	// http://stackoverflow.com/a/13821728
//	Set<Integer> container = new HashSet<Integer>();
	List<Integer> container = new ArrayList<Integer>();
	public enum Moedas {
		DOISE("2e", 200), UME("1e", 100), CINQUENTAC("50c", 50), VITNEC("20c",
				20), DEZC("10c", 10), CINCOC("5c", 5), DOISC("2c", 2), UMC(
				"1c", 1);

		public final String label;
		public final int value;

		public static Moedas find(String label) {
			for (Moedas m : Moedas.values()) {
				if (m.label.equals(label)) {
					return m;
				}
			}

			return null;
		}

		// Nao percebi ser invocado so por 'Moedas(...'
		Moedas(String label, int value) {
			this.label = label;
			this.value = value;
		}
	}

	public List<Integer> findAndAdd(int value) {
		int valueToAdd = 0;
		List<Integer> allValues = new ArrayList<Integer>();
		while (value != 0) {
			for (Moedas m : Moedas.values()) {
//				 System.out.print("Value status: " + value + "\n");
//				 System.out.print("array: " + m.value + "\n");
				valueToAdd = m.value;
				if (m.value <= value) {
					System.out.print("to add " + m.value + "\n");
					value = value - valueToAdd;
					allValues.add(valueToAdd);
					break;
				}
			}
		}
		System.out.print(allValues);
		return allValues;
	}

	public enum Notas {
		QUINHENTOS("500e", 50000), DUZENTOSE("200e", 20000), CEME("100e", 10000), CINQUENTAE(
				"50e", 5000), VINTEE("20e", 2000), DEZE("10e", 1000), CINCOE(
				"5e", 500);

		public final String label;
		public final int value;

		// Porque 'Moedas" ao nomear o metodo?
		public static Notas find(String label) {
			for (Notas m : Notas.values()) {
				if (m.label.equals(label)) {
					return m;
				}
			}
			// Porque este null?
			return null;
		}

		// Nao percebi ser invocado so por 'Moedas(...'
		Notas(String label, int value) {
			this.label = label;
			this.value = value;
		}
	}

	public void setContainer(List<Integer> Container) {
		this.container = Container;
	}

	public List<Integer> getContainer() {
		return container;
	}
}
