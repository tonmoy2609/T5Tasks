package lt.vcd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4 {
    static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("duomenys.txt"));

        int n = sc.nextInt();

        int previous = sc.nextInt();
        int count = 0;

        for (int i = 1; i < n; i++) {
            int current = sc.nextInt();

            if (current < previous) {
                count++;
            }

            previous = current;
        }

        System.out.println(count);

        sc.close();
    }
}