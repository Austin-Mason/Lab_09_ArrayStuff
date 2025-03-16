import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }


        System.out.print("Array values: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);


            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();


        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

        scanner.close();
    }


    public static double getAverage(int values[]) {
        int sum = 0;


        for (int value : values) {
            sum += value;
        }


        return (double) sum / values.length;
    }
}




