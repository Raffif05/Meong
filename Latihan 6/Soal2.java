import java.util.Scanner;

public class Soal2 {
    public static double konversiSuhu(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan suhu minimal (Celcius): ");
        double suhuMinimal = scanner.nextDouble();
        System.out.println("Masukkan suhu rata - rata (Celcius): ");
        double suhuRata = scanner.nextDouble();
        System.out.println("Masukkan suhu maksimal (Celcius): ");
        double suhuMaksimal = scanner.nextDouble();

         // koversi ke Fahreinheit
        double suhuMinF= konversiSuhu(suhuMinimal);
        double suhuRataF = konversiSuhu(suhuRata);
        double suhuMaxF = konversiSuhu(suhuMaksimal);

        System.out.println("Suhu minimal dalam Fahrenheit: " + suhuMinF);
        System.out.println("Suhu rata-rata dalam Fahrenheit: " + suhuRataF);
        System.out.println("Suhu maksimal dalam Fahrenheit: " + suhuMaxF);

    }
}
