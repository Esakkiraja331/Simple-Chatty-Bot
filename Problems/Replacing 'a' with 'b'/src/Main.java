import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String letterChange = scanner.next().replaceAll("a", "b");
        System.out.println(letterChange);
    }
}