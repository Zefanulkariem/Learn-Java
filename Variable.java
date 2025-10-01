public class Variable {
    // public static void main(String[] args) {
        
    //     // cara 1
    //     String nama;
    //     nama = "Rafly Aditya Ray";

    //     // cara 2
    //     int umur = 18;
    //     String alamat = "Bandung";

    //     // cara 3 var
    //     var makanKesukaan = "Mie Ayam";

    //     // final/constanta
    //     final String application = "Belajar Java";

    //     System.out.println("Nama: " + nama);
    //     System.out.println("Umur: " + umur);
    //     System.out.println("Alamat: " + alamat);
    //     System.out.println("Makanan Kesukaan: " + makanKesukaan);
    //     System.out.println("Subjek: " + application);
    // }

    // public static void main(String[] args) {
    //     double hasil = (7.5 * 6.5 - 4.5 * 3) / (47.5 - 5.5);
    //     System.out.println("Output: " + hasil);
    // }

    // public static void main(String[] args) {
    //     int umur = 20;
    //     double tinggi = 175.5;
    //     String nama = "Andi";

    //     System.out.println("Nama: " + nama);
    //     System.out.println("Umur: " + umur + " tahun");
    //     System.out.println("Tinggi: " + tinggi + " cm");
    // }

    // public static void main(String[] args) {
    //     int nilai = 0;
    //     for (int i = 1; i <= 10; i++) {
    //         nilai += i;
    //     }
    //     System.out.println("Hasil penjumlahan deret adalah: " + nilai);
    // }

    // ============================================================================================

    // public static void main(String[] args) {
        
    //     int barisKursi, kursi;

    //     barisKursi = 7;
    //     kursi = 8;

    //     System.out.println("Total kursi di kelas: " + barisKursi*kursi + " Kursi");
        
    // }

    // public static void main(String[] args) {
        
    //     int menit;

    //     menit = 5;

    //     System.out.println("Lama lagu dari " + menit + " menit adalah: " + menit*60 + " detik");
    // }

    // public static void main(String[] args) {
        
    //     int permen, teman, div, mod;

    //     permen = 17;
    //     teman = 3;
        
    //     div = permen/teman;
    //     mod = permen%teman;

    //     System.out.println("Setiap teman = " + div + " Permen");
    //     System.out.println("Sisa = " + mod + " Permen");
    // }

    // public static void main(String[] args) {
        
    //     int hargaTiket, jmlTiket;

    //     hargaTiket = 15000;
    //     jmlTiket = 8;

    //     System.out.println("Total harga tiket yang harus dibayar: Rp." + hargaTiket*jmlTiket);
    // }

    // public static void main(String[] args) {
        
    //     int panjang, lebar;

    //     panjang = 5;
    //     lebar = 5;

    //     System.out.println("Luas persegi panjang dari panjang " + panjang + " dan lebar " + lebar + " adalah: " + panjang*lebar);
    // }

    // public static void main(String[] args) {
        
    //     int totalDetik, jam, jamSisa, menit, detik;

    //     totalDetik = 7299;

    //     jam = totalDetik / 3600;
    //     jamSisa = totalDetik % 3600;

    //     menit = jamSisa / 60;
    //     detik = jamSisa % 60;

    //     System.out.println(jam + " " + menit + " " + detik);
    // }

    public static void main(String[] args){
        int y, x, z, a;
        x = 1;
        y = 2;
        z = 3;

        a = y;
        y = x;
        x = z;
        z = a;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

}
