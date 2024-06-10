package project;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RedBlackTreeHashMapExample {

    public static void main(String[] args) {
        // Создаем HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Добавляем элементы в HashMap и замеряем время вставки и поиска
        Random random = new Random();
        long startTime, endTime;

        // Добавляем элементы с коллизиями
        for (int i = 0; i < 20; i++) {
            int key = random.nextInt(10); // Ключи от 0 до 9
            hashMap.put(key, "Value" + key);
        }

        // Замеряем время поиска до значительного добавления элементов
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            hashMap.get(random.nextInt(10));
        }
        endTime = System.nanoTime();
        System.out.println("Время поиска до добавления значительного количества элементов: " + (endTime - startTime) + " наносекунд");

        // Добавляем больше элементов для вероятного преобразования в красно-черные деревья
        for (int i = 20; i < 1000; i++) {
            int key = random.nextInt(10);
            hashMap.put(key, "Value" + key);
        }

        // Замеряем время поиска после значительного добавления элементов
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            hashMap.get(random.nextInt(10));
        }
        endTime = System.nanoTime();
        System.out.println("Время поиска после добавления значительного количества элементов: " + (endTime - startTime) + " наносекунд");

        // Выводим элементы HashMap после добавления значительного количества элементов
        System.out.println("\nHashMap после добавления значительного количества элементов:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
