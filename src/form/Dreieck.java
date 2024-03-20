package form;

public class Dreieck extends Form{
    private double seiteA;
    private double seiteB;
    private double seiteC;

    public Dreieck(double seiteA, double seiteB, double seiteC) throws Exception {
        if(checkIfTriangleIsValid(seiteA, seiteB,seiteC)){
            this.setSeiteA(seiteA);
            this.setSeiteB(seiteB);
            this.setSeiteC(seiteC);
        }else {
            throw new Exception("Nicht erzeugbares Dreieck: Invalide Seiten");
        }
    }
    public static boolean checkIfTriangleIsValid (double seiteA, double seiteB, double seiteC) {
        if ((seiteA + seiteB) > seiteC || (seiteA + seiteC) > seiteB || (seiteB + seiteC) > seiteA) {
            return true;
        }
        return false;
    }
    public double getSeiteC() {
        return seiteC;
    }

    public void setSeiteC(double seiteC) {
        this.seiteC = seiteC;
    }


    public double getSeiteB() {
        return seiteB;
    }

    public void setSeiteB(double seiteB) {
        this.seiteB = seiteB;
    }


    public double getSeiteA() {
        return seiteA;
    }

    public void setSeiteA(double seiteA) {
        this.seiteA = seiteA;
    }


    private double getS(){
         return umfang() / 2;
    }

    @Override
    public double umfang() {
        return this.getSeiteA() + this.getSeiteB() +this.getSeiteC();
    }

    @Override
    public double flaeche() {
        double s = getS();
        return Math.sqrt(s * (getDiff(s , seiteA)) * (getDiff(s, seiteB)) * (getDiff(s, seiteC)));
    }

    private double getDiff(double s, double seite){
        return Math.abs(s - seite);
    }
}
