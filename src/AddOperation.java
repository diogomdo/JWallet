import java.util.*;


public class AddOperation implements CallMethod{

	@Override
	public void execute(String[] cmd) {
		//System.out.print(cmd[2]);
		
		//http://stackoverflow.com/a/8722886
		WalletContainer cont = new WalletContainer();
		Map<String, Integer> moedas = cont.getMoedasDefault();
		Map<String, Integer> notas = cont.getMoedasDefault();
		
		
		for (String value:cmd){
			if(moedas.containsKey(value) == true){
				System.out.print("Moeda: "+ value);
				cont.Container.add(moedas.get(value));
				
			}else if(notas.containsKey(value) == true){
				System.out.print("Notas: "+ value);
				cont.Container.add(notas.get(value));
			}else{
				System.out.print("Invalid value: " + value);
			}
		}
		
		//System.out.print(cont.Container);
		
	}
}
