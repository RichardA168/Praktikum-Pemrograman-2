package PRAK201_2110817310016_RichardAlexander;

public class Buah {
    
    String namaMangga;
    int jumlahBeli, harga;
    float berat;
    
    public Buah(String nama, int jumlahnya, float beratnya, int harganya) {
        namaMangga = nama;
        jumlahBeli = jumlahnya;
        berat = beratnya;
        harga = harganya;
    }
    
    public void displayStatus() {
        System.out.println("Nama Mangga : Mangga " + namaMangga);
        System.out.println("Berat : " + berat + " kg");
        System.out.println("Jumlah Beli : " + jumlahBeli);
        System.out.println("Total Berat : " + berat*jumlahBeli + " kg");
        System.out.println("Total harga : Rp. " + harga*jumlahBeli + ",-");
    }
}