package praktikum_pertama;

import java.util.Scanner;

public class PRAK102_2110817310016_RichardAlexander {
    public static void main(String[] args){
        Scanner forPerson = new Scanner(System.in);
            int x = 0;
            int input = forPerson.nextInt();
            
            while (x <= 6) {
                int y = 0;
                if (input % 2 == 0){
                    y = (input / 2) -1;
                    System.out.print(y + ", ");
                } else {
                    System.out.print(input + ", ");
                } 
                input++;
                x++;
            }
    }
}