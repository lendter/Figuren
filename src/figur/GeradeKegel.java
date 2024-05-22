package figur;

import form.Kreis;

public class GeradeKegel<F extends Kreis> extends Pyramide<F>{	
	
	public GeradeKegel(F form, double hoehe) {
		super(form, hoehe);
	}

	@Override
	public double mantelflaeche() {
		double r = getForm().getRadius();
		double s = Math.sqrt(Math.pow(r, 2) + Math.pow(getHoehe(), 2));
		return r * s * Math.PI;
	}
	
	@Override
	public String toCsvString() {
		return "GeradeKegel;"+volumen()+";"+oberflaeche()+";";
	}
}
