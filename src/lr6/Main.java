package lr6;

import java.util.Arrays;

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


        System.out.println("Example7");
        char[] input = {'a' , 'b', 'c'};
        int[] codes = Example7.getCharacterCode(input);
        System.out.println(Arrays.toString(codes));


        System.out.println("Example8");
        int[] array = {1,2,3,4};
        System.out.println(Example8.arrayAverage(array));


        System.out.println("Example9");
        char[] charsArray = {'a','b','c','d','2','3','5'};
        System.out.println(Example9.swapPosition(charsArray));


        System.out.println("Example10");
        int[] numbers_1 = {1,2,4,5,6,7};
        System.out.println(Arrays.toString(Example10.findMinMax(numbers_1)));
    }
}
