package com.yogesh.linkedlist;

public class LL {
    static Node head , tail;
    static  int size;
    LL(){
        this.size=0;
    }
    public static class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
        Node(int value, Node next){
            this.value = value;
            this.next= next;
        }
    }

    static void insertFirst(int val){

        Node node= new Node(val);
        node.next= head;
        head = node;
        if(tail == null){
            tail= head;
        }
        size+=1;
    }
    static void insertLast(int val){
        if( tail == null){
            insertFirst(val);
            return;
        }
        Node node =new Node(val);
        tail.next = node;
        tail=node;
        size=+1;
    }
    static void display(){
        Node temp= head;
        while(temp != null){
            System.out.print(temp.value + "--->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    static void main() {
        LL list=new LL();
//        list.insertFirst(3);
//        list.insertLast(23);
//        list.insertFirst(33);
//        list.insertFirst(32);
//        list.insertLast(44);
        list.insertLast(3);
        list.insertLast(33);
        list.insertLast(331);
        list.insertLast(3333);
        list.display();
        System.out.println(size);
    }
}
