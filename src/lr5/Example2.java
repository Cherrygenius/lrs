package lr5;

public class Example2 {
    private char startSymbol;
    private char endSymbol;
    public void setStartSymbol(char start){
        startSymbol = start;
    }
    public void setEndSymbol(char end){
        endSymbol = end;
    }
    public void printSymbolRange(){
        for (char symbol = startSymbol; symbol <= endSymbol;symbol++){
            System.out.println(symbol + " ");
        }
        System.out.println();
    }
}
