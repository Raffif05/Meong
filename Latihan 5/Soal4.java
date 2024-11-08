import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Harga tiket 
        int hargaJakarta = 145000;
        int hargaBogor = 200000;
        int hargaGarut = 75000;
        int hargaPurwakarta = 75000;

        System.out.println("Pilih kota tujuan:");
        System.out.println("1. Jakarta");
        System.out.println("2. Bogor");
        System.out.println("3. Garut");
        System.out.println("4. Purwakarta");

        // kota tujuan
        System.out.print("Masukkan nomor kota tujuan (1-4): ");
        int pilihanKota = scanner.nextInt();

        // jumlah penumpang 
        System.out.print("Masukkan jumlah penumpang: ");
        int jumlahPenumpang = scanner.nextInt();

        String kotaTujuan = "";
        int hargaPerOrang = 0;
        boolean promo = false;

        switch (pilihanKota) {
            case 1:
                kotaTujuan = "Jakarta";
                hargaPerOrang = hargaJakarta;
                break;
            case 2:
                kotaTujuan = "Bogor";
                hargaPerOrang = hargaBogor;
                promo = true; // Promo untuk Bandung-Bogor
                break;
            case 3:
                kotaTujuan = "Garut";
                hargaPerOrang = hargaGarut;
                break;
            case 4:
                kotaTujuan = "Purwakarta";
                hargaPerOrang = hargaPurwakarta;
                break;
            default:
                System.out.println("Nomor kota tujuan tidak valid.");
                return;
        }

        int totalHarga = hargaPerOrang * jumlahPenumpang;

        if (promo && totalHarga > 250000) {
            totalHarga -= totalHarga * 0.10; // Diskon 10%
            System.out.println("Selamat! Anda mendapat diskon 10%");
        }

        System.out.println("Tujuan: " + kotaTujuan);
        System.out.println("Jumlah penumpang: " + jumlahPenumpang);
        System.out.println("Harga tiket per orang: Rp " + hargaPerOrang);
        System.out.println("Total harga tiket: Rp " + totalHarga);

    }
}
