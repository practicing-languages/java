import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class ContadorVariado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        for (double i = 0; i < 5; i += 0.15) {
            System.out.println(String.format("%.2f", i));
        }
    }
}
