import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int atLeastSleepHours = scanner.nextInt();
        int overSleepHours = scanner.nextInt();
        int sleep = scanner.nextInt();
        if (atLeastSleepHours <= sleep && sleep <= overSleepHours) {
            System.out.println("Normal");
        } else if (sleep > overSleepHours) {
            System.out.println("Excess");
        } else {
            System.out.println("Deficiency");
        }


    }
}