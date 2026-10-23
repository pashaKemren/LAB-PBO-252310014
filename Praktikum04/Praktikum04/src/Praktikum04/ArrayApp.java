package Praktikum04;

import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        String[] nama = new String[4];
        nama[0] = "Raditya"; // cara input
        System.out.println(nama[0]); // cara output
        System.out.println(nama[1]); // tes output

        Scanner scanner = new Scanner(System.in);
        System.out.println("input nama: ");
        nama[1] = scanner.nextLine();
        System.out.println("nama yang di output: " + nama[1]);

        System.out.println("nama-nama: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(nama[i]);
        }
    }
}
