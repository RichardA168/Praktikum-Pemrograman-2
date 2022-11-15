package praktikum4.soal1;

public class Buku {
    
    private String judul, penulis;
    private int tahun;
    
    public Buku(String j, String p, int t){
        judul = j;
        penulis = p;
        tahun = t;
    }
    
    public void setJudul(String judul){
        this.judul = judul;
    }
    public String getJudul(){
        return judul;
    }
    
    public void setPenulis(String penulis){
        this.penulis = penulis;
    }
    public String getPenulis(){
        return penulis;
    }
    
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
    public int getTahun(){
        return tahun;
    }
    
    public void display() {
        System.out.print("\nDetail buku: \nJudul adalah "+getJudul()+"\nPenulis adalah "+getPenulis()+"\nTahun Terbit adalah "+getTahun()+"\n");
    }
}
