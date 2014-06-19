import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;


public class DescribeMoedas implements CallMethod{

	@Override
	public void execute(String[] cmd, WalletContainer cont) {
			
		ArrayList<Integer> totalList = cont.Container;
		Map<String, Integer> moedas = cont.getMoedasDefault();
		
		for (Entry<String, Integer> entry : moedas.entrySet()){
			Integer i = 0;
			if(totalList.contains(entry.getValue())){
				for (Integer value:totalList){
					if(value == entry.getValue()){
						i++;
					}
				}
				System.out.print(i+"x"+entry.getKey()+"\n");
			}
		}
		
	}

}
