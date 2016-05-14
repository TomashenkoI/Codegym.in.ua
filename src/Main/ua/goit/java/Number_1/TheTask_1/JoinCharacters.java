package Main.ua.goit.java.Number_1.TheTask_1;

/**
 * Created by 7 on 22.04.2016.
 */
public class JoinCharacters {
    public static int join(char[] input) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
        }

        int number = Integer.parseInt(builder.toString());
        return number;
    }

//    public static void main(String[] args) {
//        char[] ad = {'1', '2', '3'};
////        System.out.println(join(ad));
//
//        StringBuilder builder = new StringBuilder();
//
//        for (int i = 0; i < ad.length; i++) {
//            builder.append(ad[i]);
//        }
////        System.out.println(ad);
//        System.out.println(builder);
//
//        String stringNumber = builder.toString();
//        int number = Integer.parseInt(stringNumber);
//        System.out.println(number);
//    }
}