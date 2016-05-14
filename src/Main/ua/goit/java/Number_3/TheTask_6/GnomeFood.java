package Main.ua.goit.java.Number_3.TheTask_6;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by 7 on 07.05.2016.
 */
public class GnomeFood {
    public int[] find(int[] gnames, int[] portions) {
        int[] result = new int[gnames.length];

        HashMap<Integer, Integer> portionNumbers = new HashMap<>();
        for (int i = 0; i < portions.length; i++) {
            portionNumbers.put(portions[i], i);
        }

        int[] sortedGnames = new int[gnames.length];
        for (int i = 0; i < gnames.length; i++) {
            sortedGnames[i] = gnames[i];
        }
        Arrays.sort(sortedGnames);

        int[] sortedPortions = portions;
        Arrays.sort(sortedPortions);

        HashMap<Integer, Integer> sortedPortionsForGnames = new HashMap<>();
        for (int i = 0; i < gnames.length; i++) {
            sortedPortionsForGnames.put(sortedGnames[i], sortedPortions[i]);
        }

        for (int i = 0; i < gnames.length; i++) {
            result[i] = portionNumbers.get(sortedPortionsForGnames.get(gnames[i]));
        }
        return result;
    }
}
