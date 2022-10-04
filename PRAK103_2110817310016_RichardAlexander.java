package praktikum_pertama;

import java.util.Scanner;

public class PRAK103_2110817310016_RichardAlexander {
    public static void main(String[] args){
        Scanner forPerson = new Scanner(System.in);
        
        int input = forPerson.nextInt();
        int x = 0;
       
        do{
            if(input % 7 == 0){
                continue;
            }
            if(x == 5) System.out.print(input);
            else System.out.print(input + ", ");
            x++;
            input--;
            
        } while(x<=4);
    }
}