import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;


public class DescribeNotas implements CallMethod {

	@Override
	public void execute(String[] cmd, WalletContainer cont) {
		
		ArrayList<Integer> totalList = cont.Container;
		Map<String, Integer> notas = cont.getNotasDefault();
		
		for (Entry<String, Integer> entry : notas.entrySet()){
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
