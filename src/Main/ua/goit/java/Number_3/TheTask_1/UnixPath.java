package Main.ua.goit.java.Number_3.TheTask_1;

/**
 * Created by 7 on 07.05.2016.
 */
public class UnixPath {
//    public void redactor(int a, StringBuilder builder, int i) {
//        if (a == 0) {
//            builder.deleteCharAt(int i)
//        }
//    }
    public String simplify(String input) {
        String result;

        int count = 0;
        StringBuilder builder = new StringBuilder();
        builder.append(input);
        builder.append(" ");

        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '/' && builder.charAt(i+1) == '/') {
                builder.deleteCharAt(i+1);
            }
            if (builder.charAt(i) == '/' && builder.charAt(i+1) == '.') {
                builder.deleteCharAt(i+1);
            }
        }
        builder.deleteCharAt(builder.length()-1);
        if (builder.length() > 1) {
            builder.reverse();
            if (builder.charAt(0) == '/') {
                builder.deleteCharAt(0);
            }
            builder.reverse();
        }

        return builder.toString();
    }


    public static void main(String[] args) {
        String result = "0";
        String input = "/var//lib/";
        UnixPath up = new UnixPath();

        System.out.println(up.simplify(input));
    }
}
