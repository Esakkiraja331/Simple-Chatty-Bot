import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String firstname = scanner.nextLine();
        String age = scanner.nextLine();
        String education = scanner.nextLine();
        String experience = scanner.nextLine();
        String cuisine = scanner.nextLine();

        System.out.print("The form for " + firstname + " is completed.");
        System.out.print(" We will contact you if we need a chef that cooks" + " " + cuisine + " dishes.");


    }
}