package huawei.simple;

import java.util.Scanner;

public class Str_Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        String s = scanner.nextLine().toLowerCase();
        char[] chars = str.toCharArray();
        char de = s.toCharArray()[0];
        int ans = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == de)
                ans++;
        }
        System.out.println(ans);
        System.out.println(Math.pow(16,0));
    }
}
