package Praktikum05;

import java.util.Scanner;

public class PemilihanHariDenganIf26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayNum;

        dayNum = sc.nextInt();

        if(dayNum == 1 || dayNum == 2 || dayNum == 3 || dayNum == 4 || dayNum == 5) {
            System.out.println("Weekday");
        } else if(dayNum == 6 || dayNum == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }   
}

