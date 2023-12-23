package lr6;

public class Example4 {
    public static void doubleFactorial(int number){
        int result = 1;
        for (int i = number; i >= 1; i-= 2) {
            result*= i;
        }
        System.out.println(result);;
    }
}
