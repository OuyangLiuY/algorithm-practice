package huawei.mid;

import javax.print.DocFlavor;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HJ16_Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int m = scanner.nextInt();

            int[] v = new int[m];
            int[] p = new int[m];
            int[] q = new int[m];
            for (int i = 0; i < m; i++) {
                v[i] = scanner.nextInt();
                p[i] = scanner.nextInt() * v[i];
                q[i] = scanner.nextInt();
            }
            System.out.println(dp(v, p, q, N));
        }
    }

    // v 价值
    // p*v 价值哦
    // q 主/附
    // m 个数
    // N 钱
    public static int getMax(int[] v, int[] p, int[] q, int N) {

        return process(v, p, q, 0, N);
    }

/*    private static int process(int[] v, int[] p, int[] q, int idx, int n) {
        if (idx == v.length)
            return 0;
        if (n < 0)
            return -1;
        int p1 = process(v, p, q, idx + 1, n); // 不要当前位置
        int p2 = 0;
        int p3 = 0;
        // 要当前位置
        if (q[idx] > 0) { // 附件
            if(n - v[idx] - v[q[idx] - 1] >=0){
                int next = process(v, p, q, idx + 1, n - v[idx] - v[q[idx] - 1]);
                p2 = v[idx]  + p[q[idx] - 1] + next;
            }
        }
        if(q[idx] == 0){ // 主件
            if(n - v[idx] >=0){
                int next = process(v, p, q, idx + 1, n - v[idx]);
                p3 = p[idx] + next;
            }

        }
        return Math.max(p1, Math.max(p2, p3));
    }*/

    private static int process(int[] v, int[] p, int[] q, int idx, int rest) {
        if (idx == v.length)
            return 0;
        if (rest < 0)
            return -1;
        int p1 = process(v, p, q, idx + 1, rest); // 不要当前位置
        int p2 = 0;
        // 要当前位置
        if (q[idx] > 0) { // 附件
            if (rest - v[idx] - v[q[idx] - 1] >= 0) {
                int next = process(v, p, q, idx + 1, rest - v[idx] - v[q[idx] - 1]);
                p2 = p[q[idx] - 1] + next;
            }
        } else { // 主件
            if (rest - v[idx] >= 0) {
                int next = process(v, p, q, idx + 1, rest - v[idx]);
                p2 = p[idx] + next;
            }

        }
        return Math.max(p1, p2);
    }

//    private static int process(int[] v, int[] p, int[] q, int idx, int n) {
//        if (idx == v.length)
//            return 0;
//        if (n < 0)
//            return -1;
//        int p1 = process(v, p, q, idx + 1, n); // 不要当前位置
//        int p2 = 0;
//        int p3 = 0;
//        // 要当前位置
//        if (q[idx] > 0) { // 附件
//            int next = process(v, p, q, idx + 1, n - v[idx] - v[q[idx] - 1]);
//            if (next != -1) {
//                p2 = v[idx] * p[idx] + v[q[idx] - 1] * p[q[idx] - 1] + next;
//            }
//        } else { // 主件
//            int next = process(v, p, q, idx + 1, n - v[idx]);
//            if (next != -1)
//                p3 = v[idx] * p[idx] + next;
//        }
//        return Math.max(p1, Math.max(p2, p3));
//    }

    private static int dp(int[] v, int[] p, int[] q, int n) {
        int N = p.length;
        int[][] dp = new int[N + 1][n + 1];

        for (int idx = N - 1; idx >= 0; idx--) {
            int[] record = new int[N];   // 当前主已被购买
            for (int rest = 0; rest <= n; rest++) {
                int p1 = dp[idx + 1][rest];
                int p2 = -1;
                if (q[idx] > 0) { // 附
                    if(record[q[idx] - 1]==1){    // 主已经被购买了
                        if (v[idx] <= rest){
                            p2 = p[idx] + dp[idx + 1][rest - v[idx]];
                        }
                    }else {  // 主没有被购买
                        if (v[idx] + v[q[idx] - 1] <= rest) {
                            p2 = p[idx] + p[q[idx] - 1] + dp[idx + 1][rest - v[q[idx] - 1] - v[idx]];
                        }
                    }
                } else {
                    if (v[idx] <= rest) {
                        record[idx] = 1;
                        p2 = p[idx] + dp[idx + 1][rest - v[idx]];
                    }
                }
                dp[idx][rest] = Math.max(p1, p2);
            }
        }
        return dp[0][n];
    }
}
