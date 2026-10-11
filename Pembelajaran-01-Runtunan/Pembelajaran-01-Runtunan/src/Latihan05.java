// String ke Huruf Besar

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan suatu teks / kalimat: ");
        String inputan = scanner.nextLine();

        String hasilBesar = inputan.toUpperCase();

        System.out.println("Hasil Huruf Besar: " + hasilBesar);

        scanner.close();
    }
}