import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int durationDay = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int nightHotel = scanner.nextInt();
        int totalCost = (nightHotel * (durationDay - 1) + foodCost * durationDay + 2 * flightCost);
        System.out.println(totalCost);


    }
}
