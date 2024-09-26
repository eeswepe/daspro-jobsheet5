package Praktikum05;
import java.util.Scanner;

public class PemilihanUsia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int usia;
        System.out.print("Masukkan usia: ");
        usia = sc.nextInt();
        if (usia > 0) {
            if(usia <= 12) {
                System.out.println("Usia yang dimasukkan termasuk kategori Anak");
            }else if(usia <= 19) {
                System.out.println("Usia yang dimasukkan termasuk kategori Remaja");
            }else if(usia <= 64){
                System.out.println("Usia yang dimasukkan termasuk kategori Dewasa");
            }else{
                System.out.println("Usia yang dimasukkan termasuk kategori Lansia");
            }
        }else{
            System.out.println("Usia yang dimasukkan tidak valid");
        }

    }   
}
