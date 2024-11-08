import java.util.Scanner;

public class Soal3 {
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

        //kota tujuan
        System.out.print("Masukkan nomor kota tujuan (1-4): ");
        int pilihanKota = scanner.nextInt();

        //jumlah penumpang 
        System.out.print("Masukkan jumlah penumpang: ");
        int jumlahPenumpang = scanner.nextInt();

        String kotaTujuan = "";
        int hargaPerOrang = 0;

        switch (pilihanKota) {
            case 1:
                kotaTujuan = "Jakarta";
                hargaPerOrang = hargaJakarta;
                break;
            case 2:
                kotaTujuan = "Bogor";
                hargaPerOrang = hargaBogor;
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
                System.out.println("Mohon maaf, nomor kota tujuan tidak valid");
                return;
        }

        int totalHarga = hargaPerOrang * jumlahPenumpang;

        System.out.println("Tujuan: " + kotaTujuan);
        System.out.println("Jumlah penumpang: " + jumlahPenumpang);
        System.out.println("Harga tiket per orang: Rp " + hargaPerOrang);
        System.out.println("Total harga tiket: Rp " + totalHarga);

    }
}
