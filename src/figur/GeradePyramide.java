package figur;

import form.Vieleck;

public class GeradePyramide<F extends Vieleck> extends Pyramide<Vieleck>{
	
	public GeradePyramide(F form, double hoehe) {
		super(form, hoehe);
	}

	@Override
	public double mantelflaeche() {
		double rAK = getForm().getUmkreis().getRadius();
		double s = Math.sqrt(Math.pow(getHoehe(), 2) + Math.pow(rAK, 2));
		double a = (getForm().umfang()/getForm().getNeckickgeit());
		return getForm().getNeckickgeit() * 0.5 * a * s;
	}
	
	@Override
	public String toCsvString() {
		return "GeradePyramide;"+volumen()+";"+oberflaeche()+";";
	}
}
