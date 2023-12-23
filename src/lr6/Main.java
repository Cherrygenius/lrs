package lr6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Example1");
        Example1 example1_1 = new Example1();
        example1_1.setValue('A');
        example1_1.displayValues();

        example1_1.setValue("Hello");
        example1_1.displayValues();

        char[] charArray = {'T', 'e', 's', 't'};
        example1_1.setValue(charArray);
        example1_1.displayValues();


        System.out.println("Example2");
        Example2.displayAndIncrement();
        Example2.displayAndIncrement();
        Example2.displayAndIncrement();


        System.out.println("Example3");
        int[] numbers = {10, 5, 2, 1, 12, 3};

        int max = Example3.findMax(numbers);
        System.out.println(max);

        int min = Example3.findMin(numbers);
        System.out.println(min);

        double average = Example3.findAverage(numbers);
        System.out.println(average);

        System.out.println("Example4");
        Example4.doubleFactorial(6);

        System.out.println("Example5");
        Example5.powSum(3);


        System.out.println("Example6");
        int[] myArray = {1,2,3,4,5};
        System.out.println(Example6.copyArray1(myArray, 3));
    }
}
