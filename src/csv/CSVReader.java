package csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVReader {
	
	public List<Material> readData(String filename) {
		List<Material> material = new ArrayList<Material>(); 
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
		       String line;
		       while ((line = br.readLine()) != null) {
		           String[] values = line.split(";");
		           String name = values[0];
		           double price = Double.parseDouble(values[1].replace(',', '.'));
		           material.add(new Material(name, price));
		       }
		   } catch (IOException e) {
		       e.printStackTrace();
		   }
		return material;
	}
}
