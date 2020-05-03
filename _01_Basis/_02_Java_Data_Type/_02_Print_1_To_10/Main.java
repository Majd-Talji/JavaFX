package _01_Basis._02_Java_Data_Type._02_Print_1_To_10;

import _01_Basis._02_Java_Data_Type._01_Print_1_To_10.*;
import java.math.BigDecimal;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        getRound();

        BigDecimal first, second, result;
        first = new BigDecimal("33.33333333333333");
        second = new BigDecimal("100");
        result = first.divide(second);
        System.out.println("result is " + result);

        System.out.println();
        double total = 0;
        total += 5.6;
        total += 5.8;
        System.out.println("double value : " + total);
        System.out.printf("double value : %s ", total);
        System.out.println();

        System.out.println("Float Values : ");
        for (double i = 0; i < 1; i += 0.1f) {
            String s = String.format("%s ", i);
            double val = Double.parseDouble(s);
            System.out.print(val + " ");
            System.out.print(i + "  ");
            System.out.printf("%f ", i);
            System.out.printf("%s \n", i);
        }
    }

    private static void getRound() {
        System.out.println();
        double total = 0;
        total += 5.6;
        total += 5.8;
        System.out.println("double value : " + total);
        System.out.printf("double value : %s ", total);
        String s = String.format("%f", total);
        double val = Double.parseDouble(s);
        System.out.println(" val is :" + val);
        System.out.println();
    }

}
