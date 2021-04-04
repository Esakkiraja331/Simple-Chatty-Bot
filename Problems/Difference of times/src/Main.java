import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        //first moment of time

        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();


        //secondMomentOfTime and firstMomentOfTime seconds difference

        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int secondMomentOfTime = hours2 * 3600 + minutes2 * 60 + seconds2;
        int firstMomentOfTime = hours1 * 3600 + minutes1 * 60 + seconds1;
        System.out.println(secondMomentOfTime - firstMomentOfTime);


    }
}