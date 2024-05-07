// package srcs.removeNth;

class ListNode{
    int val;
    public ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}

class Solution {
    // public ListNode removeNthFromEnd(ListNode head, int n) {    
    //     ListNode tobeRemovedNode = head;
    //     ListNode forwardNode = head;


    //     // while(forwardNode != null) {
    //     //     for(int i=0, j=0; head != null; i ++){
    //     //         if (i > n){
    //     //             j++;
    //     //             tobeRemovedNode = tobeRemovedNode.next;
    //     //         }
    //     //         forwardNode = forwardNode.next;
    //     //     }
    //     // }
    //     // tobeRemovedNode.val = tobeRemovedNode.next.val;
    //     // tobeRemovedNode.next = tobeRemovedNode.next.next;
        
    //     // return head;

    //     // for(int i=0; i < n; i++){
    //     //     forwardNode = forwardNode.next;
    //     // }

    //     // while(forwardNode != null){
    //     //     forwardNode = forwardNode.next;
    //     //     tobeRemovedNode = tobeRemovedNode.next;
    //     // }

    //     // tobeRemovedNode.val = tobeRemovedNode.next.val;
    //     // tobeRemovedNode.next = tobeRemovedNode.next.next;

    //     // return head;

    //     int length =0;
    //     while(forwardNode!=null){
    //         length++;
    //         forwardNode = forwardNode.next;
    //     } 

    //     int previousNodeIndex = length - n -1;
    //     if(length - n -1 < 0){
    //         head = head.next;
    //         return head;
    //     }

    //     ListNode previousNode = head;
    //     for (int i=0; i < length - n -1; i++){
    //         previousNode = previousNode.next;
    //     }
    //     if(previousNode.next.next != null) {
    //         previousNode.next = previousNode.next.next;
    //     } else {
    //          previousNode.next = null;
    //     }
    //     return head;

    // }

    // Passes all test cases
    public ListNode removeNthFromEndOne(ListNode head, int n){
        int count = 0;
        ListNode tmpNode = head;
        
        while(tmpNode !=null) {
            count++;
            tmpNode = tmpNode.next;
        }
    
        tmpNode = head;
        int previousIndex = (count -n -1);
        System.out.println("previousIndex: " + previousIndex);
        if (previousIndex == -1){
            head = head.next;
            return head;
        }

        for(int i=0; i < previousIndex; i++){
            tmpNode = tmpNode.next;
        }
        System.out.println("tmpNode.val: " + tmpNode.val);
        tmpNode.next = tmpNode.next.next;
        return head;
    }

}

public class Main{
    
    public static ListNode generateLinkedList() {
        int[] values = {1,2,3,4,5};

        ListNode listNode = new ListNode(values[0]);
        ListNode head = listNode;
        for(int i=1; i < 5; i++){
            ListNode nextNode = new ListNode(values[i]);
            listNode.next = nextNode;
            listNode = nextNode;
        } 
        return head;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        ListNode head = generateLinkedList();
        solution.removeNthFromEndOne(head, 2);

        while(head !=null){
            System.out.println(head.val);
            head = head.next;
        }

    }
}
