package pt.diogo.jwallet;

import java.util.List;
import pt.diogo.jwallet.WalletContainer.Notas;

public class DescribeNotas implements CallMethod {

	@Override
	public void execute(String[] cmd, WalletContainer cont) {

		List<ICurrency> totalList = cont.container;

		for (Notas m : Notas.values()) {
			Integer i = 0;
			if (totalList.contains(m)) {
				for (ICurrency value : totalList) {
					if (m == value) {
						i++;
					}
				}
				System.out.print(i + "x" + m.label + "\n");
			}
		}
	}
}
