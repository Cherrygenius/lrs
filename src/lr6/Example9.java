package lr6;

public class Example9 {
    public static char[] swapPosition(char[] chars) {
        char[] swappedArray = new char[chars.length];
        int increment = 0;
        for (char x : chars) {
            swappedArray[chars.length - increment - 1] = x;
            increment++;
        }
        return swappedArray;
    }
}
