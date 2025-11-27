package Pertemuan14;
import java.util.Scanner;

public class NilaiMahasiswa02 {
    public static void isianArray (int[] nilai, Scanner sc) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1) +" : ");
            nilai[i] = sc.nextInt();
        }
    }

    public static void tampilArray(int[] nilai) {
        System.out.println("\nDaftar Nilai Mahasiswa : ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" +(i+1) +" : " +nilai[i]);
        }
    }

    public static int hitTot(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int N = sc.nextInt();
        int[] nilai = new int[N];

        isianArray (nilai, sc);
        tampilArray(nilai);

        int total = hitTot(nilai);
        System.out.println("\nTotal Nilai Seluruh Mahasiswa : " +total);
    }
}
