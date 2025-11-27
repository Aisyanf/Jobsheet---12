package Pertemuan14;
import java.util.Scanner;

public class Kafe02{
public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
    System.out.println("Selamat datang, " +namaPelanggan +"!");

    if (isMember) {
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    }
    if (kodePromo.equals("DISKON50")) {
        System.out.println("Selamat! Anda mendapatkan DISKON 50%");
    } else if (kodePromo.equals("DISKON30")) {
        System.out.println("Selamat! Anda mendapatkan DISKON 30% ");
    } else {
        System.out.println("Kode promo : " +kodePromo +" invalid");
    }    

    System.out.println("===== MENU RESTO KAFE =====");
    System.out.println("1. Kopi Hitam Rp 15,000");
    System.out.println("2. Cappuccino Rp 20,000");
    System.out.println("3. Latte Rp 22,000");
    System.out.println("4. Teh Tarik Rp 12,000");
    System.out.println("5. Roti Bakar Rp 10,000");
    System.out.println("6. Mie Goreng Rp 18,000");
    System.out.println("======================");
    System.out.println("Silakan pilih menu yang Anda inginkan.");
}

public static int hitungTotalSemua (int[] daftarMenu, int[] daftarJumlah, String kodePromo) {
    int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    int total = 0;

   for (int i = 0; i < daftarMenu.length; i++) {
        int harga = hargaItems [daftarMenu[i] - 1] * daftarJumlah [i];
        total += harga;
   }
    
    if (kodePromo.equals("DISKON50")) {
        System.out.println("Diskon 50% diterapkan"); 
        total = total - (total * 50/100);
    } else if (kodePromo.equals("DISKON30")) {
        System.out.println("Diskon 30% diterapkan"); 
        total = total - (total * 30/100);
    } else {
        System.out.println("Kode promo " +kodePromo +"Invaid, tidak ada diskon");
    }

    return total;
}
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Menu("Budi", true, "DISKON30");

        System.out.print("\nBerapa jenis menu yang ingin dipesan? ");
        int jumlahJenis = input.nextInt();

        int[] daftarMenu = new int[jumlahJenis];
        int[] daftarJumlah = new int[jumlahJenis];

        for (int i = 0; i < jumlahJenis; i++) {
            System.out.print("Masukkan pilihan menu ke-" + (i + 1) + ": ");
            daftarMenu[i] = input.nextInt();

            System.out.print("Masukkan jumlah item menu ke-" + (i + 1) + ": ");
            daftarJumlah[i] = input.nextInt();
        }

        int totalHarga = hitungTotalSemua(daftarMenu, daftarJumlah, "DISKON30");

        System.out.println("\nTotal harga untuk pesanan anda adalah Rp." + totalHarga);
    }
}
