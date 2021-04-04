import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        boolean trueFalse = n < 10 && n > 0;
        System.out.println(trueFalse);
    }
}