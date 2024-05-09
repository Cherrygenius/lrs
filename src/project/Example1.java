package project;

import java.util.HashMap;

public class Example1 {

    public class Main {
        public static void main(String[] args) {
            // Создание объекта HashMap
            HashMap<String, Integer> hashMap = new HashMap<>();

            // Добавление элементов
            hashMap.put("apple", 10);
            hashMap.put("banana", 20);
            hashMap.put("orange", 30);

            // Получение значения по ключу
            int value = hashMap.get("apple");
            System.out.println("Value for key 'apple': " + value);

            // Удаление элемента
            hashMap.remove("banana");

            // Проверка наличия ключа
            boolean containsKey = hashMap.containsKey("banana");
            System.out.println("Contains key 'banana': " + containsKey);
        }
    }
}
