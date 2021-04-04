import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr, 0, size);//Ascending order..a maarum
        for (int i = 0; i < size; i++) {
            if (arr[i] == 2) {
                d++;
            }
            if (arr[i] == 3) {
                c++;
            }
            if (arr[i] == 4) {
                b++;
            }
            if (arr[i] == 5) {
                a++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a + " ");
    }
}


