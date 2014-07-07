package pt.diogo.jwallet;

import java.io.IOException;

public interface CallMethod {

	public void execute(String[] cmd, WalletContainer cont) throws IOException;

}
