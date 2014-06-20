package WalletEnum;

import java.util.ArrayList;
import WalletEnum.WalletContainerEnum.Notas;

public class DescribeNotasEnum implements CallMethodEnum {

	@Override
	public void execute(String[] cmd, WalletContainerEnum cont) {

		ArrayList<Integer> totalList = cont.container;
		
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

