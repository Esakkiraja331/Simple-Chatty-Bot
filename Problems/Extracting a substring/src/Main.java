import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // get the input
        Scanner scanner = new Scanner(System.in);
        //Read the input storing the str
        String str = scanner.next();
        //Read the output storing the num
        int beingIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();
        String sub = str.substring(beingIndex, endIndex + 1);
        System.out.println("" + sub);


    }
}
