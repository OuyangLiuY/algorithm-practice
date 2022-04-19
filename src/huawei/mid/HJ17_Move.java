package huawei.mid;

import java.util.Scanner;

public class HJ17_Move {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] cur = str.split(";");
            int[] res = {0, 0};
            for (int i = 0; i < cur.length; i++) {
                String s = cur[i];
                if (s.length() >= 2) {
                    String z = s.substring(0, 1);
                    String cc = s.substring(1);
                    boolean re = false;
                    for (int j = 0; j < cc.length(); j++) {
                        if(!Character.isDigit(cc.charAt(j))){
                            re = true;
                        }
                    }
                    if(re)
                        continue;
                    int step = Integer.parseInt(cc);
                    switch (z) {
                        case "A":
                            res[0] = res[0] - step;
                            break;
                        case "D":
                            res[0] = res[0] + step;
                            break;
                        case "W":
                            res[1] = res[1] + step;
                            break;
                        case "S":
                            res[1] = res[1] - step;
                            break;
                        default:
                            break;
                    }
                }
            }
            System.out.println(res[0] + "," + res[1]);
        }
    }
}
