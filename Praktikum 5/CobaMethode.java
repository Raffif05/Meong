
import java.util.Scanner;

public class CobaMethode {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int hasil = max(x,y);

        System.out.println(hasil);

    }

    private static int max(int x, int y){
        if(x > y)
            return x;
        else 
            return y;
    }
}