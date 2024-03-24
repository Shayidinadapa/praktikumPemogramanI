package Pertemuan7;

public class ListMatakuliah {
    private Node HEAD;

    public ListMatakuliah() {
        this.HEAD = null;
    }


    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
    
    
    public void addMiddle(Matakuliah data, int position) {
    Node newNode = new Node(data);
    
    if (HEAD == null || position == 1) {
        newNode.setNext(HEAD);
        HEAD = newNode;
    } else {
        Node curNode = HEAD;
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

    
    public void addTail(Matakuliah data) {

    Node newNode = new Node(data);
    
    if (isEmpty()) {
        HEAD = newNode;
    } else {
        Node curNode = HEAD;
        while (curNode.getNext() != null) {
            curNode = curNode.getNext();
        }
        curNode.setNext(newNode);
    }
}

    

public void displayElement() {
    if (isEmpty()) {
        System.out.println("List Kosong");
    } else {
        Node curNode = HEAD;
        while (curNode != null) {
            Matakuliah mataKuliah = curNode.getData();
            System.out.println("Matakuliah: " + mataKuliah.getKode() + ", " + mataKuliah.getNama() + ", " + mataKuliah.getSks());
            curNode = curNode.getNext();
        }
    }
    System.out.println();
}


    
}


