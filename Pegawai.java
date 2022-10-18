package PRAK203_2110817310016_RichardAlexander;

//class yang digunakan adalah Pegawai, bukan Employee
//sehingga class Employee tidak dapat berfungsi pada Soal3Main
//ganti class tersebut menjadi public class Pegawai {

    public class Pegawai {
        
        //Penggunaan tipe data char tidak tepat
        //hal ini karena char hanya bisa menampung satu huruf
        //ubah public char asal; menjadi public String asal;
        //karena ada variabel yang tipe datanya sama,
        //kita dapat menggabungnya menjadi satu, seperti berikut
        
        public String nama, asal, jabatan;
        public int umur;
        
        public String getNama() {
            return nama;
        }
        public String getAsal() {
            return asal;
        }
        
        //error karena variabel j belum diberi parameter sehingga tidak dapat diidentifikasi
        //tambahkan String j dalam parameter setJabatan()
        //public void setJabatan(){
        //diubah menjadi
        //public void setJabatan(String j){
        
        public void setJabatan(String j){
            this.jabatan = j;
        }
}