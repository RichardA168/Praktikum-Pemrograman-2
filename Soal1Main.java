package PRAK201_2110817310016_RichardAlexander;

public class Soal1Main {
    
        public static void main(String[] args){
        
        Buah Arumanis = new Buah("Arumanis", 13, 0.3f, 5000);
        Buah Manalagi = new Buah("Manalagi", 17, 0.5f, 7500);
        Buah Madu = new Buah("Madu", 12, 0.375f, 6500);
        
        Arumanis.displayStatus();
        System.out.println("");
        Manalagi.displayStatus();
        System.out.println("");
        Madu.displayStatus();
        System.out.println("");
    }
}