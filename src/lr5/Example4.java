package lr5;

public class Example4 {
    private final char symbol;
    private final int number;

    public Example4(int number, char symbol){
        this.number = number;
        this.symbol = symbol;
    }
    public Example4(double value){
        int symbolCode = (int) value;
        this.symbol = (char) symbolCode;
        double decimalPart = value - symbolCode;
        this.number = (int) (decimalPart*100);
    }
    public void printFields(){
        System.out.println(symbol);
        System.out.println(number);
    }
}
