package huawei.simple;

import java.util.Scanner;

/**
 * 汽水瓶问题
 * 每三个空瓶，换一个汽水瓶。可以借一个空汽水瓶，但是必须要还。问最大能喝到多少瓶。
 * 输入的是空瓶数n
 */
public class HJ22_Water_Bottle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n <= 0) {
                break;
            }
            if (n < 2) {
                System.out.println(0);
            }
            System.out.println(Math.max(normalSum(n), jieSum(n)));
        }
    }
    // 用两个借一次，并且还了
    private static int jieSum(int n) {
        return n / 2;
    }
    // 先换不借，最后看要不要借
    private static int normalSum(int n) {
        int sum = 0;
        int s1 = n / 3;
        sum += s1;
        while (s1 > 2) {
            int cr = s1 / 3;
            s1 = cr;
            sum += cr;
        }
        if (s1 == 2) sum++;
        return sum;
    }
}
