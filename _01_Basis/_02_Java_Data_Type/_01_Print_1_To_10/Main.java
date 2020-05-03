package _01_Basis._02_Java_Data_Type._01_Print_1_To_10;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {
    
    public static void main(String[] args) {
        double total = 0;
        total += 5.6;
        total += 5.8;
        System.out.println("double value : " + total);
        System.out.println();
        
        System.out.println("Float Values : ");
        for (float i = 0; i < 10; i+=0.1f) {
            System.out.println(i);
        }
        System.out.println();
        
        System.out.println("double Values : ");
        for (double i = 0; i < 10; i+=0.1d) {
            System.out.println(i);
        }
        System.out.println();
    }
    
}
