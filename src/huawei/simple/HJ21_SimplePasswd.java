package huawei.simple;

import java.util.HashMap;
import java.util.Scanner;

public class HJ21_SimplePasswd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>(26);
        map.put('a', 2);
        map.put('b', 2);
        map.put('c', 2);

        map.put('d', 3);
        map.put('e', 3);
        map.put('f', 3);

        map.put('g', 4);
        map.put('h', 4);
        map.put('i', 4);

        map.put('j', 5);
        map.put('k', 5);
        map.put('l', 5);

        map.put('m', 6);
        map.put('n', 6);
        map.put('o', 6);

        map.put('p', 7);
        map.put('q', 7);
        map.put('r', 7);
        map.put('s', 7);

        map.put('t', 8);
        map.put('u', 8);
        map.put('v', 8);

        map.put('w', 9);
        map.put('x', 9);
        map.put('y', 9);
        map.put('z', 9);

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (Character.isDigit(aChar)) {
                System.out.print(aChar);
            } else {
                if (map.containsKey(aChar)) {
                    System.out.print(map.get(aChar));
                } else {
                    char cur;
                    if (aChar == 'Z') {
                        cur = 'a';
                    } else {
                        cur = (char) (Character.toLowerCase(aChar) + 1);
                    }
                    System.out.print(cur);
                }
            }
        }
    }
}
