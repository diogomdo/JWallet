package pt.diogo.jwallet;

import java.util.Set;

import pt.diogo.jwallet.WalletContainer.Notas;

public class DescribeNotas implements CallMethod {

	@Override
	public void execute(String[] cmd, WalletContainer cont) {

		Set<Integer> totalList = cont.container;
		
		for (Notas m: Notas.values()){
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

