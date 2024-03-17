package Tugas6;

public class ClearListTest {

	public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList myList = new StrukturList();
        
        // 2. Tambah elemen sehingga elemen list berisi (4, 3, 7, 8, 1, 9)
        myList.addTail(4);
        myList.addTail(3);
        myList.addTail(7);
        myList.addTail(8);
        myList.addTail(1);
        myList.addTail(9);
        
        // 3. Tampilkan elemen list
        System.out.print("List elements: ");
        myList.displayElement();
        System.out.println(); // New line for clarity
        
        // 4. Hapus semua elemen list
        myList.clearList();
        
        // 5. Tampilkan elemen list setelah dihapus
        System.out.print("List elements setelah clearing: ");
        myList.displayElement();
    }
    
}
