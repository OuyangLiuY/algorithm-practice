package huawei.simple;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Length {

    public static int getMaxLength(String str) {
        int le = 0;
        int idx = 0;
        int[] arr = new int[str.length()];
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (Character.isDigit(aChar)) {
                arr[i] = Integer.parseInt(String.valueOf(aChar));
            } else {
                arr[i] = -1;
            }
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            int curMax = 0;
            if (cur > -1) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] > -1) {
                        curMax++;
                    }else {
                        break;
                    }
                }
            }
            max  = Math.max(max,curMax);
        }
        return max;
    }

    public static void main(String[] args) {
        int max = getMaxLength("1221asdasdl12312adsd14434234234");
        System.out.println(max);

        String str = "1221asdasdl12312adsd14434234234";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            Character.isDigit(aChar);
        }
        System.out.println(Arrays.toString(chars));

        List<String> list = new ArrayList<>();
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list);
    }
}
