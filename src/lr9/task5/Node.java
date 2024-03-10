package lr9.task5;

import java.util.Scanner;

public class Node {
    int data;
    Node next;
    Node before;
    public static Node head = null;
    public static Node tail = null;

    public Node(int data, Node next, Node before) {
        this.data = data;
        this.next = next;
        this.before = before;
    }

    public static Node reader() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int value = scanner.nextInt();
            Node newNode = new Node(value, null, null);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.before = tail;
                tail = newNode;
            }
        }

        return head;
    }

    public static void createHead(Node head) {
        Node current = head;
        while (current != null) {
            current = current.next;
        }
    }

    public static void createTail(Node tail) {
        Node current = tail;
        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            current = current.before;
        }
    }

    public static void addFirst(int number) {
        head = new Node(number, head, null);
    }

    public static void printList() {
        Node t = head;
        while (t != null) {
            System.out.println(t.data + " ");
            t = t.next;
        }
    }
}
