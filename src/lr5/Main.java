package lr5;

public class Main {
    public static void main(String[] args){
        System.out.println("Example1");

        Example1 symbol = new Example1();
        symbol.setSymbol('A');
        int code = symbol.getSymbolCode();
        symbol.printSymbolAndCode();

        System.out.println("Example2");

        Example2 symbolRange = new Example2();
        symbolRange.setStartSymbol('A');
        symbolRange.setEndSymbol('D');
        symbolRange.printSymbolRange();

        System.out.println("Example3");

        Example3 obj1 = new Example3();
        obj1.printNumbers();
        Example3 obj2 = new Example3(10);
        obj2.printNumbers();
        Example3 obj3 = new Example3(20, 30);
        obj3.printNumbers();

        System.out.println("Example4");

        Example4 example4_1 = new Example4(65, 'A');
        example4_1.printFields();
        Example4 example4_2 = new Example4(65.1267);
        example4_2.printFields();

        System.out.println("Example5");

        Example5 example5_1 = new Example5();
        System.out.println(example5_1.getNumber());
        Example5 example5_2 = new Example5(50);
        System.out.println(example5_2.getNumber());
        Example5 example5_3 = new Example5(150);
        System.out.println(example5_3.getNumber());

        System.out.println("Example6");

        Example6 example6_1 = new Example6(10,5);
        example6_1.printValues();
        Example6 example6_2 = new Example6(3,8);
        example6_2.printValues();
        Example6 example6_3 = new Example6(7,7);
        example6_3.printValues();
    }
}
