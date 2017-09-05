import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import account.ChartOfAccounts;
import entity.EntityRegister;

public class App {

	public static void main(String[] args) {
				
		String coaFileName = "data/coa.csv";
		String entiyFilename = "data/entity.csv";
		
		ChartOfAccounts coa = null;
		EntityRegister entityRegister = null;
		
		try {
			coa = new ChartOfAccounts(coaFileName);
			
			entityRegister = new EntityRegister(entiyFilename);
			
			System.out.printf( "%n%s%n", coa.toString() );
			System.out.printf( "%n%s%n", entityRegister.toString() );
			
			/*
			 * StringBuilder builder = new StringBuilder();
			
			Set<String> keys = coa.getCoa().keySet();
			TreeSet<String> sortedKeys = new TreeSet<>(keys);
			
			builder.append("Chart Of Accounts\n");
			
			for (String key : sortedKeys ) {
				builder.append( coa.getCoa().get( key ).toString() + "\n" );
			}
			
			System.out.printf( "%s", builder.toString() );
			*/
				
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
