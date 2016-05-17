package Main.ua.goit.java.Number_3.TheTask_1;

import java.util.HashMap;
import java.util.Stack;

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
        String result = "";

        int count = 0;
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder();
        builder.append(input);

        for (int a = 0; a < builder.length(); a++) {
            builder.append(" ");
            for (int i = 0; i < builder.length(); i++) {
                if (builder.charAt(i) == '/' && builder.charAt(i + 1) == '/') {
                    builder.deleteCharAt(i + 1);
                }
                if (builder.charAt(i) == '/' && builder.charAt(i + 1) == '.') {
                    builder.deleteCharAt(i + 1);
                }
            }
            builder.deleteCharAt(builder.length() - 1);
            if (builder.length() > 1) {
                builder.reverse();
                if (builder.charAt(0) == '/') {
                    builder.deleteCharAt(0);
                }
                builder.reverse();
            }
        }
        result = builder.toString();
        for (int i = builder.length() - 1; i > 0; i--) {
            if (builder.charAt(i) == '/') {
                if (count == 0) {
                    count++;
                } else {
                    result = "/var" + builder.substring(i, builder.length());
                    break;
                }
            }
        }
        return result;
    }

    public String simplify1(String input) {
        int count = 0;
        int start = 0;
        int end = 0;

        HashMap<String, Integer> operations = new HashMap<>();
        operations.put("../", 1);
        operations.put("./", 0);
        operations.put(".", 0);
        operations.put("/", 0);

        Stack stack = new Stack();
        for (int i = input.length() - 1; i > 0; i--) {
            if (count == 0) {
                end = i + 1;
                count++;
            }
            if (count != 0 && input.charAt(i - 1) == '/') {
                if (count != 0) {
                    start = i;
                    count = 0;
                    String pack = input.substring(start, end);
                    stack.push(pack);
                }
            }
        }

        StringBuilder result = new StringBuilder();
        result.append("/");
        Stack newStack = new Stack();
        System.out.println(stack);

        while (!stack.isEmpty()) {
            if (!operations.containsKey(stack.peek())) {
                if (!newStack.isEmpty()) {
                    result.append(newStack.pop());
                }
                newStack.push(stack.pop());
            }
            if (!stack.isEmpty()) {
                if (operations.containsKey(stack.peek())) {
                    if (operations.get(stack.peek()) == 1) {
                        stack.pop();
                        if (!newStack.isEmpty()) {
                            newStack.pop();
                        }
                    } else {
                        stack.pop();
                    }
                } else if (!newStack.isEmpty()) {
                    result.append(newStack.pop());
                }
            }
        }
        if (!newStack.isEmpty()) {
            result.append(newStack.pop());
        }
        while (result.charAt(result.length()-1) == '.' || (result.charAt(result.length()-1) == '/')) {
            if (result.length() > 1) {
                result.deleteCharAt(result.length()-1);
            } else break;
        }

        return result.toString();
    }


    public static void main(String[] args) {
//        String input = "/var/lib/../log/./../tmp/data///.";
        String input = "/../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../..";
//        String input = "/var//lib"; //!
//        String input = "/var//.///../lib/";
//        String input = "/../lib/";
//        String input = "/var//lib";
//        String input = "/home/../var/./lib//file.txt";
        UnixPath up = new UnixPath();
        System.out.println(up.simplify1(input));
    }
}


