package figur;

import form.Form;

public class Pyramide<F extends Form> extends Figur<F>{
	private double hoehe;
	
	public Pyramide(F form, double hoehe) {
		super(form);
		setHoehe(hoehe);
	}

	@Override
	public double volumen() {
		return Math.round(getForm().flaeche() * hoehe / 3);
	}

	public double mantelflaeche() {
		return 0.5 * getForm().umfang() * getHoehe();
	}
	
	public double getHoehe() {
		return hoehe;
	}
	
	public double oberflaeche() {
		return Math.round(mantelflaeche() + getForm().flaeche());
	}

	private void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}
	
	@Override
	public String toCsvString() {
		return "Pyramide;"+volumen()+";"+oberflaeche()+";";
	}
}
