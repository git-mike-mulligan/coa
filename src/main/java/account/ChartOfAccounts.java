package account;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.opencsv.CSVParser;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class ChartOfAccounts {
	
	private Map<String,Account> coa = new HashMap<String,Account>();
	private String fileName;
	
	public ChartOfAccounts(String fileName) throws FileNotFoundException, IOException {
		super();
		this.fileName = fileName;
		
		Path path = Paths.get(this.getFileName());

		if (Files.exists(path)) {
			
			CSVReader reader = null;
			
			try {
				
				reader = new CSVReaderBuilder(new FileReader(this.getFileName())).withSkipLines(1).build();
				
				String[] line;
				
				while ( ( line = reader.readNext() ) != null ) {
				
					Account account = new Account( line[0], line[1], line[2], line[3] );
					
					//System.out.println(account.toString());
					
					coa.put(account.getAccountNumber(), account);
				}
				
			}
			catch (IOException e) {
				throw e;
			}

		}
		else {
			throw new FileNotFoundException("File not found: " + this.getFileName());
		}
	}

	/**
	 * @return the coa
	 */
	public Map<String, Account> getCoa() {
		return coa;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		Set<String> keys = coa.keySet();
		TreeSet<String> sortedKeys = new TreeSet<>(keys);
		
		builder.append("Chart Of Accounts\n");
		
		for (String key : sortedKeys )
			builder.append( coa.get( key ).toString() + "\n" );
		
		return builder.toString();
	}

	
	
	
	
}
