package pt.diogo.jwallet;


import pt.diogo.jwallet.WalletContainerEnum.Moedas;
import pt.diogo.jwallet.WalletContainerEnum.Notas;

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
			}else{
				System.out.print("Ortodox values\n");
				UtilsEnum Opp = new UtilsEnum();
				System.out.print(value+"\n");
				//Opp.deconstruct(value);
				if (cont.findAndAdd(Opp.deconstruct(value)) != null){
					System.out.print(cont.findAndAdd(Opp.deconstruct(value)));
				}
			}
		}
	}
}
