import java.util.Scanner;

public class Latihan02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan jumlah array: ");
        int n = in.nextInt();
        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukan nilai array ke-" + i + ": ");
            nilai[i] = in.nextInt();
        }

        System.out.println("Output Array");
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "]=" + nilai[i]);
        }
    }
}
