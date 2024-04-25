package figur;

import java.util.HashMap;
import java.util.Map;

public enum EFigur {
	GeradeKegel(1), Pyramide(2), GeradePyramide(3), GeradesPrisma(4), Kugel(5);

	private static final Map<Integer, EFigur> BY_NUMBER = new HashMap<>();
    
	static {
        for (EFigur e : values()) {
            BY_NUMBER.put(e.number, e);
        }
    }
	
	public final int number;
	
	EFigur(int i) {
		number = i;
	}
	
	public static EFigur valueOfNumber(int number) {
        return BY_NUMBER.get(number);
    }
}
