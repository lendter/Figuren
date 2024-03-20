package figur;

import form.Form;

public abstract class Figur<F extends Form> {
	private F form;
	
	protected Figur(F form){
		this.form = form;
	}
	
	public abstract double volumen();
	
	public abstract double oberflaeche();

	public F getForm() {
		return form;
	}

	public void setForm(F form) {
		this.form = form;
	}
	
	
}