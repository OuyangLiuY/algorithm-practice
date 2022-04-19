package huawei.simple;

import java.util.Scanner;

/**
 * int中1的个数
 */
public class HJ15_Int_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
//        System.out.println(method1(sum));
        System.out.println(method2(sum));
    }

    private static int method1(int sum) {
        String str = Integer.toBinaryString(sum);
        char[] chars = str.toCharArray();
        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                res++;
            }
        }
        return res;
    }

    private static int method2(int sum) {
        int res = 0;
        while (sum > 0) {
            if ((sum & 1) != 0) {
                res++;
            }
            sum = sum >> 1;
        }
        return res;
    }
}
