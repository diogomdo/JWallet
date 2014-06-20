import java.util.ArrayList;

import WalletEnum.WalletContainerEnum;

public class ContainerTotal implements CallMethod {

	@Override
	public void execute(String[] cmd, WalletContainer cont) {

		System.out.print("Total Op\n");

		ArrayList<Integer> totalList = cont.container;
		Integer total = 0;

		for (Integer value : totalList) {
			total = total + value;
		}

		System.out.print("total: " + (float) total / 100 + "e");
	}

}
