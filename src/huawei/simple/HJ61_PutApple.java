package huawei.simple;

import java.util.Scanner;

/**
 * 把m个同样的苹果放在n个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？
 * 注意：如果有7个苹果和3个盘子，（5，1，1）和（1，5，1）被视为是同一种分法。
 */
public class HJ61_PutApple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] ss = sc.nextLine().split("\\s+");
            int apple = Integer.parseInt(ss[0]);
            int pan = Integer.parseInt(ss[1]);
            System.out.println(process(apple, pan));
        }
    }

    // m苹果 ，n盘子
    private static int process(int m, int n) {
        // 只剩一个盘子或没有苹果，此时只有一种方法
        if (m == 0 || n == 1)
            return 1;
        if (m < n)  // 苹果比盘子少
            return process(m, m);
        int sum = 0;
        // 盘子不放苹果，盘子少一个
        sum += process(m, n - 1);
        // 盘子至少放一个苹果，那么在还有n个盘子的情况下，剩余苹果还剩最多，m-n
        sum += process(m - n, n);
        return sum;
    }
}
