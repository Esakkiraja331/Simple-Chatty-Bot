import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean ans = a > 0 && b <= 0 && c <= 0;
        boolean ans1 = a <= 0 && b > 0 && c <= 0;
        boolean ans2 = a <= 0 && b <= 0 && c > 0;
        System.out.println(ans || ans1 || ans2);
    }
}