package lr5;

public class Example3 {
    private int number1;
    private int number2;

    public Example3(){

    }
    public Example3(int number){
        number1 = number;
    }
    public Example3 (int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    public void printNumbers(){
        System.out.println(number1);
        System.out.println(number2);
    }
}
