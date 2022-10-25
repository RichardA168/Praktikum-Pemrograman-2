package praktikum3.soal1;

import java.util.Scanner;
import java.util.LinkedList;

public class Soal1main {
    public static void main(String[]args){
        
        Scanner forPerson = new Scanner(System.in);
        LinkedList<Dadu> allDadu = new LinkedList<>();
        
        int d = forPerson.nextInt();
        int jumlah = 0;
        int sementara;
        
        for (int i=0;i<d;i++){
            allDadu.add(new Dadu());
        }
        
        for(int i=0;i<d;i++){
            sementara = allDadu.poll().getNilai();
            System.out.println("Dadu ke-"+(i+1)+" bernilai "+sementara);
            jumlah+=sementara;
        }
        
        System.out.println("Total nilai dadu keseluruhan "+jumlah);
        forPerson.close();
    }
}