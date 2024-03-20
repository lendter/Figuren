package form;

public class Rechteck extends Form{
    private double breite;



    private double laenge;

    public Rechteck(double breite, double laenge) {
        this.breite = breite;
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    @Override
    public double umfang() {
        return this.breite*2 + this.laenge*2;
    }

    @Override
    public double flaeche() {
        return this.getBreite()*this.getLaenge();
    }


}
