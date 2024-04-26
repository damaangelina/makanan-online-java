import java.util.Scanner;

public class admin {
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelamat datang, admin!");
            System.out.println("1. Lihat menu restoran");
            System.out.println("2. Tambah menu restoran");
            System.out.println("3. Hapus menu");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Menu restoran:");
                    // isi apa sj menuny
                    break;
                case 2:
                    System.out.print("Masukkan nama menu: ");
                    scanner.nextLine();
                    String newMenu = scanner.nextLine();
                    System.out.println("Menu '" + newMenu + "' telah ditambah.");
                    break;
                case 3:
                    System.out.print("Masukkan nama menu yang akan dihapus: ");
                    scanner.nextLine();
                    String deletedMenu = scanner.nextLine();
                    System.out.println("Menu '" + deletedMenu + "' telah dihapus.");
                    break;
                case 4:
                    exit = true;
                    System.out.println("Terima kasih, sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
