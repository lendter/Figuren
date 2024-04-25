package utils;

import java.util.Scanner;

import figur.EFigur;
import figur.Figur;
import figur.FigurFactory;
import form.EForm;
import form.Form;

public class Main {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Creatür creator = new Creatür(scan);
		System.out.println("Das berühren der Figüren mit den Pfoten ist verboten!");
		try {
			int input;
			do {
				System.out.println("Hauptmenü:");
				System.out.println("[1] Form erstellen [2] Figur erstellen [3] Exit");
				input = scan.nextInt();
				switch (input) {
				case 1:
					creator.formErstellen(EForm.values());
					break;
				case 2:
					creator.figurErstellen();
					break;
				}

			}while(input != 3);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}