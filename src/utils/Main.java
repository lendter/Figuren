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
		Creat�r creator = new Creat�r(scan);
		System.out.println("Das ber�hren der Fig�ren mit den Pfoten ist verboten!");
		try {
			int input;
			do {
				System.out.println("Hauptmen�:");
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