package ss12_map_tree.exercise.count_character;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountCharacter {
    public static void main(String[] args) {
        String str = "hello word hello my word my life my color";
        String[] strArr = str.split(" ");
        Map<String, Integer> map = new TreeMap<>();
        for (String value : strArr) {
            if (map.containsKey(value)) {
                map.replace(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        for (Map.Entry<String, Integer> s : map.entrySet()) {
            System.out.println("Từ: " + s.getKey() + " số lần xuất hiện: " + s.getValue());
        }
    }
}
