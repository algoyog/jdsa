package org.algoyog.ds.linkedlist;

public interface LinkedList {
    /*
    public :
        SinglyLinkedList(Node* first);
        Node* insert(Node* input);
        bool deleteNode(int nodeNo);
        Node* searchForVal(int val); //TODO: Needs upgrade to generics
        //TODO: Define an iterator with fn to return the iterator
        void print();
     */

    Node insert(Node input);
    void print();

    boolean delete(int nodeNo);

}
