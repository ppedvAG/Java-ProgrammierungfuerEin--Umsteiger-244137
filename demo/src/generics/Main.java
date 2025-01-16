package generics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] zahlen = {2,654,1,8,71,2,8,100,54,0,7};
        

        System.out.println(min(zahlen));
        System.out.println(max(zahlen));

        zahlen = sort(zahlen);

        System.out.println("sortiert:");
        for(Integer i: zahlen) {
            System.out.println(i);
        }

    }

    public static <T extends Comparable> T min (T[] werte) {
        T min = werte[0];
        for(int i = 0; i<werte.length; i++) {
            if(werte[i].compareTo(min)<0) {
                min = werte[i];
            }
        }
        return min;
    }

    public static <T extends Comparable> T max (T[] werte) {
        T max = werte[0];
        for(int i = 0; i<werte.length; i++) {
            if(werte[i].compareTo(max)>0) {
                max = werte[i];
            }
        }
        return max;
    }

    public static <T extends Comparable> T[] sort (T[] werte) {
        T[] sortedWerte = werte.clone();
        Arrays.sort(sortedWerte);
        return sortedWerte;
    }



}
