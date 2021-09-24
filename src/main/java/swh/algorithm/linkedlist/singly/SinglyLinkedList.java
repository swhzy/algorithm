package swh.algorithm.linkedlist.singly;

import com.alibaba.fastjson.JSON;

public class SinglyLinkedList {


    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.add(2);
        singlyLinkedList.add(2);
        /*singlyLinkedList.add(3);*/

        System.out.println(JSON.toJSONString(singlyLinkedList));
        singlyLinkedList.remove(-1);
        singlyLinkedList.remove(2);

        System.out.println(JSON.toJSONString(singlyLinkedList));
    }

    private Node head = new Node(-1,null);



    public void add(int data){
        Node current = head;
        while (current.next!=null){
            current = current.next;
        }
        current.next= new Node(data,null);
    }


    public void remove(int data){
        if(head.next==null){
            return;
        }
        Node current = head;
        while (true){
            if(current.getNext()==null){

                break;
            }
            if(current.getNext().getData()== data){
                current.next=current.getNext().getNext();
            }else {
                current = current.getNext();
            }

        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    class Node{
        private int data;

        private Node next;

        public Node(int data, Node next) {
            this.data = data;
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

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
