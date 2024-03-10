package lr9.task3;

import java.util.HashMap;
import java.util.Map;

public class HashMapList {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Ваня");
        map.put(1, "Женя");
        map.put(2, "Костя");
        map.put(3, "Лера");
        map.put(4, "Толя");
        map.put(5, "Максим");
        map.put(6, "Евгений");
        map.put(7, "Виталий");
        map.put(8, "Катя");
        map.put(9, "Ваня");

        int productOfKeys = 1;
        String string = "";
        String string1 = "";
        for (Map.Entry<Integer,String> entry: map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();

            if (key > 5) {
                string1 += value + " ";
            }

            if (key == 0) {
               if(string.length()!= 0){
                   string += ", ";
               }
               string += value;
            }

            if(value.length() > 5 && key != 0) {
                productOfKeys *= key;
            }
        }

        System.out.println(map);
        System.out.println(string1);
        System.out.println(string);
        System.out.println(productOfKeys);
    }
}
