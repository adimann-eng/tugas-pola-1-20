import java.util.Scanner;

public class tugas_koding_java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilihan;
        char op;
        double angka1, angka2, hasil;

        do {
            // Membersihkan layar CMD (khusus Windows)
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
                // Abaikan jika gagal clear screen
            }

            System.out.println("=================================");
            System.out.println("     APLIKASI KALKULATOR JAVA    ");
            System.out.println("=================================");
            System.out.println("Pilih operator yang ingin digunakan:");
            System.out.println("  (+) Penjumlahan");
            System.out.println("  (-) Pengurangan");
            System.out.println("  (*) Perkalian");
            System.out.println("  (/) Pembagian");
            System.out.println("---------------------------------");

            // Input operator
            System.out.print("Masukkan operator (+, -, *, /): ");
            op = input.next().charAt(0);

            // Input angka
            System.out.print("Masukkan angka pertama: ");
            angka1 = input.nextDouble();
            System.out.print("Masukkan angka kedua  : ");
            angka2 = input.nextDouble();

            System.out.println("---------------------------------");

            // Proses perhitungan menggunakan switch-case
            switch (op) {
                case '+':
                    hasil = angka1 + angka2;
                    System.out.printf("Hasil: %.2f + %.2f = %.2f\n", angka1, angka2, hasil);
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    System.out.printf("Hasil: %.2f - %.2f = %.2f\n", angka1, angka2, hasil);
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    System.out.printf("Hasil: %.2f * %.2f = %.2f\n", angka1, angka2, hasil);
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                        System.out.printf("Hasil: %.2f / %.2f = %.2f\n", angka1, angka2, hasil);
                    } else {
                        System.out.println("Kesalahan: Pembagian dengan angka nol (0) tidak diperbolehkan!");
                    }
                    break;
                default:
                    System.out.println("Kesalahan: Operator yang Anda masukkan tidak valid!");
                    break;
            }

            System.out.println("---------------------------------");
            System.out.print("Ingin menghitung lagi? (y/n): ");
            pilihan = input.next().charAt(0);

        } while (pilihan == 'y' || pilihan == 'Y');

        System.out.println("\nTerima kasih telah menggunakan kalkulator ini!");
        input.close();
    }
}