package Pertemuan9;

public class QueueMain {

//  public static void main(String[] args) {
//  StrukturQueue queue = new StrukturQueue();
//
//  // Sebelum enqueue 3x
//  System.out.println("## Sebelum Enqueue 3x ##");
//  System.out.println("size: " + queue.size());
//  System.out.println("isEmpty: " + queue.isEmpty());
//
//  // Enqueue 3x
//  System.out.println("### Enqueue 3x ###");
//  queue.enqueue(3);
//  queue.enqueue(2);
//  queue.enqueue(1);
//
//  // Setelah enqueue 3x
//  System.out.println("size: " + queue.size());
//  System.out.println("isEmpty: " + queue.isEmpty());
//  System.out.println("Front: " + queue.front());
//}

//  public static void main(String[] args) {
//  StrukturQueue antrian = new StrukturQueue();
//
//  // Sebelum enqueue 4x
//  System.out.println("* Sebelum Enqueue 4x #**");
//  System.out.println("size: " + antrian.size());
//  System.out.println("isEmpty: " + antrian.isEmpty());
//  antrian.displayElements();
//
//  // Enqueue 4x
//  System.out.println("## Enqueue 4x #*");
//  antrian.enqueue(2);
//  antrian.enqueue(7);
//  antrian.enqueue(6);
//  antrian.enqueue(1);
//
//  // Setelah enqueue 4x
//  System.out.println("size: " + antrian.size());
//  System.out.println("isEmpty: " + antrian.isEmpty());
//  System.out.print("Elemen Queue: ");
//  antrian.displayElements();
//  System.out.println("Front: " + antrian.front());
//}
	
	public static void main(String[] args) {
        StrukturQueue antrian = new StrukturQueue();

        // Sebelum enqueue 3x
        System.out.println("## Sebelum Enqueue 3x ##");
        System.out.println("size: " + antrian.size());
        System.out.println("isEmpty: " + antrian.isEmpty());

        // Enqueue 3x
        System.out.println("### Enqueue 3x ###");
        antrian.enqueue(1);
        antrian.enqueue(2);
        antrian.enqueue(3);

        // Setelah enqueue 3x
        System.out.println("size: " + antrian.size());
        System.out.println("isEmpty: " + antrian.isEmpty());
        System.out.println("Front: " + antrian.front());

        // Dequeue
        System.out.println("### Dequeue ###");
        int removedElement = antrian.dequeue();
        System.out.println("Elemen yang dihapus: " + removedElement);
        System.out.println("size: " + antrian.size());
        System.out.println("isEmpty: " + antrian.isEmpty());
        System.out.print("Elemen Queue: ");
        antrian.displayElements();
        System.out.println("Front: " + antrian.front());
    }
}

