package huawei.simple;

import java.util.Scanner;

public class HJ51_List_Node {
    int size = 0;
    int max = 0;
    ListNode head;
    ListNode tail;

    public HJ51_List_Node(int size) {
        this.max = size;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode pre;

        public ListNode(int val) {
            this.val = val;
        }
    }

    void add(int val) {
        size++;
        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        ListNode pre = head;
        ListNode next = head.next;
        while (next != null) {
            pre = next;
            next = next.next;
        }
        next = node;
        next.pre = pre;
        pre.next = next;
        tail = next;
    }

    Integer get(int k) {
        if (k > size) {
            return null;
        }
        ListNode cur = tail;
        int val = 0;
        while (cur != null) {
            k--;
            if (k == 0) {
                val = cur.val;
            }
            cur = cur.pre;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        HJ51_List_Node list = null;
        while (sc.hasNext()) {
            first++;
            String str = sc.nextLine();
            if (first == 1) {
                list = new HJ51_List_Node(Integer.parseInt(str));
            }
            if (first == 2) {
                String[] vls = str.split("\\s+");
                for (int i = 0; i < vls.length; i++) {
                    list.add(Integer.parseInt(vls[i]));
                }
            }
            if (first == 3) {
                first = 0;
                System.out.println(list.get(Integer.parseInt(str)));
            }
        }
    }
}
