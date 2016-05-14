package Main.ua.goit.java.Number_3.TheTask_2;

import java.util.ArrayList;

/**
 * Created by 7 on 06.05.2016.
 */
public  class LongestStabilityPeriod {
    public int count(int[] gdp) {
        int maxRow = 1;
        int number1;
        int number2;
        int count;
        boolean correct;
        ArrayList<Integer> list = new ArrayList<>();

        if (gdp.length > 1) {
            for (int j = 0; j < gdp.length; j++) {
                if (list.size() > maxRow) {
                    maxRow = list.size();
                }
                number1 = gdp[j];
                number2 = gdp[j];
                count = 0;
                list.clear();
                list.add(gdp[j]);
                for (int i = j + 1; i < gdp.length - 1; i++) {
                    if (number1 - gdp[i] >= -1 && number1 - gdp[i] <= 1){
                        correct = true;
                    }
                    else break;
                    if (gdp[i] != number1 && count < 1 && correct == true) {
                        number2 = gdp[i];
                        count++;
                    }
                    if (gdp[i] == number1 || gdp[i] == number2) {
                        list.add(gdp[i]);
                    }
                    else break;
                }
            }
        }
        return maxRow;
    }
}
