package Pertemuan2;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        System.out.println("Sinta ingin membeli Tanah");

        A_TANAH tanahh = new A_TANAH();
        Scanner scanner = new Scanner (System.in);
        int harga_tanah = 5000000;

        System.out.println("masukan berapa meter :");
        tanahh.luas = scanner.nextInt();

        int total_harga = tanahh.getLuas() * harga_tanah;

        System.out.println("Total harga :" + total_harga);
    }
}
