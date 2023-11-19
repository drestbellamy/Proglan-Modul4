package Tugas;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

    public static void main(String[] args) {
        int[] data = {38, -15, 72, 0, -42, 19, -63, 50, 27, -84, 61, 5};

        // Mengurutkan data
        Arrays.sort(data);

        // Menampilkan data yang sudah diurutkan
        System.out.print("Data yang sudah diurutkan: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Mencari index elemen
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai yang ingin dicari indexnya: ");
        int nilaiCari = scanner.nextInt();

        int index = Arrays.binarySearch(data, nilaiCari);

        if (index >= 0) {
            System.out.println("Nilai ditemukan di index: " + index);
        } else {
            System.out.println("Nilai tidak ditemukan.");
        }

        // Menghitung elemen rasio
        int positif = 0, negatif = 0, nol = 0;
        for (int num : data) {
            if (num > 0) {
                positif++;
            } else if (num < 0) {
                negatif++;
            } else {
                nol++;
            }
        }

        // Menampilkan hasil perhitungan
        System.out.println("Jumlah elemen dengan nilai positif: " + positif);
        System.out.println("Jumlah elemen dengan nilai negatif: " + negatif);
        System.out.println("Jumlah elemen dengan nilai nol: " + nol);
    }
}
