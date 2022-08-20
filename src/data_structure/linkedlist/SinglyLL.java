package data_structure.linkedlist;

import java.util.Scanner;

class SLL {
    private Node head = null, tail = null; //only reference variable created which stores ref/address of objects
    public int size;

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

    public Node createNode() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value: ");
        int val = s.nextInt();
        Node node = new Node();
        node.val = val;
        node.next = null;
        return node;
    }

    public void insertFirst() {
        Node node = createNode();
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void insertLast() {
        Node node = createNode();
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void insertPosition() {
        System.out.println("Enter the Position");
        Scanner scn = new Scanner(System.in);
        int position = scn.nextInt();
        if (position < 0 || position > size) {
            System.out.println("Invalid Position\n");
            return;
        }
        if (position == 0) {
            insertFirst();
            return;
        }
        if (position == size) {
            insertLast();
            return;
        }
        Node temp = head;
        for (int count = 1; count != position; count++) {
            temp = temp.next;
            count++;
        }
        Node node = createNode();
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    void display() {
        if (head == null) {
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
            System.out.println("0.Exit\n1.Display\n2.Size of Linked List\n3.Insert At First\n" +
                    "4.Insert at Last\n5.Insert At Position\nDelete At First");
            int option = s.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Exit...");
                    return;
                case 1:
                    l.display();
                    break;
                case 2:
                    System.out.println(l.size + " Elements.");
                    break;
                case 3:
                    System.out.print("Enter the no of items:");
                    int t1 = s.nextInt();
                    for (int i = 0; i < t1; i++) {
                        l.insertFirst();
                    }
                    break;
                case 4:
                    System.out.print("Enter the no of items:");
                    int t2 = s.nextInt();
                    for (int i = 0; i < t2; i++) {
                        l.insertLast();
                    }
                    break;
                case 5:
                    System.out.print("Enter the no of items:");
                    int t3 = s.nextInt();
                    for (int i = 0; i < t3; i++) {
                        l.insertPosition();
                    }
                    break;
                default:
                    System.out.println("Enter a Valid option from option menu");
            }
        }
    }
}
