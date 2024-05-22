package figur;

import form.Kreis;

public class Kugel<F extends Kreis> extends Figur<F>{
	
	public Kugel(F kreis) {
		super(kreis);
	}

	@Override
	public double volumen() {
		return Math.round((4.0 / 3.0) * Math.PI * Math.pow(getForm().getRadius(), 3));
	}

	@Override
	public double oberflaeche() {
		return Math.round(4 * Math.PI * Math.pow(getForm().getRadius(), 2));
	}
	
	@Override
	public String toCsvString() {
		return "Kugel;"+volumen()+";"+oberflaeche()+";";
	}
}
