package HashMap;

import java.util.HashMap;

public class MamaRama{
    public static void main(String[] args) {

        HashMap<Character, Integer> mamaRama = new HashMap<Character, Integer>();
        String str = "Мама мыла раму";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer val = mamaRama.get(c);
            if (val != null) {
                mamaRama.put(c, new Integer(val + 1));
            } else {
                mamaRama.put(c, 1);
            }
        }
        mamaRama.forEach((k, v) -> System.out.println(k + " " + v));
    }
}