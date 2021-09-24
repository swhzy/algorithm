package swh.algorithm.linkedlist.doubly;


public class DoublyLinkedList {





    private Node head = null;

    private void add(int data){
        if(head==null){
            head= new Node(data,null,null);
            return;
        }
        Node current = head;
        while (current!=null){
            if(current.getNext()!=null){
                current = current.getNext();
                continue;
            }
            current.next = new Node(data,current,null);
        }
    }


    private void remove(int data){
        if(head==null){
            return;
        }
        Node current = head;
        if(current!=null){

        }
    }



    class Node{
        private int data;

        private Node pre;
        private Node next;

        public Node(int data, Node pre, Node next) {
            this.data = data;
            this.pre = pre;
            this.next = next;
        }

        public Node() {
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getPre() {
            return pre;
        }

        public void setPre(Node pre) {
            this.pre = pre;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


}
