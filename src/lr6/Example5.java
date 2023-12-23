package lr6;

public class Example5 {
    public static void powSum(int number){
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += Math.pow(i,2);
        }
        System.out.println(sum);
    }
}
