package utils;
import java.util.Map;
import java.util.Scanner;

import csv.CSVReader;
import form.EForm;

public class Main {

	private static Scanner scan = new Scanner(System.in);
	
	private static Map<String, Double> fuellung;
	private static Map<String, Double> oberflaeche;
	
	public static void main(String[] args) {
		CSVReader reader = new CSVReader();
		Creatür creator = new Creatür(scan);
		System.out.println("Das berühren der Figüren mit den Pfoten ist verboten!");
		try {
			int input;
			do {
				System.out.println("Hauptmenü:");
				System.out.println("[1] Form erstellen [2] Figur erstellen [3] CSV einlesen [0] Exit");
				input = scan.nextInt();
				switch (input) {
				case 1:
					creator.formErstellen(EForm.values());
					break;
				case 2:
					creator.figurErstellen();
					break;
				case 3:
					csvEinlesen(reader);
					break;
				}

			}while(input != 0);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private static void csvEinlesen(CSVReader reader) {
		System.out.println("[1] Füllung [2] Oberfläche");
		var input = scan.nextInt();
		switch(input) {
		case 1:
			System.out.println("Pfad:");
			var path = scan.next();
			fuellung = reader.readData(path);
			print(fuellung);
			break;
		case 2:
			System.out.println("Pfad:");
			var path1 = scan.next();
			oberflaeche = reader.readData(path1);
			print(oberflaeche);
			break;
		}
	}
	
	private static void print(Map<String, Double> map) {
		for(String key: map.keySet()){
			System.out.println(key + " kostet "+ map.get(key));
		}
	}
}