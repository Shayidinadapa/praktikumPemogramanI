package Tugas6;

public class StrukturList {

    private Node head;

    public void addTail(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    public void addHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void addMiddle(int data, int position) {
        Node newNode = new Node(data);
        if (head == null || position == 1) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node curNode = head;
            Node posNode = null;
            int i = 1;
            while (curNode != null && i < position) {
                posNode = curNode;
                curNode = curNode.getNext();
                i++;
            }
            if (curNode != null) {
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            } else {
                posNode.setNext(newNode);
            }
        }
    }

    public void removeTail() {
        if (head != null) {
            if (head.getNext() == null) {
                head = null;
            } else {
                Node lastNode = head;
                Node preNode = null;
                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
                preNode.setNext(null);
                dispose(lastNode);
            }
        } else {
            System.out.println("List Kosong");
        }
    }

    public void removeMid(int e) {
        Node preNode = new Node(0);
        Node tempNode;
        int i;
        boolean found;

        if (isEmpty()) {
            System.out.println("Elemen list kosong");
        } else {
            found = false;
            i = 1;
            tempNode = head;

            while (tempNode.getNext() != null && !found) {
                if (tempNode.getData() == e) {
                    found = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            if (found) {
                if (i == 1) {
                    head = null;
                } else {
                    preNode.setNext(tempNode.getNext());
                    dispose(tempNode);
                }
            }
        }
    }

    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node temp = head;
            head = head.getNext();
            dispose(temp);
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = head;
            while (curNode != null) {
                System.out.print(curNode.getData() + " ");
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }

    private void dispose(Node temp) {
        temp.setNext(temp);
        temp = null;
    }

    public boolean find(int x) {
        Node curNode = head;
        boolean found = false;
        while (curNode != null && !found) {
            if (curNode.getData() == x)
                found = true;
            else
                curNode = curNode.getNext();
        }
        return found;
    }

    public int size() {
        Node curNode = head;
        int count = 0;
        while (curNode != null) {
            count++;
            curNode = curNode.getNext();
        }
        return count;
    }

    public void clearList() {
        while (head != null) {
            Node temp = head;
            head = head.getNext();
            dispose(temp);
        }
    }
}
