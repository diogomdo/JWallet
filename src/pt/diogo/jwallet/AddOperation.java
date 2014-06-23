package pt.diogo.jwallet;


import pt.diogo.jwallet.WalletContainer.Moedas;
import pt.diogo.jwallet.WalletContainer.Notas;

public class AddOperation implements CallMethod {

	@Override
	public void execute(String[] cmd, WalletContainer cont) {

		for (String value : cmd) {
			if (Moedas.find(value) != null) {
				cont.container.add(Moedas.find(value).value);
				System.out.print("Moeda: " + value + " added\n");
			}else if(Notas.find(value)!= null){
				cont.container.add(Notas.find(value).value);
				System.out.print("Nota: " + value + " added\n");
			}else{
				System.out.print("Ortodox values\n");
				Utils Opp = new Utils();
				System.out.print("to decomopose: "+value+"\n");
				//Opp.deconstruct(value);
				if (cont.findAndAdd(Opp.deconstruct(value)) != null){
					System.out.print(cont.findAndAdd(Opp.deconstruct(value)));
					System.out.print("\n");
				}
			}
		}
	}
}
