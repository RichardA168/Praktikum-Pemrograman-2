package praktikum_pertama;

import java.util.Scanner;

public class PRAK105_2110817310016_RichardAlexander {
    public static void main(String[]args){
        Scanner forPerson = new Scanner(System.in);
        
        float r, t, Volume;
        final float phi = 3.14f;
        float input;
        
        System.out.print("Masukkan jari-jari: ");
        r = forPerson.nextFloat();
        
        System.out.print("Masukkan tinggi: ");
        t = forPerson.nextFloat();
        
        Volume = phi * (r * r) * t;
        System.out.println("Volume tabung dengan jari-jari "+r+" cm dan tinggi "+t+" adalah "+Volume+" m3");
    }
}