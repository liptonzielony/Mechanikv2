import java.util.Scanner;

public class Zalogowany {
    public static void main(String[] args) {
        System.out.println("Prosze wybrac czynnosc akcje");
        System.out.println("MENU WYBORU");
        System.out.println("1. KALKULATOR USŁUG");
        System.out.println("2. BAZA KLIENTOW");

        Scanner scan = new Scanner(System.in);
        String skaner;

        do{
            skaner = scan.nextLine();
            System.out.println("prosze wybrac operacje");

        }while(!skaner.equals("1") && !skaner.equals("2") );
        int number = Integer.parseInt(skaner);
        switch (number){
            case 1:
                System.out.println("test1");
                break;
            case 2:
                System.out.println("test2");
                break;
        }
    }
}
