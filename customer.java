import java.util.Scanner;

public class customer {
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelamat datang di Restoran XYZ!");
            System.out.println("1. Lihat menu restoran");
            System.out.println("2. Pesan menu");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Menu restoran:");
                    // Tampilkan menu restoran
                    break;
                case 2:
                    System.out.print("Masukkan nomor menu yang ingin dipesan: ");
                    int menuNumber = scanner.nextInt();
                    // Proses pemesanan
                    System.out.println("Pesanan Anda telah diterima!");
                    break;
                case 3:
                    exit = true;
                    System.out.println("Terima kasih atas kunjungan Anda. Sampai jumpa lagi!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
