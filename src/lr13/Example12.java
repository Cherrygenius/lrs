package lr13;

public class Example12 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("������ �������= " + l);

            int h = 10 / l;
            args[l + 1] = "10";
        } catch (ArithmeticException e) {
            System.out.println("������� �� ����");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("������ �� ����������");
        }
    }

}