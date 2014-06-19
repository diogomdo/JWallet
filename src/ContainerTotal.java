import java.util.ArrayList;


public class ContainerTotal implements CallMethod{

	@Override
	public void execute(String[] cmd) {
		
		System.out.print("Total Op\n");
		
		WalletContainer cont = new WalletContainer();
		ArrayList<Integer> totalList = cont.Container;
		Integer total = null;
		System.out.print(cont);
		System.out.print("");
		System.out.print(totalList);
		for (Integer value:totalList){
			total += value;
		}
		
		System.out.print("total: "+total);
	}

}
