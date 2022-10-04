package praktikum_pertama;

import java.util.Scanner;

public class PRAK101_2110817310016_RichardAlexander {
    public static void main(String[] args){
        Scanner forPerson = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = forPerson.nextLine();
        
        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = forPerson.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = forPerson.nextInt();
        
        System.out.print("Masukkan Bulan Lahir: ");
        int bulan = forPerson.nextInt();
        String namaBulan = null;
        if (bulan == 1) namaBulan = "Januari";
        else if (bulan == 2) namaBulan = "Februari";
        else if (bulan == 3) namaBulan = "Maret";
        else if (bulan == 4) namaBulan = "April";
        else if (bulan == 5) namaBulan = "Mei";
        else if (bulan == 6) namaBulan = "Juni";
        else if (bulan == 7) namaBulan = "Juli";
        else if (bulan == 8) namaBulan = "Agustus";
        else if (bulan == 9) namaBulan = "September";
        else if (bulan == 10) namaBulan = "Oktober";
        else if (bulan == 11) namaBulan = "November";
        else if (bulan == 12) namaBulan = "Desember";
        
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = forPerson.nextInt();
        
        System.out.print("Masukkan Tinggi Badan: ");
        float tinggiBadan = forPerson.nextFloat();
        
        System.out.print("Masukkan Berat Badan: ");
        float beratBadan = forPerson.nextFloat();
        
        System.out.println("Data Telah Ditambahkan,\nNama Lengkap "+namaLengkap+", Lahir di "+tempatLahir+" pada Tanggal "+tanggalLahir+" "+namaBulan+" "+tahunLahir+"\nTinggi Badan "+tinggiBadan+" cm dan Berat Badan "+beratBadan+" kilogram");
    }
}