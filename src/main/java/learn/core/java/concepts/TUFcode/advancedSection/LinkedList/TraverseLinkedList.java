package learn.core.java.concepts.TUFcode.advancedSection.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

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

public class TraverseLinkedList {

  ListNode headNode,pointer;

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(5, 4, 3, 1, 0);
        ListNode headNode =   buildUpTheLinkedList(arr);
        List<Integer> elements = LLTraversal(headNode);
        int lengthOfLL = getLengthOfLinkedList(headNode);
        System.out.println("Length of LinkedList "+lengthOfLL);
        elements.stream().forEach(System.out::println);

/*        headNode =deleteHeadNode(headNode);
        lengthOfLL = getLengthOfLinkedList(headNode);
        System.out.println("Length of LinkedList "+lengthOfLL);
        elements.stream().forEach(System.out::println);*/

 /*       ListNode tailNode = deleteTailNode(headNode);
        lengthOfLL = getLengthOfLinkedList(headNode);
        System.out.println("Tail node  is: --- :"+tailNode.val);
        System.out.println("Length of LinkedList "+lengthOfLL);
        System.out.println("lengthOfLL-------"+lengthOfLL);*/

    /*    // Delete Kth element

        ListNode kthElement = deletekthNode(headNode,5);
        System.out.println("Node deleted is: "+kthElement.val);*/

        // Delete by value
        ListNode nodeWithValue = deleteByValue(headNode,0);
        if(nodeWithValue!=null){
            elements = LLTraversal(headNode);
            lengthOfLL = getLengthOfLinkedList(headNode);
            System.out.println("Length of LinkedList after delete by value "+lengthOfLL);
            elements.stream().forEach(System.out::println);
        }else {
            System.out.println("Element not in linked List");
        }




    }

    private static ListNode deleteByValue(ListNode headNode, int expectedNum) {

        ListNode pointer1 =  headNode, pointer2=null;
        boolean gotValue = false;

        while (pointer1!=null){
          if(pointer1.val==expectedNum){
              gotValue = true;
               break;

           }else {
               pointer2=pointer1;
               pointer1=pointer1.next;
           }
        }
        if(gotValue){
            ListNode nodeToDelete = pointer1;
            pointer1=pointer1.next;
            pointer2.next=pointer1;

            nodeToDelete.next = null;

            return nodeToDelete;

        }else
            return null;


    }

    private static ListNode deletekthNode(ListNode headNode,int kthelet) {
        ListNode pointer1 =  headNode, pointer2=null;

        if(headNode.next==null)
            return deleteHeadNode(headNode);

        for(int i = 1;i<kthelet;i++){
            pointer2=pointer1;
            pointer1=pointer1.next;

        }

        ListNode nodeToDelete = pointer1;
        pointer1=pointer1.next;
        pointer2.next=pointer1;

        nodeToDelete.next = null;

        return nodeToDelete;

    }

    private static ListNode deleteTailNode(ListNode headNode) {

        ListNode pointer1 =  headNode, pointer2=null;

        if(headNode.next==null)
            return deleteHeadNode(headNode);

        while (pointer1.next!=null){
            pointer2=pointer1;
            pointer1=pointer1.next;
        }

        pointer2.next=null;
        System.out.println("New tail node is = "+pointer2.val);
        return pointer1;

    }

    private static ListNode deleteHeadNode(ListNode headNode) {

        ListNode pointer = headNode.next;

        headNode= null;

        return pointer;

    }

    private static int getLengthOfLinkedList(ListNode headNode) {

        int counter = 0;
        ListNode pointer = headNode;
        while (headNode!=null && pointer!=null){
            counter++;
            pointer=pointer.next;
        }
        return counter;
    }

    private static ListNode buildUpTheLinkedList(List<Integer> arr) {
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



    private static List<Integer> LLTraversal(ListNode head) {

        List<Integer> elements = new ArrayList<>();
        ListNode pointer = head;
        while (head!=null && pointer!=null){
            elements.add(pointer.val);
            pointer=pointer.next;
        }

        return elements;
    }

}
