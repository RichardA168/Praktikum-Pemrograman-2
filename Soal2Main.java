package praktikum3.soal2;

import java.util.Scanner;
import java.util.LinkedList;

public class Soal2Main {
    static Scanner forPerson=new Scanner(System.in);
    
    public static Negara isiNegara(){
        String namaNegara, jenisNegara, namaPemimpin;
        int tglMerdeka, blnMerdeka, thnMerdeka;
        namaNegara=forPerson.nextLine();
        jenisNegara=forPerson.nextLine();
        namaPemimpin=forPerson.nextLine();
        if(Negara.negaraMonarki(jenisNegara)){
            return new Negara(namaNegara, jenisNegara, namaPemimpin);
        }
        tglMerdeka=forPerson.nextInt(); forPerson.nextLine();
        blnMerdeka=forPerson.nextInt(); forPerson.nextLine();
        thnMerdeka=forPerson.nextInt(); forPerson.nextLine();
        return new Negara(namaNegara, jenisNegara, namaPemimpin, tglMerdeka, blnMerdeka, thnMerdeka);
    }
    
    
    public static void main(String[] args) {
        LinkedList<Negara> allNegara=new LinkedList<>();
        int jumlahNegara;
        jumlahNegara=forPerson.nextInt();
        forPerson.nextLine();
        for(int i=0;i<jumlahNegara;i++){
            allNegara.add(isiNegara());
        }
        while(!allNegara.isEmpty()){
            allNegara.poll().displayStatus();
        }
        forPerson.close();
    }
}