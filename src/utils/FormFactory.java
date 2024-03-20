package utils;

import form.*;

public class FormFactory {
    public static <F extends Form> F createForm(EForm form) throws Exception {
        return switch (form) {
            case KREIS ->
                    (F) new Kreis(5);
            case DREIECK ->
                    (F)new Dreieck(4, 3, 5);
            case VIELECK ->
                    (F)new Vieleck(new Kreis(5), new Kreis(4), 4);
            case RECHTECK ->
                    (F)new Rechteck(10, 5);
        };
    }

}
