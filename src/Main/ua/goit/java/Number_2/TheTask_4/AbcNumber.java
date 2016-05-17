package Main.ua.goit.java.Number_2.TheTask_4;

import java.util.HashMap;

/**
 * Created by 7 on 29.04.2016.
 */
public class AbcNumber {
    public int convert(String num) {
        int result = 0;
        int i = 0;

        HashMap<Character, Character> letters = new HashMap<>();
            for (char c = 'a'; c < 'z'; c++) {
                letters.put(c, (char) i);
                i++;
            }
        StringBuilder builder = new StringBuilder();
        builder.append(num);
        for (int j = 0; j < builder.length(); j++) {
            builder.setCharAt(j, letters.get(j));
        }
        result = Integer.parseInt(builder.toString());
        return result;
    }
}
