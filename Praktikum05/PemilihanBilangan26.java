package Praktikum05;

import java.util.Scanner;

class PemilihanBilangan26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
        String jenisBilangan = angka % 2 == 0 ? "genap" : "ganjil";

        System.out.println("Angka " + angka + " termasuk bilangan " + jenisBilangan);
    }
}