package praktikum_pertama;

import java.util.Scanner;

public class PRAK104_2110817310016_RichardAlexander {
    public static void main(String[]args){
        Scanner forPerson = new Scanner(System.in);
        int inputNo1, inputNo2, inputNo3, inputNo4, inputNo5, inputNo6;
        
        System.out.print("Kartu Andi: ");
        inputNo1 = forPerson.nextInt();
        inputNo2 = forPerson.nextInt();
        inputNo3 = forPerson.nextInt();
        
        System.out.print("Kartu Budi: ");
        inputNo4 = forPerson.nextInt();
        inputNo5 = forPerson.nextInt();
        inputNo6 = forPerson.nextInt();
        
        int[]kartuAndi = {inputNo1, inputNo2, inputNo3};
        int[]kartuBudi = {inputNo4, inputNo5, inputNo6};
        int hasilKartuAndi = 0, hasilKartuBudi = 0;
        
        for (int i=0;i<3;i++){
            if (kartuAndi[i]>kartuBudi[i]){
                hasilKartuAndi++;
            } else if (kartuAndi[i]<kartuBudi[i]){
                hasilKartuBudi++;
            }
        }
        
        if (hasilKartuAndi>hasilKartuBudi) {
            System.out.print("Hasilnya adalah Andi menang!");
        } else if (hasilKartuAndi==hasilKartuBudi) {
            System.out.print("Hasilnya adalah seri!");
        } else System.out.print("Hasilnya adalah Budi Menang!");
        
    }
}