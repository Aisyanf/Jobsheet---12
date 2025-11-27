package Pertemuan14;

public class Kubus02 {
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return sisi * sisi * 6;
    }

    public static void main(String[] args) {
        double sisi = 5;

        System.out.println("Volume Kubus Adalah " + hitungVolume(sisi));
        System.out.println("Luas Permukaan Kubus Adalah " + hitungLuasPermukaan(sisi));
    }

}
