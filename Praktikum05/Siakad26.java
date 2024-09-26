package Praktikum05;
import java.util.Scanner;

class Siakad26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan nim: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 20/100) + (nilaiTugas * 15/100) + (nilaiUjian * 30/100) + (nilaiUjian * 35/100);
        
        System.out.printf("Mahasiswa dengan nama %s (NIM %s) kelas %s nomor absen %d\n", nama, nim, kelas, absen);
        System.out.println("Nilai akhir: "+ nilaiAkhir);

        String kualifikasi;
        String nilaiHuruf;

        if(nilaiAkhir>80 && nilaiAkhir<=100){
            kualifikasi = "Sangat Baik";
            nilaiHuruf = "A";
        }else if(nilaiAkhir>73 && nilaiAkhir<=80){
            kualifikasi = "Lebih dari Baik";
            nilaiHuruf = "B+";
        }else if(nilaiAkhir>65 && nilaiAkhir<=73){
            kualifikasi = "Baik";
            nilaiHuruf = "B";
        }else if(nilaiAkhir>60 && nilaiAkhir<=65){
            kualifikasi = "Lebih dari Cukup";
            nilaiHuruf = "C+";
        }else if(nilaiAkhir>50 && nilaiAkhir<=60){
            kualifikasi = "Cukup";
            nilaiHuruf = "C";
        }else if(nilaiAkhir>39 && nilaiAkhir<=50){
            kualifikasi = "Kurang";
            nilaiHuruf = "D";
        }else{
            kualifikasi = "Gagal";
            nilaiHuruf = "E";
        }
        
        System.out.println("Nilai akhir huruf: "+ nilaiHuruf);
        System.out.println("Kualifikasi: "+ kualifikasi);

    }
}
