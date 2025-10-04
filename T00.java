// 12S25030 - Nina Theresia Tarigan
import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x, y, tambah, kali;

        x = Integer.parseInt(input.nextLine());
        y = Integer.parseInt(input.nextLine());
        if (x % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama: Ganjil");
        }
        if (y % 2 == 0) {
            System.out.println("Bilangan kedua: Genap");
        } else {
            System.out.println("Bilangan kedua: Ganjil");
        }
        if (x > y) {
            System.out.println("Bilangan pertama lebih besar");
        } else {
            if (x < y) {
                System.out.println("Bilangan kedua lebih besar");
            } else {
                System.out.println("Kedua bilangan sama besar");
            }
        }
        if (x % 2 == 0 && y % 2 == 0) {
            tambah = x + y;
            System.out.println("Hasil penjumlahan: " + tambah);
        } else {
            if (x % 2 != 0 && y % 2 != 0) {
                kali = x * y;
                System.out.println("Hasil perkalian: " + kali);
            }
        }
        if (x % 2 != 0 && y % 2 == 0) {
            System.out.println("Berbeda jenis");
        } else {
            if (y % 2 != 0 && x % 2 == 0) {
                System.out.println("Berbeda jenis");
            }
        }
    }
}
