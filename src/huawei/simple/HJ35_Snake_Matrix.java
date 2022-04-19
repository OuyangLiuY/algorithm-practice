package huawei.simple;

import java.util.Scanner;

public class HJ35_Snake_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] res = new int[n][n];
        int idx = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                res[i][j] = idx++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(res[j][i] >0){
                    System.out.print(res[j][i] +" ");
                }
            }
            System.out.println();
        }
    }
}
