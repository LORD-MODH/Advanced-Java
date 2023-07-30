package java;
import java.util.Scanner;
class GreetUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
        
        scanner.close();
    }
}
