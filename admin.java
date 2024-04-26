import java.util.Scanner;

public class admin {
    public static void main(String[] args) {
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
