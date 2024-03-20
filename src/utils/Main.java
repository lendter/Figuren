package utils;

import figur.EFigur;
import figur.Figur;
import figur.FigurFactory;
import form.EForm;
import form.Form;

public class Main {

    public static void main(String[] args) {
        try {
            for (EForm eForm: EForm.values()) {
                Form form = FormFactory.createForm(eForm);
                System.out.println("FORM: "+eForm);
                System.out.println("UMFANG: "+Math.round(form.umfang()));
                System.out.println("FLAECHE: "+Math.round(form.flaeche()));
                System.out.println();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            for (EFigur eFigur: EFigur.values()) {
                Figur figur = FigurFactory.createFigur(eFigur);
                System.out.println("FIGUR: "+eFigur);
                System.out.println("VOLUMEN: "+Math.round(figur.volumen()));
                System.out.println("OBERFLAECHE: "+Math.round(figur.oberflaeche()));
                System.out.println();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
}