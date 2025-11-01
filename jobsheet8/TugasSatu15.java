package jobsheet8;

import java.util.Scanner;
public class TugasSatu15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n;
        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int jumlah = 0;
            String deret = "";

            for (int j = 1; j <= i; j++){
                int kuadrat = j * j;
                jumlah += kuadrat;
                deret += kuadrat;
                if (j < i) deret += " + ";
            }
            System.out.println("n = " + i + " -> jumlah kuadrat = " + deret + " = " + jumlah);
        }
        sc.close();
    }
}
