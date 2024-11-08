
public class Operator{
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        

        /* Hasil penjumlahan
        Contohnya*/
        
        b = -5;
        int pertambahan = a + b;
        System.out.println("Hasil penjumlahan: "+ pertambahan);

        double b1 = 3.0;
        //pembagian
        int pembagian = a / b;
        double pembagianDesimal = a / b1;
        System.out.println("Hasil pembagian: " + pembagian);
        System.out.printf("Hasil pembagian desimal: %.2f\n", pembagianDesimal);

        //modulus
        int modulus = a % b;
        System.out.println("Sisa hasil bagi: " + modulus);

        //increment dan decrement

        // jika ingin langsung di proses dan tulis
        System.out.println("Increment awal: " + ++a);

        //di proses dulu baru tulis
        System.out.println("Increment di akhir " +  a++);  
        System.out.println("Habis Increment " + a);  

        //operator logika
        boolean a1 = true;
        boolean a2 = false;
        boolean a3 = false;
        boolean a4 = true;

        //Operatior AND
        System.out.println("Hasil AND a1 dan a2: " + (a1 && a2));
        System.out.println("Hasil AND a3 dan a4: " + (a3 && a4));

        System.out.println("Hasil OR a1 dan a2: " + (a1 || a2));
        System.out.println("Hasil OR a3 dan a4: " + (a3 || a4));
        System.out.println("Hasil OR dan AND a1, a2,a3,a4: "+
                     (a1 || a2 && a3 || a4));

        //penggunaan final




    }
    }

