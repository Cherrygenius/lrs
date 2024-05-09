package project;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RedBlackTreeHashMapExample {

    public static void main(String[] args) {
        // ������� HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // ��������� �������� � HashMap
        for (int i = 0; i < 20; i++) {
            int key = new Random().nextInt(100);
            hashMap.put(key, "Value" + key);
        }

        // ������� �������� HashMap �� �������������� � ������-������ �������
        System.out.println("HashMap �� �������������� � ������-������ �������:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // �������� �������������� � ������-������ �������
        // (���������� ��� ���������� ������ ���������� HashMap ��� ���������� ������������� ������)

        // ������� �������� HashMap ����� ��������������
        System.out.println("\nHashMap ����� �������������� � ������-������ �������:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

