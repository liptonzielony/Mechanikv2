import java.util.Scanner;

public class Main {
    static String login = "admin";
    static String haslo = "admin";
    public static void main(String[] args) {
        System.out.println("Logowanie");
        System.out.println("Prosze wpisac login:");
        Scanner scan = new Scanner(System.in);
        String skaner = scan.nextLine();

       do{
           skaner = scan.nextLine();
           System.out.println("Błędny login");
       }while (!skaner.equals(login));
        System.out.println("Login prawidłowy, prosze podać hasło");
        do{
            skaner = scan.nextLine();
            System.out.println("Błędne hasło");
        }while (!skaner.equals(haslo));
        System.out.println("Zalogowano: Admin");
        }
    }