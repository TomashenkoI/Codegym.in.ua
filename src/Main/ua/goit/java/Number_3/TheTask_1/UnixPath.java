package Main.ua.goit.java.Number_3.TheTask_1;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by 7 on 07.05.2016.
 */
public class UnixPath {
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
        String input = "/../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../../..";
        UnixPath up = new UnixPath();
        System.out.println(up.simplify1(input));
    }
}


