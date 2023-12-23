package lr5;

public class Example1 {
    private char symbol;
    public void setSymbol(char s){
        symbol = s;
    }
    public int getSymbolCode(){
        return (int) symbol;
    }
    public void  printSymbolAndCode(){
        System.out.println(symbol);
        System.out.println((int) symbol);
    }
}
