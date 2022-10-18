package PRAK202_2110817310016_RichardAlexander;

public class Mobil {
    String merek, tahun_keluaran, Pemilik;
    int kapasitas, harga;
    long Pajak;
    
    public void setPemilik(String namaPemilik) {
        this.Pemilik = namaPemilik;
    }
           
    public String getPemilik(){
        return Pemilik;
    }
    
    public void setPajak(int pajakMobil){
        this.Pajak = pajakMobil;
    }
        
    public long getPajak(){
        return Pajak;
    }

    public void info(){
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Harga: Rp. " + harga);
        System.out.println("Tahun Keluaran: " + tahun_keluaran);
        System.out.println("Kapasitas: " + kapasitas + "cc");
        Pajak =(long)(harga*0.02);
    }
}