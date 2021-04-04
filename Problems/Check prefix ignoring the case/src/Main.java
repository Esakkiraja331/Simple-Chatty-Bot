import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        //Read the Input Store the Str
        String str = scanner.next();
        //str value to equal Str uppercase value
        String strInUpperCase = str.toUpperCase();
        // strInUpperCase letter check with startsWith already defined "J" true or false to store the startsWith
        boolean startsWith = strInUpperCase.startsWith("J");
        //print the true or false
        System.out.println(startsWith);
    }
}