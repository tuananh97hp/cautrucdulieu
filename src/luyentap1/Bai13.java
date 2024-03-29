package luyentap1;

import java.util.*;

import static java.lang.Math.pow;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 1) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int min = 0;
            int max = 0;
            for (int i = 0; i < k; i++) {
                min += pow(2, i);
                max += pow(2, (n - i - 1));
            }
            for (int i = min; i <= max; i++) {
                String binary = Integer.toBinaryString(i);
                if (check(binary, k)) {
                    int length = binary.length();
                    for (int j = 0; j < n - length; j++) {
                        binary = "0" + binary;
                    }
                    System.out.println(binary);
                }
            }
        }
    }

    public static boolean check(String b, int k) {
        int dem = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == 49) {
                dem++;
            }
        }
        if (dem != k) {
            return false;
        }
        return true;
    }
}
