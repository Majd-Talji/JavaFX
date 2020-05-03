package _01_Basis._02_Java_Data_Type._03_Print_1_To_10;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("[0.1 * 10] : ");
        System.out.println(0.1 * 10);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
        System.out.println("");
        
        for (double i = 0; i < 10; i+=(0.1*10)) {
            System.out.println(i/10);
        }

    }

}
