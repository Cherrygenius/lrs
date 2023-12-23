package lr6;

public class Example1 {
    private char symbol;
    private String text;

    public void setValue(char symbol) {
        this.symbol = symbol;
    }

    public void setValue(String text) {
        this.text = text;
    }

    public void setValue(char[] charArray){
        if (charArray.length == 1){
            symbol = charArray[0];
        }else {
            text = new String(charArray);
        }
    }

    public void displayValues(){
        System.out.println(symbol);
        System.out.println(text);
    }
}
