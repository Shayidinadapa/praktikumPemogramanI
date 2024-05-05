package Pertemuan10;

public class StackMain {

	public static void main(String[] args) {
        // Membuat objek StrukturStack dengan kapasitas 3
        StrukturStack stack = new StrukturStack(3);

//        // Sebelum push
//        System.out.println("#Sebelum push");
//        System.out.println("Size: " + stack.size());
//        System.out.println("Empty: " + stack.isEmpty());
//        System.out.println("Full: " + stack.isFull());
//        System.out.println("Top: " + stack.top());
//        stack.displayElements();
//
//        // Melakukan push 3x
//        System.out.println("#Melakukan push 3x:");
//        stack.push(2);
//        stack.push(4);
//        stack.push(1);
//
//        // Setelah push 3x
//        System.out.println("Size: " + stack.size());
//        System.out.println("Empty: " + stack.isEmpty());
//        System.out.println("Full: " + stack.isFull());
//        System.out.println("Top: " + stack.top());
//        stack.displayElements();


            // Melakukan push 3x
            System.out.println("#Melakukan push 3x:");
            stack.push(2);
            stack.push(4);
            stack.push(1);

            // Setelah push 3x
            System.out.println("Size: " + stack.size());
            System.out.println("Empty: " + stack.isEmpty());
            System.out.println("Full: " + stack.isFull());
            System.out.println("Top: " + stack.top());
            System.out.print("Elemen from TOP:");
            stack.displayElements();

            // Melakukan pop 1x
            System.out.println("\n#Melakukan pop 1x:");
            stack.pop();

            // Setelah pop 1x
            System.out.println("Size: " + stack.size());
            System.out.println("Empty: " + stack.isEmpty());
            System.out.println("Full: " + stack.isFull());
            System.out.println("Top: " + stack.top());
            System.out.print("Elemen from TOP:");
            stack.displayElements();

    }
    
}
