package praktikum4.soal1;

public class Buku {
    
    private String judul, penulis;
    private int tahun;
    
    public Buku(String j, String p, int t){
        judul = j;
        penulis = p;
        tahun = t;
    }
    
    public void display() {
        System.out.print("\nDetail buku: \nJudul adalah "+judul+"\nPenulis adalah "+penulis+"\nTahun Terbit adalah "+tahun+"\n\n");
    }
}