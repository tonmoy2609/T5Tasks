package lt.vcd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3 {
    static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("duomenys.txt"));

        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int temperature = sc.nextInt();

            if (temperature < 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No negative temperatures recorded");
        } else {
            System.out.println(count);
        }

        sc.close();
    }
}