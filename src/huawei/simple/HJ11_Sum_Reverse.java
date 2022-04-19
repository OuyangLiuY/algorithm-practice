package huawei.simple;

import java.util.Scanner;

/**
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 * <p>
 * <p>
 * 数据范围： 0 \le n \le 2^{30}-1
 */
public class HJ11_Sum_Reverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        char[] ac = String.valueOf(str).toCharArray();
        for (int i = ac.length - 1; i >= 0; i--) {
            System.out.print(ac[i]);
        }
    }
}
