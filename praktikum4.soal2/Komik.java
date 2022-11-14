package praktikum4.soal2;

class Komik extends Buku{
    
    private final int volume;
    private final String sinopsis;
    
    public Komik(String j, String p, String t, int v, String s){
        super.judul = j;
        super.penulis = p;
        super.tahun = Integer.valueOf(t);
        volume = v;
        sinopsis = s;
    }
    
    public String getKomikDetail(){
        return "\nData yang baru diinputkan adalah \nSebuah komik dengan judul \""+judul+"\". Komik tersebut dibuat oleh "+penulis+" dan diterbitkan pada tahun "+tahun+". Sampai saat ini komik tersebut memiliki jumlah volume sebanyak "+volume+" buah. \nSinopsis: "+sinopsis;
    }
}