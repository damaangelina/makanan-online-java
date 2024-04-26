//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, inputUsername, inputPassword;
        Scanner scanner = new Scanner(System.in);
        boolean isLoggedIn = false;

        String[][] users = {{"admin", "password1"}, {"pembeli", "password2"}};

        while (!isLoggedIn) {
            System.out.println("Masukkan username:");
            inputUsername = scanner.nextLine();
            System.out.println("Masukkan password:");
            inputPassword = scanner.nextLine();

            for (String[] user : users) {
                if (inputUsername.equals(user[0]) && inputPassword.equals(user[1])) {
                    System.out.println("Selamat datang, " + inputUsername + "!");
                    if (inputUsername.equals("admin")) {
                        System.out.println("Anda masuk sebagai admin.");
                    } else {
                        System.out.println("Anda masuk sebagai pembeli.");
                    }
                    isLoggedIn = true;
                    break;
                }
            }

            if (!isLoggedIn) {
                System.out.println("Username atau password salah. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
