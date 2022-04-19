package huawei.simple;

import java.util.Scanner;

/**
 * 最大回子串，可以是aba，也可以是abba，
 * 思想：将每个字符中间添加一个#，那么就只转换成了一种情况。
 */
public class HJ85_Max_Re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String cur = sc.nextLine();
            System.out.println(maxRe(cur));
        }
    }

    private static int maxRe(String str) {
        if (str == null || str.length() <= 0)
            return 0;
        if (str.length() <= 1)
            return 1;
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            sb.append("#");
        }
        int max = 0;
        System.out.println(sb);
        for (int i = 0; i < sb.length(); i++) {
            int r = 1;
            while (i - r >= 0 && r + i < sb.length()
                    && sb.charAt(i - r) == sb.charAt(i + r))
                r++;
            max = Math.max(r, max);
        }
        return max-1;
    }
}
