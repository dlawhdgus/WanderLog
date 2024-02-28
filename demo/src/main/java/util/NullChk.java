package util;

// Null Check Function
public class NullChk {
	public static boolean isEmpty(String str) {
		return str == null || str.isEmpty() || str.isBlank();
		// true is null
	}
}
