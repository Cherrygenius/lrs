package lr11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task8 {
    public static void main(String[] args) {
        List list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(numbersFilter(list,3));
    }
    public static List<Integer> numbersFilter(List<Integer> list, int number){
        return list.stream()
                .filter(x -> x>number)
                .collect(Collectors.toList());
    }
}
