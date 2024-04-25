package csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CSVReader {
	
	public Map<String, Double> readData(String filename) {
		Map<String, Double> map = new HashMap<>(); 
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
		       String line;
		       while ((line = br.readLine()) != null) {
		           String[] values = line.split(";");
		           String name = values[0];
		           double price = Double.parseDouble(values[1].replace(',', '.'));
		           map.put(name, price);
		       }
		   } catch (IOException e) {
		       e.printStackTrace();
		   }
		return map;
	}
}
