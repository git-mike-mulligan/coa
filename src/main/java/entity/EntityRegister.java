package entity;

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

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import entity.Entity;

public class EntityRegister {

	private Map<String,Entity> register = new HashMap<String,Entity>();
	private String fileName;
	
	public EntityRegister(String fileName) throws FileNotFoundException, IOException {
		super();
		this.fileName = fileName;
		
		Path path = Paths.get(this.getFileName());

		if (Files.exists(path)) {
			
			CSVReader reader = null;
			
			try {
				
				reader = new CSVReaderBuilder(new FileReader(this.getFileName())).withSkipLines(1).build();
				
				String[] line;
				
				while ( ( line = reader.readNext() ) != null ) {
				
					Entity entity = new Entity( line[0], line[1], line[2] );
					
					//System.out.println(account.toString());
					
					register.put(entity.getId(), entity);
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

	public Map<String, Entity> getRegister() {
		return register;
	}

	public void setRegister(Map<String, Entity> register) {
		this.register = register;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		Set<String> keys = register.keySet();
		TreeSet<String> sortedKeys = new TreeSet<>(keys);
		
		builder.append("Entity Register\n");
		builder.append("Source file: " + this.getFileName() +"\n" );
		
		for (String key : sortedKeys )
			builder.append( register.get( key ).toString() + "\n" );
		
		return builder.toString();
	}
	
}
