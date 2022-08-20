package data_structure.linkedlist;

import java.util.Scanner;

class SLL {
    private Node head = null, tail = null; //only reference variable created which stores ref/address of objects
    private int size;

    public SLL() {
        this.size = 0;
    }

    private class Node { //private so nobody can access from outside this class
        int val;
        Node next;

        Node() {
        }

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst() {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        Node node = new Node();
        node.val = val;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        size += 1;
    }

    void display() {
        if(head==null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head; //temp pointing to same obj as head
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println(" End");
    }
}

public class SinglyLL {
    public static void main(String[] args) {
        SLL l = new SLL();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Choose from the option Menu:-");
            System.out.println("0.Exit\n1.Display\n2.Insert At First\n3.Delete At First");
            int option = s.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Exit...");
                    return;
                case 1:
                    l.display();
                    break;
                case 2:
                    System.out.print("Enter the no of items:");
                    int times = s.nextInt();
                    for (int i = 0; i < times; i++) {
                        l.insertFirst();
                    }
                    break;
                default:
                    System.out.println("Enter a Valid option from option menu");
            }
        }
    }
}
