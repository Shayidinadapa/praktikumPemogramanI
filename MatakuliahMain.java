package Pertemuan7;


public class MatakuliahMain {
    public static void main(String[] args) {
        ListMatakuliah list = new ListMatakuliah();
//      Latihan 4
//        list.addHead(new Matakuliah("IF001", "Dasar Pemrograman", 4));
//        list.addHead(new Matakuliah("IF002", "Pemrograman Web", 3));
//        list.displayElement();
        
//      Tes-1
//        list.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi", 3));
//        list.addHead(new Matakuliah("IF003", "Struktur Diskrit", 3));
//        list.addHead(new Matakuliah("IF002", "Pemrograman Web", 3));
//        list.addHead(new Matakuliah("IF001", "Dasar Pemrograman", 4));
//        list.displayElement();
    
    
    
//    Tes-4
        list.addTail(new Matakuliah("IF001", "Dasar Pemrograman", 4));
        list.addMiddle(new Matakuliah("IF002", "Pemrograman Web", 3), 2);
        list.addMiddle(new Matakuliah("IF003", "Struktur Diskrit", 3), 1);
        list.addHead(new Matakuliah("IF004", "Konstruksi PL Berorientasi Objek", 3));
        list.displayElement();
        
   
    } 
}
