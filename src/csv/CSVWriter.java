package csv;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;

import figur.Figur;
import preise.Kosten;

public class CSVWriter {
	private Path path;
	
	public CSVWriter(Path p) {
		path = p;
	}
	
	public void writeAll(Map<Figur<?>, Kosten> figs) {
		try (BufferedWriter bw = Files.newBufferedWriter(path, StandardOpenOption.CREATE)) {
			bw.write("Figur;Volumen;Oberflaeche;Fuellung-Kosten;Oberflaeche-Kosten;Gesamtkosten");
			bw.write("\n");
			for(Figur<?> f: figs.keySet()) {
				bw.write(f.toCsvString()+ figs.get(f).toCsvString()); 
				bw.write("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
