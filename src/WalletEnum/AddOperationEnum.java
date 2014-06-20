package WalletEnum;

import WalletEnum.WalletContainerEnum.Moedas;
import WalletEnum.WalletContainerEnum.Notas;

public class AddOperationEnum implements CallMethodEnum {

	@Override
	public void execute(String[] cmd, WalletContainerEnum cont) {

		for (String value : cmd) {
			if (Moedas.find(value) != null) {
				cont.container.add(Moedas.find(value).value);
				System.out.print("Moeda: " + value + " added\n");
			}else if(Notas.find(value)!= null){
				cont.container.add(Notas.find(value).value);
				System.out.print("Nota: " + value + " added\n");
			}
		}
	}
}
