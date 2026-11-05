package lt.vcd;

import java.util.Scanner;

public class Task1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();

        int k = 0;

        while (s < p) {
            s += m;
            k++;
        }

        System.out.println("k = " + k);

        sc.close();
    }
}
