package java_week_4_hw;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8_SymbolTriangle {
    public static void symbolTriangle(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < i; j++){
                System.out.print("@");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers of rows : ");
        symbolTriangle(scanner.nextInt());
        //closing scanner object
        scanner.close();
    }

}
