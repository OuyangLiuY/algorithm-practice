package leetcode;

import java.util.*;

/**
 *  Z 序列打印树结构
 *        1
 *    3       2
 *      6   5   9
 *    7  8
 *  打印结果：[[1], [2, 3], [6, 5, 9], [8, 7]]
 */
public class TreeNode_Z_Print {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(3);
        node.right = new TreeNode(2);

        node.left.right = new TreeNode(6);
        node.right.left = new TreeNode(5);
        node.right.right = new TreeNode(9);

        node.left.right.left = new TreeNode(7);
        node.left.right.right = new TreeNode(8);
        print(node);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    static void print(TreeNode head) {
        Stack<TreeNode> odd = new Stack<>();
        Stack<TreeNode> even = new Stack<>();
        int curLevel = 1;
        odd.add(head);
        TreeNode temp;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> inner = null;
        while (!odd.isEmpty() || !even.isEmpty()) {
            inner = new ArrayList<>();
            if (curLevel % 2 == 1) {
                while (!odd.isEmpty()) {
                    temp = odd.pop();
                    inner.add(temp.val);
//                    System.out.print(temp.val + ",");
                    // 依次放入左，右，可以实现当前层，从左到右，或者从右到左的一个顺序
                    // 因为是栈，所以先放左，再放右，pop出来顺序就是，右->左
                    if (temp.left != null) {
                        even.add(temp.left);
                    }
                    if (temp.right != null) {
                        even.add(temp.right);   // 奇数的下一行就是偶数
                    }
                }
            } else {
                while (!even.isEmpty()) {
                    temp = even.pop();
                    int c = temp.val;
                    inner.add(c);
//                    System.out.print(temp.val + ",");
                    // 因为是栈，所以先放右，再放左，pop出来顺序就是，左->右
                    if (temp.right != null) {    // 偶数的下一行就是奇数
                        odd.add(temp.right);
                    }

                    if (temp.left != null) {
                        odd.add(temp.left);
                    }
                }
            }
            res.add(inner);
            curLevel++;
        }
        System.out.println(res);
    }
}
