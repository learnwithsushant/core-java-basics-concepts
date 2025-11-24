package learn.core.java.concepts.TUFcode.advancedSection.LinkedList;

import java.util.Arrays;
import java.util.List;

public class LinkedListInsertionOperation {
    public static void main(String[] args) {

        LinkListManager manager = new LinkListManager();

        List<Integer> arr = Arrays.asList(5, 4, 3, 1, 0);
        ListNode headNode =   manager.initTheLinkedList(arr);
        List<Integer> elements = manager.travereLinkList(headNode);
        int lengthOfLL = manager.getLengthOfLinkedList(headNode);

        headNode = addNewHeadElement(headNode,5);

        lengthOfLL = manager.getLengthOfLinkedList(headNode);

        System.out.println("New length of LinkedList is %s".formatted(lengthOfLL));

        headNode = insertAtTailNode(headNode,17);

        lengthOfLL = manager.getLengthOfLinkedList(headNode);

        System.out.println("New length of LinkedList is %s".formatted(lengthOfLL));


    }

    private static ListNode addNewHeadElement(ListNode headNode, int i) {

        ListNode  newheadNode = new ListNode(i);
        newheadNode.next = headNode;
        return newheadNode;

    }

    private static ListNode insertAtTailNode(ListNode headNode, int value) {

        ListNode pointer1 =  headNode;
        ListNode  newtailNode = new ListNode(value);

        if(headNode==null){
            headNode= newtailNode;
            return headNode;
        } else if (headNode.next==null){
         headNode.next= newtailNode;
         return headNode;
        }


        while (pointer1.next!=null){

            pointer1=pointer1.next;
        }

        pointer1.next=newtailNode;

        return headNode;

    }


}
