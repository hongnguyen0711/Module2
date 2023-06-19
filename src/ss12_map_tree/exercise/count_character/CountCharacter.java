package ss12_map_tree.exercise.count_character;


import java.util.Map;
import java.util.TreeMap;

public class CountCharacter {
    public static void main(String[] args) {
        String str = "Hello WORD hello my word My life my color";
        String str1 = str.toLowerCase();
        String[] strArr = str1.split(" ");
        Map<String, Integer> map = new TreeMap<>();
        for (String value : strArr) {
            if (map.containsKey(value)) {
                map.replace(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        for (Map.Entry<String, Integer> s : map.entrySet()) {
            System.out.println("Từ: " + s.getKey() + " có số lần xuất hiện: " + s.getValue());
        }
    }
}
