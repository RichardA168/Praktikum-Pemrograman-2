package praktikum3.soal1;

public class Dadu {
    
    private int nilai;

    public Dadu(){
        this.acakNilai();
    }
    
    public void acakNilai(){
        this.nilai=(int)(1+Math.random()*(6));
    }
    
    public int getNilai(){
        return this.nilai;
    }
}