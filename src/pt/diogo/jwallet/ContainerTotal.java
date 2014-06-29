package pt.diogo.jwallet;

import java.util.List;

import pt.diogo.jwallet.WalletContainer;

public class ContainerTotal implements CallMethod {

	@Override
	public void execute(String[] cmd, WalletContainer cont) {

		System.out.print("Total Operation\n");

		List<ICurrency> totalList = cont.container;
		Integer total = 0;

		for (ICurrency value : totalList) {
			total = value.getValue() + total;
		}

		System.out.print("total: " + (float) total / 100 + "e");
	}

}
