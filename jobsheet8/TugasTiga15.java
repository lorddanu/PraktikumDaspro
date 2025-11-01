package jobsheet8;

import java.util.Scanner;
public class TugasTiga15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Masukkan jumlah cabang: ");
        int jumlahCabang = sc.nextInt();

        int totalSeluruhPelanggan = 0;
        int totalSeluruhItem = 0;

        System.out.println("\n===== Input Penjualan per Cabang =====");

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n----Cabang " + i + "----");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalItemCabang = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("- Pelanggan ke-" + j + " memesan berapa item? ");
                int jumlahItem = sc.nextInt();
                totalItemCabang += jumlahItem;
            }

            System.out.println("-- Cabang " + i + "--");
            System.out.println("> Total pelanggan cabang ke " + i + ": " + jumlahPelanggan + " pelanggan");
            System.out.println("> Total item terjual di cabang ke " + i + ": " + totalItemCabang + " item");

            totalSeluruhPelanggan += jumlahPelanggan;
            totalSeluruhItem += totalItemCabang;
        }
        System.out.println("\nTotal keseluruhan Cabang:");
        System.out.println("Pelanggan: " + totalSeluruhPelanggan + " orang");
        System.out.println("Item yang terjual: " + totalSeluruhItem + " item");

        sc.close();
    }
}
