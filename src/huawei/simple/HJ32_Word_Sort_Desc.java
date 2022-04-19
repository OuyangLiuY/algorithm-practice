package huawei.simple;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 对字符串中的所有单词进行倒排。
 * <p>
 * 说明：
 * <p>
 * 1、构成单词的字符只有26个大写或小写英文字母；
 * <p>
 * 2、非构成单词的字符均视为单词间隔符；
 * <p>
 * 3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
 * <p>
 * 4、每个单词最长20个字母；
 */
public class HJ32_Word_Sort_Desc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("\\*", " ")
                .replaceAll("\\$", " ").replaceAll("!", " ")
                .replaceAll("#", " ");
        String[] strs = str.split("\\s+");
        if (strs.length > 0) {
            for (int i = strs.length - 1; i >= 0; i--) {
                System.out.print(strs[i]+" ");
            }
        }
    }
}
