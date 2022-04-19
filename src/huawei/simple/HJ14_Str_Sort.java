package huawei.simple;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 给定 n 个字符串，请对 n 个字符串按照字典序排列。
 * <p>
 * 数据范围： 1 \le n \le 1000 \1≤n≤1000  ，字符串长度满足 1 \le len \le 100 \1≤len≤100
 * 输入描述：
 * 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 * 输出描述：
 * 数据输出n行，输出结果为按照字典序排列的字符串。
 */
public class HJ14_Str_Sort {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = 0;
        int size = 0;
        TreeMap<String, String> hs = new TreeMap<>();
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (f == 0) {
                f++;
                size = Integer.parseInt(s);
                continue;
            }
            if (!hs.containsKey(s)) {
                hs.put(s, s);
            } else {
                hs.put(s, hs.get(s) + "_" + s);
            }
            f++;
            if ((f - size) == 1) {
                break;
            }
        }
        hs.forEach((k, v) -> {
            String[] ss = v.split("_");
            for (int i = 0; i < ss.length; i++) {
                System.out.println(ss[i]);
            }
        });
    }
}
