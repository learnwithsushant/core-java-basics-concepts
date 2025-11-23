package learn.core.java.concepts.TUFcode.advancedSection.LinkedList;

import java.util.Arrays;
import java.util.List;

import static learn.core.java.concepts.TUFcode.advancedSection.LinkedList.LinkListManager.*;

public class LinkedListInsertionAtHead {
    public static void main(String[] args) {

        LinkListManager manager = new LinkListManager();

        List<Integer> arr = Arrays.asList(5, 4, 3, 1, 0);
        ListNode headNode =   manager.initTheLinkedList(arr);
        List<Integer> elements = manager.travereLinkList(headNode);
        int lengthOfLL = manager.getLengthOfLinkedList(headNode);

        headNode = addNewElement(headNode,5);


    }

    private static ListNode addNewElement(ListNode headNode, int i) {

        ListNode  newheadNode = new ListNode(i);
        newheadNode.next = headNode;
        return newheadNode;

    }


}
