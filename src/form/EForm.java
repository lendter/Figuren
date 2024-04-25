package form;

import java.util.HashMap;
import java.util.Map;

public enum EForm {
    DREIECK(1),KREIS(2),RECHTECK(3),VIELECK(4);

	public final int number;
	
	public static final Map<Integer, EForm> BY_NUMBER = new HashMap<>();
	
	static {
        for (EForm e : values()) {
            BY_NUMBER.put(e.number, e);
        }
    }
	
	EForm(int i) {
		number = i;
	}
	
	public static EForm valueOfNumber(int number) {
		return BY_NUMBER.get(number);
	}
}
