package java_week_4_hw;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 *  * For eg.
 *  * Input number of rows: 10
 *  * Expected Output:
 *  * <p>
 *  * 1
 *  * 12
 *  * 123
 *  * 1234
 *  * 12345
 *  * 123456
 *  * 1234567
 *  * 12345678
 *  * 123456789
 *  * 12345678910
 */
public class Programme_6_NumberTriangle {
    public static void numberTriangle(int n){
        for (int i = 0; i <= n; i++){
            for (int j = 0; j < i; j++){
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows : ");
        //call static method
        numberTriangle(scanner.nextInt());
        //closing scanner object
        scanner.close();
    }
}
