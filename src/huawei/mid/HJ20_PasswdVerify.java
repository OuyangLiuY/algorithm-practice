package huawei.mid;

import java.util.HashSet;
import java.util.Scanner;
public class HJ20_PasswdVerify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if (str.length() <= 8) {
                System.out.println("NG");
                continue;
            }
            HashSet<String> scc = new  HashSet();
            for (int i = 0; i < str.length(); i++) {
                char cc = str.charAt(i);
                if (Character.isDigit(cc)) {
                    scc.add("d");
                } else if (Character.isUpperCase(cc)) {
                    scc.add("u");
                } else if (Character.isLowerCase(cc)) {
                    scc.add("l");
                } else {
                    scc.add("t");
                }
            }
            if (scc.size() < 3) {
                System.out.println("NG");
                continue;
            }
            int ans = 0;
            for (int i = 0; i < str.length() - 3; i++) {
                String cr = str.substring(i, i + 3);
                int max = 0;
                for (int j = i; j < str.length() - 3; j++) {
                    if (cr.equals( str.substring(j, j + 3))){
                        max++;
                    }
                }
                ans = Math.max(max, ans);
            }
            if (ans > 1) {
                System.out.println("NG");
            } else {
                System.out.println("OK");
            }
        }
    }
}