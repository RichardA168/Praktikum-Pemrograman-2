package praktikum4.soal1;
import java.util.Scanner;

public class soal1main {
    public static void main(String[] args) {
        
        String judul, penulis;
        int tahun;
   
        Scanner forPerson = new Scanner(System.in);
        
        System.out.print("Judul: ");
        judul = forPerson.nextLine();
        System.out.print("Penulis: ");
        penulis = forPerson.nextLine();
        System.out.print("Tahun Terbit: ");
        tahun = forPerson.nextInt();
        
        Buku dataBuku = new Buku(judul, penulis, tahun);
        dataBuku.display();
    }
}