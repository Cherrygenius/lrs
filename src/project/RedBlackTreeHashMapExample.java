package project;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RedBlackTreeHashMapExample {

    public static void main(String[] args) {
        // —оздаем HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // ƒобавл€ем элементы в HashMap
        for (int i = 0; i < 20; i++) {
            int key = new Random().nextInt(100);
            hashMap.put(key, "Value" + key);
        }

        // ¬ыводим элементы HashMap до преобразовани€ в красно-черные деревь€
        System.out.println("HashMap до преобразовани€ в красно-черные деревь€:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // ѕроводим преобразование в красно-черные деревь€
        // (фактически это происходит внутри реализации HashMap при достижении определенного порога)

        // ¬ыводим элементы HashMap после преобразовани€
        System.out.println("\nHashMap после преобразовани€ в красно-черные деревь€:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

