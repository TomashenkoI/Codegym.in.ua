package Main.ua.goit.java.Number_1.TheTask_2;

import java.util.HashMap;

/**
 * Created by 7 on 22.04.2016.
 */
public class SumDigits {
    public static int sum(int number) {
        StringBuilder sizeOfNumber = new StringBuilder();
        sizeOfNumber.append(number);
        int sumOfDigits = 0;
        int currentDigit;
        int tens = 1;
        HashMap<Integer, Integer> gradeOfTens = new HashMap<>();
        gradeOfTens.put(1, tens);

        for (int i = 2; i < sizeOfNumber.length() + 1; i++) {
            tens = tens * 10;
            gradeOfTens.put(i, tens);
        }
        for (int j = sizeOfNumber.length(); j > 0; j--) {
            currentDigit = number / gradeOfTens.get(j);
            number = number - gradeOfTens.get(j) * currentDigit;
            sumOfDigits = sumOfDigits + currentDigit;
        }
        return sumOfDigits;
    }
    public static int sum2(int number) {
        StringBuilder sizeOfNumber = new StringBuilder();
        sizeOfNumber.append(number);
        int sumOfDigits = 0;
        int currentDigit;
        for (int j = sizeOfNumber.length()-1; j > 0; j--) {
            double gradeOfTensD = Math.pow(10, j);
            int gradeOfTens = (int) (gradeOfTensD / 1);
            currentDigit = number / gradeOfTens;
            number = number - gradeOfTens * currentDigit;
            sumOfDigits = sumOfDigits + currentDigit;
        }
        sumOfDigits = sumOfDigits + number;
        return sumOfDigits;
    }
    public static int sum3(int number){
        int result = 0;
        StringBuilder builder = new StringBuilder();
        builder.append(number);
        if (number < 0) {
            builder.deleteCharAt(0);
        }
        for (int i = 0; i < builder.length(); i++) {
            result = result + Integer.parseInt(String.valueOf(builder.charAt(i)));
        }
        return result;
    }
    public static int sum4(int number){
        int result;
        int a = number / 100;
        number = number - a*100;
        int b = number / 10;
        number = number - b*10;
        int c = number;
        result = a + b + c;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int result = 0;
        int number = -2147483648;
        StringBuilder builder = new StringBuilder();
        builder.append(number);
        if (number < 0) {
            builder.deleteCharAt(0);
        }
        for (int i = 0; i < builder.length(); i++) {
            result = result + Integer.parseInt(String.valueOf(builder.charAt(i)));
        }
        System.out.println(result);
    }
}

