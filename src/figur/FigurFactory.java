package figur;

import java.util.Scanner;

import form.EForm;
import form.Form;
import form.Kreis;
import form.Vieleck;
import utils.Creatür;
import utils.FormFactory;

public class FigurFactory {
	
	
	public static Figur<?> createFigur(EFigur figur, Scanner scanner, Creatür creator) throws Exception {
		switch(figur) {
			case GeradeKegel:
				Kreis kreis = (Kreis)creator.formErstellen(new EForm[] {EForm.KREIS});
				System.out.print("Hoehe des Kegels: ");
				double kegelHoehe = scanner.nextDouble();
				return new GeradeKegel<>(kreis, kegelHoehe);
			case Pyramide:
				Form form = creator.formErstellen(EForm.values());
				System.out.print("Hoehe der Pyramide: ");
				double hoehe = scanner.nextDouble();
				return new Pyramide<>(form, hoehe);
			case GeradePyramide:
				Vieleck vieleck = (Vieleck)creator.formErstellen(new EForm[] {EForm.VIELECK});
				System.out.print("Hoehe der geraden Pyramide: ");
				double gPyraHoehe = scanner.nextDouble();
				return new GeradePyramide<>(vieleck, gPyraHoehe);
			case GeradesPrisma:
				Form grundflaeche = creator.formErstellen(EForm.values());
				System.out.print("Hoehe des geraden Prismas: ");
				double prismaHoehe = scanner.nextDouble();
				return new GeradesPrisma<>(grundflaeche, prismaHoehe);
			case Kugel:
				System.out.print("Radius der Kugel: ");
				double[] kugelData = {scanner.nextDouble()};
				return new Kugel<>(FormFactory.createForm(EForm.KREIS, kugelData));
			default:
				return null;
			}
	}
}
