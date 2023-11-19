package Tugas;

import java.util.Random;
import java.util.Scanner;

public class RandomData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Random Angka");
            System.out.println("2. Random String");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1 / 2 / 3): ");


            int menuOption = scanner.nextInt();

            switch (menuOption) {
                case 1:
                    generateRandomNumber();
                    break;
                case 2:
                    generateRandomString();
                    break;
                case 3:
                    System.out.println("Terima kasih, Shutdown The Program");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static void generateRandomNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas bawah / angka minimal acak: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Masukkan batas atas / angka maksimal acak: ");
        int upperBound = scanner.nextInt();

        if (lowerBound >= upperBound) {
            System.out.println("Batas bawah / angka minimal harus kurang dari batas atas / angka maksimal. Silakan pilih kembali.");
            return;
        }

        Random random = new Random();
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        System.out.println("Angka acak: " + randomNumber);
    }

    private static void generateRandomString() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang string acak: ");
        int length = scanner.nextInt();

        if (length <= 0) {
            System.out.println("Panjang string harus lebih dari 0. Silakan pilih kembali.");
            return;
        }

        Random random = new Random();
        StringBuilder randomString = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char randomChar = getRandomChar(random);
            randomString.append(randomChar);
        }

        System.out.println("String acak: " + randomString.toString());
    }

    private static char getRandomChar(Random random) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        return chars.charAt(random.nextInt(chars.length()));
    }
}
