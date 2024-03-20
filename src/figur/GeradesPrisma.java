package figur;

import form.Form;

public class GeradesPrisma<F extends Form> extends Figur<F>{
	private double hoehe;
	
	public GeradesPrisma(F form, double hoehe) {
		super(form);
		setHoehe(hoehe);
	}

	@Override
	public double volumen() {
		return getForm().flaeche() * getHoehe();
	}

	@Override
	public double oberflaeche() {
		return 2 * getForm().flaeche() + getForm().umfang() * getHoehe();
	}
	
	public double getHoehe() {
		return hoehe;
	}

	private void setHoehe(double hoehe) {
		this.hoehe = hoehe;
	}

}
