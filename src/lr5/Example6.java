package lr5;

public class Example6 {
    private int min;
    private int max;

    public Example6(int number1, int number2){
        setMinMax(number1,number2);
    }

    public void setMinMax(int number1, int number2){
        if (number1 >= number2){
            max = number1;
            min = number2;
        }else {
            max = number2;
            min = number1;
        }
    }
    public void printValues(){
        System.out.println(max);
        System.out.println(min);
    }
}
