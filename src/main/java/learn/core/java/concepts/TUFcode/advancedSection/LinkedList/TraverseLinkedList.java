package learn.core.java.concepts.TUFcode.advancedSection.LinkedList;

import java.util.Arrays;
import java.util.List;

public class TraverseLinkedList {

  ListNode headNode,pointer;

    public static void main(String[] args) {
        LinkListManager manager = new LinkListManager();

        List<Integer> arr = Arrays.asList(5, 4, 3, 1, 0);
        ListNode headNode =   manager.initTheLinkedList(arr);
        List<Integer> elements = manager.travereLinkList(headNode);
        int lengthOfLL = manager.getLengthOfLinkedList(headNode);
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
            elements = manager.travereLinkList(headNode);
            lengthOfLL = manager.getLengthOfLinkedList(headNode);
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

}
