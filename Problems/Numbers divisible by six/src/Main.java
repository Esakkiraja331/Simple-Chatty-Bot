import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr, 0, size);
        for (int i = 0; i < size; i++) {
            if (arr[i] % 6 == 0) {
                result = result + arr[i];
            }
        }
        System.out.println(result);
    }
}



