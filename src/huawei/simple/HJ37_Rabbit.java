package huawei.simple;

import java.util.Scanner;

/**
 * 有一种兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子。
 * 例子：假设一只兔子第3个月出生，那么它第5个月开始会每个月生一只兔子。
 * 假如兔子都不死，问第n个月的兔子总数为多少？
 */
public class HJ37_Rabbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(process(n));
    }

    private static int process(int n) {
        if (n <= 2) {
            return 1;
        }
        // 上个月的兔子f(n-1)，另一部是满足3个月大的兔子
        // 会生一只兔子f(n-2)
        return process(n - 1) + process(n - 2);
    }

    private static int sum(int n) {
        // 递推公式：f(n)=f(n-1)+f(n-2)
        if (n <= 2) {
            return 1;
        }
        int[] sum = new int[n];
        sum[0] = 1;
        sum[1] = 1;
        sum[2] = 2;
        for (int i = 3; i < n; i++) {
            sum[i] = sum[i - 1] + sum[i - 2];
        }
        return sum[n - 1];
    }
}
