package huawei.simple;

import java.util.*;

/**
 * 删除出现次数最少的字符
 * 输入的字符串长度满足 1 \le n \le 20 \1≤n≤20  ，保证输入的字符串中仅出现小写字母
 */
public class HJ23_Str_LRU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Character> is = new HashSet<>();
        LinkedHashMap<Character, Integer> hs = new LinkedHashMap<>(20);
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!hs.containsKey(chars[i])) {
                hs.put(chars[i], 1);
            } else {
                hs.put(chars[i], hs.get(chars[i]) + 1);
            }
        }
        int minT = Integer.MAX_VALUE;
        for(Integer i :hs.values()){
            minT = Math.min(minT,i);
        }

        for (int i = 0; i < chars.length; i++) {
            if(hs.get(chars[i]) > minT){
                System.out.print(chars[i]);
            }
        }
    }
    // 输入：vfpnpnorrrr
    // 输出；pnpnrrrr
    //实际输出：ppnnrrrr
}
