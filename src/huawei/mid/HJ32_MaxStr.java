package huawei.mid;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 求最长回文子串
 */
public class HJ32_MaxStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            char[] chars = manacherStr(str);
            System.out.println(Arrays.toString(chars));
            System.out.println(right(chars));
        }

    }

    public static int right(char[] chars) {
        int max = 0;
        for (int i = 1; i < chars.length; i++) {
            int L = i - 1;
            int R = i + 1;
            while (L >= 0 && R < chars.length && chars[L] == chars[R]) {
                L--;
                R++;
            }
            // 跳出循环的时候，L/R已经是越界或者是L!=R状态，因此要减去1
            max = Math.max(max, R - L - 1);
        }
        return max / 2;
    }

    public static char[] manacherStr(String str) {
        char[] res = new char[str.length() * 2 + 1];
        int idx = 0;
        for (int i = 0; i < res.length; i++) {
            res[i] = (i & 1) == 0 ? '#' : str.charAt(idx++);
        }
        return res;
    }
}
