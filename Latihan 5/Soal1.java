import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Masukkan nilai huruf (A/B/C/D): ");
        String nilaiHuruf = scanner.nextLine();

        switch (nilaiHuruf) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Fail");
                break;
            default:
                //jika bukan A-D
                break;
        }


    }
}
