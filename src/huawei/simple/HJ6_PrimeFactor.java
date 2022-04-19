package huawei.simple;

import java.util.Scanner;

public class HJ6_PrimeFactor {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print2(n);
    }

    // 暴力求解,使用该方法会超时
    static void print1(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
    }

    // 优化，提交通过
    static void print2(int n) {
        int mi = (int) Math.sqrt(n);
        for (int i = 2; i <= mi; ) {
            if (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            } else {
                i++;
            }
        }
        if (n > mi) {
            System.out.print(n);
        }
    }
}
