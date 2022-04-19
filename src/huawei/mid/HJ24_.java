package huawei.mid;

import java.util.Scanner;

public class HJ24_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int [] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(N-getMax(arr));
        }
    }

    private static int getMax(int[] arr) {
        int ans = 0;
        for (int i = 1; i < arr.length-1 ; i++) {
            int cr = arr[i];
            int l = i;
            int r = i;
            int max = 0;
            while (l>0 && r<arr.length-1){
                if(cr > arr[r++]){}
                l--;
            }
            ans = Math.max(max,ans);
        }
        return ans;
    }
}
