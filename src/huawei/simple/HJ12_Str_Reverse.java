package huawei.simple;

import java.util.Scanner;

/**
 * 字符串反转
 */
public class HJ12_Str_Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ss = sc.nextLine();
        String[] str = ss.split("\\s+");
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i] + " ");
        }
    }
}
