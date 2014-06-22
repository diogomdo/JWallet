package pt.diogo.jwallet;

import java.util.HashSet;
import java.util.Set;

public class WalletContainerEnum {
	
	//http://stackoverflow.com/a/13821728
	Set<Integer> container = new HashSet<Integer>();
	
	public enum Moedas{
		UMC("1c",1), DOISC("2c", 2), CINCOC("5c",5), DEZC("10c", 10),
		VITNEC("20c",20), CINQUENTAC("50c", 50),UME("1e",100), DOISE("2e", 200);
		
		public final String label;
		public final int value;
		
		// Porque 'Moedas" ao nomear o metodo?
		public static Moedas find(String label){
			for(Moedas m:Moedas.values()){
				if(m.label.equals(label)){
					return m;
				}
			}
			// Porque este null?
			return null;
		}
		
		// Nao percebi ser invocado so por 'Moedas(...'
		Moedas(String label, int value){
			this.label = label;
			this.value = value;
		}	
	}
	
	public enum Notas{
		CINCOE("5e",500), DEZE("10e", 1000), VINTEE("20e",2000), CINQUENTAE("50e", 5000),
		CEME("100e",10000), DUZENTOSE("200e", 20000),QUINHENTOS("500e",50000);
		
		public final String label;
		public final int value;
		
		// Porque 'Moedas" ao nomear o metodo?
		public static Notas find(String label){
			for(Notas m:Notas.values()){
				if(m.label.equals(label)){
					return m;
				}
			}
			// Porque este null?
			return null;
		}
		
		// Nao percebi ser invocado so por 'Moedas(...'
		Notas(String label, int value){
			this.label = label;
			this.value = value;
		}	
	}
	
	public void setContainer(Set<Integer> Container) {
		this.container = Container;
	}

	public Set<Integer> getContainer() {
		return container;
	}
}
