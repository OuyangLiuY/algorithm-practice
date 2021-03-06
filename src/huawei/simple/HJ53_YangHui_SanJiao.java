package huawei.simple;

import java.util.Scanner;

/**
 * 以上三角形的数阵，第一行只有一个数1，以下每行的每个数，是恰好是它上面的数、左上角数和右上角的数，3个数之和（如果不存在某个数，认为该数就是0）。
 * <p>
 * 求第n行第一个偶数出现的位置。如果没有偶数，则输出-1。例如输入3,则输出2，输入4则输出3，输入2则输出-1。
 */
public class HJ53_YangHui_SanJiao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 2)
            System.out.println(-1);
        else if (n % 2 == 1)
            System.out.println(2);
        else if (n % 4 == 0)
            System.out.println(3);
        else
            System.out.println(4);

    }
}
