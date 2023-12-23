package lr5;

public class Example5 {
    private int number;

    public Example5(){
        number = 0;
    }

    public Example5(int number){
        setNumber(number);
    }

    public void setNumber(int number){
        if(number > 100){
            this.number = 100;
        }else {
            this.number = number;
        }
    }

    public int getNumber() {
        return number;
    }
}

