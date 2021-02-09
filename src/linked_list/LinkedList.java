package linked_list;

public class LinkedList {

    Node head;
  /*  int value;
    Node next;*/

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode("abc");
        linkedList.addNode("def");
        linkedList.addNode("123");
        linkedList.traverse();
        linkedList.deleteNode("abc");
        linkedList.traverse();
    }

    public Node getHead() {
        return head;
    }

    /* LinkedList(int node){
         value = node;
         next = null;
     }*/
    private void deleteNode(String abc) {
        if (head.data.equals(abc)) {
            head = head.next;
        } else {
            Node top = head;
            while (top.next.data.equals(abc)) {
                top = top.next;
            }
            top.next = top.next.next;
        }
    }

    private void traverse() {
        Node top = head;
        while (top != null) {
            top = top.next;
        }
    }

    private void addNode(String abc) {

        Node n = getNode(abc);
        Node top = head;
        if (top == null) {
            head = n;
        } else {
            while (top.next != null) {
                top = top.next;
            }
            top.next = n;
        }

    }

    private Node getNode(String data) {
        Node s = new Node(data, null);
        return s;
    }

    public int size() {
        int count = 0;
        Node top = head;
        while (top != null) {
            top = top.next;
            count++;
        }
        return count;

    }
}
