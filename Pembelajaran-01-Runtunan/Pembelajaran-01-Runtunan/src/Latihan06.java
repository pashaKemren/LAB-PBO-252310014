// Input dan Method CONCAT

import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Memasukan Usia    : ");
        String usia = scanner.nextLine();

        System.out.print("Memasukan Firstname: ");
        String firstname = scanner.nextLine();

        System.out.print("Memasukan Lastname : ");
        String lastname = scanner.nextLine();

        System.out.print("Memasukan NPM      : ");
        String npm = scanner.nextLine();

        // Menggunakan CONCAT
        String hasilConcat = npm.concat(firstname).concat(lastname).concat(usia);

        System.out.println("\nOutput CONCAT: " + hasilConcat);

        scanner.close();
    }
}