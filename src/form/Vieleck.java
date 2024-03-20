package form;

public class Vieleck extends Form{
    private Kreis inkreis;
    private Kreis umkreis;
    private int nEck;

    public Vieleck(Kreis umkreis, Kreis inkreis, int nEck) {
        this.umkreis = umkreis;
        this.inkreis = inkreis;
        this.nEck = nEck;
    }

    @Override
    public double umfang() {
        return inkreis.umfang();
    }

    @Override
    public double flaeche() {
        Dreieck dreieck = null;
        try {
            dreieck = new Dreieck(umkreis.getRadius(), umkreis.getRadius(), inkreis.umfang()/getNeckickgeit());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return dreieck.flaeche()*getNeckickgeit();
    }

    public Kreis getInkreis() {
        return inkreis;
    }

    public void setInkreis(Kreis inkreis) {
        this.inkreis = inkreis;
    }

    public Kreis getUmkreis() {
        return umkreis;
    }

    public void setUmkreis(Kreis umkreis) {
        this.umkreis = umkreis;
    }

    public int getNeckickgeit() {
        return nEck;
    }

    public void setNeckigkeit(int nEck) {
        this.nEck = nEck;
    }
}
