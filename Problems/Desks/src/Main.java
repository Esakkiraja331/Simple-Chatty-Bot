import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        //groupOneStudent
        int groupOneStudent = scanner.nextInt();
        //groupTwoStudent
        int groupTwoStudent = scanner.nextInt();
        //groupThreeStudent
        int groupThreeStudent = scanner.nextInt();

        //University needs for minimum number of desk

        int desk1 = (groupOneStudent / 2 + groupOneStudent % 2);
        int desk2 = (groupTwoStudent / 2 + groupTwoStudent % 2);
        int desk3 = (groupThreeStudent / 2 + groupThreeStudent % 2);
        System.out.println(desk1 + desk2 + desk3);
    }
}