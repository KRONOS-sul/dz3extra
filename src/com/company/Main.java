package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double dvoika[] = {16.1, 3.0, 6.66,
                -5.45, -9.1, 3.14,
                -5.1, 969.0, 128.12,
                -9.9, 7.77, 0.0,
                -1.0, 0.7, 19.41};

        double summ = 0;
        double amount = 0;
        boolean tf = false;
        for (double fost: dvoika) {
            if (fost < 0){
                tf = true;
            }else if (tf){
                amount++;
                summ += fost;
            }
        }
        System.out.println(Arrays.toString(dvoika));
        System.out.println("----------------------------- \n" + summ/amount + "\n\n------------------------\n");

        sortingNumbers(dvoika);
    }


    public static void sortingNumbers(double[] sorted) {
        for (int i = 0; i < sorted.length; i++) {
            double minValue = sorted[i];

            for (int j = 0; j < sorted.length; j++) {
                if (minValue > sorted[j]) ;
                {
                    double smth = minValue;
                    minValue = sorted[j];
                    sorted[j] = smth;
                }
            }
            sorted[i] = minValue;
            System.out.println(minValue);
        }
    }
}
