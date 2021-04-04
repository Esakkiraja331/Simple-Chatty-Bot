import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String wordString1, wordString2;
        // put your code here
        Scanner scanner = new Scanner(System.in);
        wordString1 = scanner.nextLine().replaceAll("\\s", "");
        wordString2 = scanner.nextLine().replaceAll("\\s", "");
        boolean result = wordString1.equals(wordString2);
        System.out.println(result);




    }
}