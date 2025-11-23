package learn.core.java.concepts.TUFcode.advancedSection.LinkedList;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    Integer val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }


}

public class LinkListManager {



    public LinkListManager() {
    }

    public ListNode initTheLinkedList(List<Integer> arr) {
        ListNode  headNode = new ListNode(arr.get(0));
        ListNode   pointer=headNode;
        for(int i = 1;i<arr.size();i++){
            ListNode temp = new ListNode(arr.get(i));
            pointer.next=temp;
            pointer=temp;

        }
        // check if pointer is pointing to last element
        if(pointer.next==null){
            System.out.println("Pointing to last element");
        }
        return headNode;
    }

   public  List<Integer> travereLinkList(ListNode head) {

        List<Integer> elements = new ArrayList<>();
        ListNode pointer = head;
        while (head!=null && pointer!=null){
            elements.add(pointer.val);
            pointer=pointer.next;
        }

        return elements;
    }

    public int getLengthOfLinkedList(ListNode headNode) {

        int counter = 0;
        ListNode pointer = headNode;
        while (headNode!=null && pointer!=null){
            counter++;
            pointer=pointer.next;
        }
        return counter;
    }
}
