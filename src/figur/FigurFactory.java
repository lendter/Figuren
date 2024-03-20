package figur;

import form.Dreieck;
import form.EForm;
import form.Kreis;
import form.Rechteck;
import form.Vieleck;
import utils.FormFactory;

public class FigurFactory {
	
	public static Figur createFigur(EFigur figur) throws Exception {
		switch(figur) {
		case GeradeKegel:
			return new GeradeKegel<Kreis>((Kreis) FormFactory.createForm(EForm.KREIS), 4);
		case Pyramide:
			return new Pyramide<Dreieck>((Dreieck)FormFactory.createForm(EForm.DREIECK), 4);
		case GeradePyramide:
			return new GeradePyramide<Vieleck>((Vieleck) FormFactory.createForm(EForm.VIELECK), 49);
		case GeradesPrisma:
			return new GeradesPrisma<Rechteck>((Rechteck)FormFactory.createForm(EForm.RECHTECK), 4);
		case Kugel:
			return new Kugel<Kreis>((Kreis) FormFactory.createForm(EForm.KREIS));
		default:
			return null;
		}
	}
}
