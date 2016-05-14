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

    public static void main(String[] args) {
        String num = "bcd";
        int result = 0;
        int i = 0;

        HashMap<Character, Integer> letters = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            letters.put(c, i);
            i++;
        }
        System.out.println(letters);
        StringBuilder builder = new StringBuilder();
        builder.append(num);
        System.out.println(builder);
        for (int j = 0; j < builder.length(); j++) {
            int c1 = letters.get(j);
            char c = (char) c1;
            builder.setCharAt(j, c);
        }
        System.out.println(builder);
//        result = Integer.parseInt(builder.toString());
        System.out.println(result);
    }
}
