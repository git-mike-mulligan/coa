import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import account.Account;
import account.ChartOfAccounts;
// test
public class App {

	public static void main(String[] args) {
				
		String coaFileName = "data/coa.csv";
		
		ChartOfAccounts coa = null;
		
		try {
			coa = new ChartOfAccounts(coaFileName);
			
			//System.out.printf( "%s", coa.toString() );
			
			StringBuilder builder = new StringBuilder();
			
			Set<String> keys = coa.getCoa().keySet();
			TreeSet<String> sortedKeys = new TreeSet<>(keys);
			
			builder.append("Chart Of Accounts\n");
			
			for (String key : sortedKeys ) {
				builder.append( coa.getCoa().get( key ).toString() + "\n" );
			}
			
			System.out.printf( "%s", builder.toString() );
				
		} 
		catch (FileNotFoundException e) {
			System.out.printf("FileNotFoundException: %s", e.getMessage());
			
			//e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.printf("IOException: %s", e.getMessage());
			
			//e.printStackTrace();
		} 	
	}
}
