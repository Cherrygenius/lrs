package lr9.task3;

import java.util.HashMap;
import java.util.Map;

public class HashMapList {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "����");
        map.put(1, "����");
        map.put(2, "�����");
        map.put(3, "����");
        map.put(4, "����");
        map.put(5, "������");
        map.put(6, "�������");
        map.put(7, "�������");
        map.put(8, "����");
        map.put(9, "����");

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
