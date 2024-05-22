package utils;

import java.util.Scanner;

import figur.EFigur;
import figur.Figur;
import figur.FigurFactory;
import form.EForm;
import form.Form;

public class Creat�r {
	private Scanner scan;
	
	public Creat�r(Scanner scan) {
		this.scan = scan;
	}
	
	public Form formErstellen(EForm[] forms) {
		System.out.println("Formen erstellen: \n W�hle aus Formen:");
		try {
			for (EForm eForm : forms) {
				System.out.println("[" + eForm.number + "]" + " " + eForm.name());
			}
			var in = scan.nextInt();
			EForm input = EForm.valueOfNumber(in);
			Form form = FormFactory.createForm(input, scan, this);
			System.out.println("FORM: " + input);
			System.out.println("FL�CHE: " + Math.round(form.flaeche()));
			System.out.println("UMFANG: " + Math.round(form.umfang()));
			System.out.println();
			return form;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Figur<?>  figurErstellen() {
		System.out.println("Figuren erstellen: \n W�hle aus Figuren:");
		try {
			for (EFigur eFigur : EFigur.values()) {
				System.out.println("[" + eFigur.number + "]" + " " + eFigur.name());
			}
			EFigur input = EFigur.valueOfNumber(scan.nextInt());
			Figur<?> figur = FigurFactory.createFigur(input, scan, this);
			System.out.println("FIGUR: " + input);
			System.out.println("VOLUMEN: " + figur.volumen());
			System.out.println("OBERFL�CHE: " + figur.oberflaeche());
			System.out.println("");
			return figur;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
