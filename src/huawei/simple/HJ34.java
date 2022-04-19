package huawei.simple;

import java.util.Arrays;
import java.util.Scanner;

public class HJ34 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
    }
}
