package lr6;

import java.util.Arrays;

public class Example7 {
    public static int[] getCharacterCode(char[] chars) {
        int[] codes = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            codes[i] = chars[i];
        }
        return codes;
    }
}
