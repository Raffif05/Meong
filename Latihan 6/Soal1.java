import java.util.Scanner;

public class Soal1 {
    public static void sapa(String nama) {
        System.out.println("Hai, " + nama + ". Semangat pagi!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama pertama: ");
        String namaPertama = scanner.nextLine();
        System.out.println("Masukkan nama kedua: ");
        String namaKedua = scanner.nextLine();

        //hasil akhir
        sapa(namaPertama);
        sapa(namaKedua);

    }
}

