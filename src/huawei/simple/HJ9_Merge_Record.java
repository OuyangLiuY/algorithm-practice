package huawei.simple;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * 数据表记录包含表索引index和数值value（int范围的正整数），
 * 请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照index值升序进行输出。
 *
 */
public class HJ9_Merge_Record {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = 0;
        int size = 0;
        TreeMap<Integer, Integer> hs = new TreeMap<>();
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (f == 0) {
                f++;
                size = Integer.parseInt(s);
                continue;
            }
            f++;
            String[] str = s.split("\\s+");
            int key = Integer.parseInt(str[0]);
            int value = Integer.parseInt(str[1]);
            if (!hs.containsKey(key)) {
                hs.put(key, value);
            } else {
                hs.put(key, hs.get(key) + value);
            }
            if ((f - size) == 1) {
                break;
            }
        }
        hs.forEach((k, v) -> {
            System.out.print(k + " " + v + "\n");
        });
    }
}
