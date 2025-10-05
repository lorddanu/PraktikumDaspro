package jobsheet5;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String statusMahasiswa;
        int sks;

        System.out.print("Apakah Anda mahasiswa terdaftar? (ya/tidak): ");
        statusMahasiswa = input.nextLine();

        System.out.print("Masukkan jumlah SKS yang diambil: ");
        sks = input.nextInt();

        if (statusMahasiswa.equalsIgnoreCase("ya")) {
            if (sks >= 12) {
                System.out.println("Anda boleh mengakses WiFi kampus dan sistem perpustakaan.");
            } else {
                System.out.println("SKS kurang dari 12, akses WiFi kampus tidak diizinkan.");
            }
        } else {
            System.out.println("Anda bukan mahasiswa terdaftar, akses ditolak.");
        }

        input.close();
    }
}
