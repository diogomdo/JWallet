package pt.diogo.jwallet;

import java.util.List;
import pt.diogo.jwallet.WalletContainer;
import pt.diogo.jwallet.WalletContainer.Moedas;

public class DescribeMoedas implements CallMethod {

	@Override
	public void execute(String[] cmd, WalletContainer cont) {

		List<ICurrency> totalList = cont.container;

		for (Moedas m : Moedas.values()) {
			Integer i = 0;
			if (totalList.contains(m.value)) {
				for (ICurrency value : totalList) {
					if (m.value == value.getValue()) {
						i++;
					}
				}
				System.out.print(i + "x" + m.label + "\n");
			}
		}
	}
}
