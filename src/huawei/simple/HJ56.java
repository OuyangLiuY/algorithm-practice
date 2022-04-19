package huawei.simple;

import java.util.Scanner;

public class HJ56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int count = 0;
            for (int i = 1; i <= n; i++) {
                int sum = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        sum += j;
                    }
                }
                if (sum == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
