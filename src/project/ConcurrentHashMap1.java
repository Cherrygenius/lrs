package project;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap1 {
        public static void main(String[] args) {
            ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

            // ���������� ��������� � ConcurrentHashMap �� ���������� �������
            Runnable task = () -> {
                for (int i = 0; i < 100; i++) {
                    map.put("key" + i, i);
                }
            };

            // �������� ���������� ������� ��� ���������� ���������
            Thread thread1 = new Thread(task);
            Thread thread2 = new Thread(task);
            Thread thread3 = new Thread(task);

            // ������ �������
            thread1.start();
            thread2.start();
            thread3.start();

            // �������� ���������� ������ �������
            try {
                thread1.join();
                thread2.join();
                thread3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // ����� ��������� ConcurrentHashMap
            map.forEach((key, value) -> System.out.println(key + ": " + value));
        }
}
