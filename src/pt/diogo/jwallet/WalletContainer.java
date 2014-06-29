package pt.diogo.jwallet;

import java.util.ArrayList;
import java.util.List;

public class WalletContainer {

	// http://stackoverflow.com/a/13821728
	List<ICurrency> container = new ArrayList<ICurrency>();

	public void setContainer(List<ICurrency> Container) {
		this.container = Container;
	}

	public List<ICurrency> getContainer() {
		return container;
	}

	public enum Moedas implements ICurrency {
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

		Moedas(String label, int value) {
			this.label = label;
			this.value = value;
		}

		@Override
		public String getLabel() {
			return label;
		}

		@Override
		public int getValue() {
			return value;
		}
	}

	public enum Notas implements ICurrency {
		QUINHENTOS("500e", 50000), DUZENTOSE("200e", 20000), CEME("100e", 10000), CINQUENTAE(
				"50e", 5000), VINTEE("20e", 2000), DEZE("10e", 1000), CINCOE(
				"5e", 500);

		public final String label;
		public final int value;

		public static Notas find(String label) {
			for (Notas m : Notas.values()) {
				if (m.label.equals(label)) {
					return m;
				}
			}
			return null;
		}

		Notas(String label, int value) {
			this.label = label;
			this.value = value;
		}

		@Override
		public String getLabel() {
			return label;
		}

		@Override
		public int getValue() {
			return value;
		}
	}

	public ICurrency findAndAdd(int value) {
		int valueToAdd = 0;
		ArrayList<ICurrency> allValues = new ArrayList<ICurrency>();
		while (value != 0) {
			for (Notas m : Notas.values()) {
				if (m.value <= value) {
					System.out.print("to add " + m.value + "\n");
					valueToAdd = m.value;
					value = value - valueToAdd;
					this.container.add(m);
					break;
				}
			}
			for (Moedas m : Moedas.values()) {
				if (m.value <= value) {
					System.out.print("to add " + m.value + "\n");
					valueToAdd = m.value;
					value = value - valueToAdd;
					this.container.add(m);
					break;
				}
			}
		}
		System.out.print(allValues);
		return null;
	}

}
