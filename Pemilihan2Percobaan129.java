import java.util.Scanner;
public class Pemilihan2Percobaan129 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        int tahun;
        System.out.println("Masukkan Tahun");
        tahun = input29.nextInt();
        if((tahun % 4) == 0) {
            if ((tahun & 100) != 0)
            System.out.println("Tahun Kabisat");
            else if ((tahun % 400) == 0)
            System.out.println("Tahun kabisat");
            else
            System.out.println("Tahun " +tahun+ "bukan tahun kabisat");
        } else
        System.out.println("Bukan Tahun Kabisat");

        
    }

}