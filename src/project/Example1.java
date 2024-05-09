package project;

import java.util.HashMap;

public class Example1 {

    public class Main {
        public static void main(String[] args) {
            // �������� ������� HashMap
            HashMap<String, Integer> hashMap = new HashMap<>();

            // ���������� ���������
            hashMap.put("apple", 10);
            hashMap.put("banana", 20);
            hashMap.put("orange", 30);

            // ��������� �������� �� �����
            int value = hashMap.get("apple");
            System.out.println("Value for key 'apple': " + value);

            // �������� ��������
            hashMap.remove("banana");

            // �������� ������� �����
            boolean containsKey = hashMap.containsKey("banana");
            System.out.println("Contains key 'banana': " + containsKey);
        }
    }
}
