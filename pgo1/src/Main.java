import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("WPISZ LICZBE: ");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        if (liczba > 0) {
            System.out.println("Liczba jest POZYTYWNA");
        }else if (liczba < 0) {
            System.out.println("Liczba jest NEGATYWNA");
        }else{
            System.out.println("Liczba jest 0");
            }
        }
    }
