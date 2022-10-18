package PRAK203_2110817310016_RichardAlexander;

public class Soal3Main {
    public static void main(String[] args) {
            Pegawai p1 = new Pegawai();
            
            //kurang tanda ; pada p1.nama = "Roi"
            //ubah menjadi p1.nama = "Roi";
            
            p1.nama = "Roi";
            p1.asal = "Kingdom of Orvel";
            p1.setJabatan("Assasin");
            
            //karena pada soal memerlukan output umur, maka tambahkan variabel umur
            //tambahkan p1.umur = 17;
            
            p1.umur = 17;
            
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur);
    }
}
