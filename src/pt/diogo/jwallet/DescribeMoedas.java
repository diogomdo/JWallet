package pt.diogo.jwallet;

import java.util.List;
import java.util.Set;

import pt.diogo.jwallet.WalletContainer;
import pt.diogo.jwallet.WalletContainer.Moedas;

public class DescribeMoedas implements CallMethod {

	@Override
	public void execute(String[] cmd, WalletContainer cont) {

		List<Integer> totalList = cont.container;
		
		for (Moedas m: Moedas.values()){
			Integer i = 0;
			if(totalList.contains(m.value)){
				for (Integer value : totalList) {
					if(m.value == value) {
						i++;
					}
				}
				System.out.print(i + "x" + m.label + "\n");
			}
		}
	}
}
