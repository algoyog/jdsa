import org.algoyog.ds.linkedlist.LinkedList;
import org.algoyog.ds.linkedlist.Node;
import org.algoyog.ds.linkedlist.SinglyLinkedList;

//TODO: Write proper tests
//TODO: use lambdas and modernize the code
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from java");
        testLL();

    }
    static void  testLL(){
        Node n1 = new Node(1);
        LinkedList s = new SinglyLinkedList(n1);
        for(int i = 2;i<=10; i++){
            s.insert(new Node(i));
        }
        s.print();
        s.delete(91);
        s.print();
    }

}
