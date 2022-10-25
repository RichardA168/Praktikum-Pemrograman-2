package praktikum3.soal2;
import java.util.HashMap;

public class Negara {
    private HashMap<Integer, String> bulan=new HashMap<Integer, String>();
    private String namaNegara, jenisNegara, namaPemimpin;
    private int tglMerdeka, thnMerdeka;
    private Integer blnMerdeka;
    
    private void BULAN(){
        this.bulan.put(1, "Januari");
        this.bulan.put(2, "Februari");
        this.bulan.put(3, "Maret");
        this.bulan.put(4, "April");
        this.bulan.put(5, "Mei");
        this.bulan.put(6, "Juni");
        this.bulan.put(7, "Juli");
        this.bulan.put(8, "Agustus");
        this.bulan.put(9, "September");
        this.bulan.put(10, "Oktober");
        this.bulan.put(11, "November");
        this.bulan.put(12, "Desember");
    }
    
    public Negara(String namaNegara, String jenisNegara, String namaPemimpin, int tglMerdeka, Integer blnMerdeka, int thnMerdeka){
        this.namaNegara = namaNegara;
        this.jenisNegara = jenisNegara;
        this.namaPemimpin = namaPemimpin;
        this.tglMerdeka = tglMerdeka;
        this.blnMerdeka = blnMerdeka;
        this.thnMerdeka = thnMerdeka;
        BULAN();
    }
    
    public Negara(String namaNegara, String jenisNegara, String namaPemimpin){
        this.namaNegara = namaNegara;
        this.jenisNegara = jenisNegara;
        this.namaPemimpin = namaPemimpin;
        BULAN();
    }
    
    public void setNamaNegara(String namaNegara) {
        this.namaNegara = namaNegara;
    }
    
    public String getNamaNegara() {
        return namaNegara;
    }

    public void setJenisNegara(String jenisNegara) {
        this.jenisNegara = jenisNegara;
    }

    public String getJenisNegara() {
        return jenisNegara;
    }

    public void setNamaPemimpin(String namaPemimpin) {
        this.namaPemimpin = namaPemimpin;
    }

    public String getNamaPemimpin() {
        return namaPemimpin;
    }

    public int getTglMerdeka() {
        return tglMerdeka;
    }

    public int getThnMerdeka() {
        return thnMerdeka;
    }
    
    public int getBlnMerdeka(){
        return this.blnMerdeka;//intValue()
    }

    public String getStringBlnMerdeka() {
        return this.bulan.get(this.blnMerdeka);
    }

    public void setBlnMerdeka(Integer blnMerdeka) {
        this.blnMerdeka = blnMerdeka;
    }
    
    public static boolean negaraMonarki(String jenisNegara){
        return jenisNegara.equalsIgnoreCase("monarki");
    }
    
    public void displayStatus(){
        System.out.print("Negara "+this.namaNegara+" mempunyai ");
        if(negaraMonarki(this.jenisNegara)){
            System.out.print("Raja");
        }else{
            System.out.print(this.jenisNegara);
        }
        System.out.print(" bernama "+namaPemimpin+"\n");
        if(negaraMonarki(this.jenisNegara)){
            System.out.print("\n");
            return;
        }
        System.out.print("Deklarasi Kemerdekaan pada Tanggal "+this.tglMerdeka+" "+this.getStringBlnMerdeka()+" "+this.thnMerdeka);
    }
}