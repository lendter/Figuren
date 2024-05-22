package preise;

import java.text.DecimalFormat;

public class Kosten {
	private double fuellung;
	private double oberflaeche;
	private DecimalFormat f = new DecimalFormat("#0.00");
	

	public Kosten(double fuellung, double oberflaeche) {
		setFuellung(fuellung);
		setOberflaeche(oberflaeche);
	}

	public double getFuellung() {
		return fuellung;
	}

	public void setFuellung(double fuellung) {
		this.fuellung = fuellung;
	}

	public double getOberflaeche() {
		return oberflaeche;
	}

	public void setOberflaeche(double oberflaeche) {
		this.oberflaeche = oberflaeche;
	}

	public double gesamtkosten() {
		return fuellung + oberflaeche;
	}

	public String toCsvString() {
		return f.format(fuellung) + "€;" + f.format(oberflaeche) + "€;" + f.format(gesamtkosten())+"€";
	}
}
