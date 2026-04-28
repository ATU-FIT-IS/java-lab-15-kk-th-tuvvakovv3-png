import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner арқылы System.in-нен деректерді оқимыз
        Scanner scanner = new Scanner(System.in);
        
        // Пайдаланушы енгізген санды оқимыз
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            
            // Жұп немесе тақ екенін анықтау (2-ге бөлінгендегі қалдық 0 болса - жұп)
            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
        
        scanner.close();
    }
}
