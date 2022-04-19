package huawei.simple;

import java.util.Scanner;

/**
 *  输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。
 *
 * 数据范围：输入的字符串长度满足 1 \le n \le 1000 \1≤n≤1000
 *
 * 统计其中英文字符，空格字符，数字字符，其他字符的个数
 */
public class HJ40_Str_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int al = 0;
        int sum = 0;
        int space = 0;
        int sp = 0;
        for (int i = 0; i < chars.length; i++) {
            char ac = chars[i];
            if (Character.isDigit(ac))
                sum++;
            else if(Character.isAlphabetic(ac))
                al++;
            else if(Character.isWhitespace(ac))
                space++;
            else
                sp++;
        }
        System.out.println(al);
        System.out.println(space);
        System.out.println(sum);
        System.out.println(sp);
    }
}
