package org.algoyog.ds.linkedlist;

public class SinglyLinkedList implements LinkedList{
    Node start = null;

    public SinglyLinkedList(Node in){
        this.start = in;
    }
    @Override
    public Node insert(Node input) {
        if(start == null)
            start = input;
        else{
            Node curr = start;
            while (true){
                if(curr.next==null){
                    curr.next = input;
                    break;
                }else{
                    curr = curr.next;
                }
            }
        }
        return null;
    }

    @Override
    public void print() {
        Node curr = start;
        System.out.println("\n");
        while (curr.next!=null){
            System.out.print(curr.val + "  ");
            curr = curr.next;
        }
        System.out.println("\n");
    }

}
