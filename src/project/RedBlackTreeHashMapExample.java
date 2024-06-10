package project;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RedBlackTreeHashMapExample {

    public static void main(String[] args) {
        // ������� HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // ��������� �������� � HashMap � �������� ����� ������� � ������
        Random random = new Random();
        long startTime, endTime;

        // ��������� �������� � ����������
        for (int i = 0; i < 20; i++) {
            int key = random.nextInt(10); // ����� �� 0 �� 9
            hashMap.put(key, "Value" + key);
        }

        // �������� ����� ������ �� ������������� ���������� ���������
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            hashMap.get(random.nextInt(10));
        }
        endTime = System.nanoTime();
        System.out.println("����� ������ �� ���������� ������������� ���������� ���������: " + (endTime - startTime) + " ����������");

        // ��������� ������ ��������� ��� ���������� �������������� � ������-������ �������
        for (int i = 20; i < 1000; i++) {
            int key = random.nextInt(10);
            hashMap.put(key, "Value" + key);
        }

        // �������� ����� ������ ����� ������������� ���������� ���������
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            hashMap.get(random.nextInt(10));
        }
        endTime = System.nanoTime();
        System.out.println("����� ������ ����� ���������� ������������� ���������� ���������: " + (endTime - startTime) + " ����������");

        // ������� �������� HashMap ����� ���������� ������������� ���������� ���������
        System.out.println("\nHashMap ����� ���������� ������������� ���������� ���������:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
