import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        System.out.println("Please enter a season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Please enter a whole number: ");
        int number = scanner.nextInt();

        System.out.println("Please enter an adjective: ");
        String adjective = scanner.next();
        scanner.close();

        System.out.printf("On a %s %s day, I drink a minimum of %d cups of coffee.", adjective, season, number);
    }
}