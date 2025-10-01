public class Populasi {
    public static void main(String[] args) {
        long populasi = 312032486;
        int detikTiapTahun = 365*24*60*60;
        long totalDetik = (long) detikTiapTahun*5;

        long kelahiranTiapTahun = (long)(totalDetik/7.0);
        long kematianTiapTahun = (long)(totalDetik/13.0);
        long imigranTiapTahun = (long)(totalDetik/45.0);

        long total = populasi + kelahiranTiapTahun - kematianTiapTahun + imigranTiapTahun;

        System.out.println(total);
    }
}
