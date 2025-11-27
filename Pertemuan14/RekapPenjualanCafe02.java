package Pertemuan14;
import java.util.Scanner;

public class RekapPenjualanCafe02 {
    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

    public static void inputData (int[][] penjualan, Scanner sc) {
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Input data untuk menu : " + menu[i]);
            for (int j = 0; j < penjualan[0].length; j++) {
                System.out.print(" Hari ke-" + (j + 1) + " : ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilData(int[][] penjualan) {
        System.out.println("---- Rekap Penjualan ----");
        System.out.print("Menu/Hari\t");

        for (int h = 1; h <= penjualan[0].length; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < penjualan[0].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println(); 
        }
    }

    public static void menuTertinggi (int[][] penjualan) {
        int maxTotal = -1;
        int indexMenuMax = -1;

        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[0].length; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                indexMenuMax = i;
            }
        }

        System.out.println("\nMenu dengan total penjualan tertinggi:");
        System.out.println(menu[indexMenuMax] + " sebanyak " + maxTotal);
    }

    public static void tampilRataRata(int[][] penjualan) {
        System.out.println("\nRata-rata penjualan tiap menu:");

        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[0].length; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / penjualan[0].length;
            System.out.println(menu[i] + ": " + rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] penjualan = new int[5][7];

        inputData(penjualan, sc);
        tampilData(penjualan);
        menuTertinggi(penjualan);
        tampilRataRata(penjualan);
    }
}
