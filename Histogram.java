/* COSC 240              Lab# 10
         Due Date: 5/7/2023
         Your Name: Matthew Zingeser
         Pair Member(if any): 
         purpose of the program: The program will take an array size that you input and give an output with the array elements along with how they are represented in "*"
*/
import java.util.Scanner;
import java.util.Random;

//The program starts by defining two constants MAX_VALUE and BAR_LENGTH for the maximum value of the random numbers generated and the length of the histogram bars, 
public class Histogram {
    public static final int MAX_VALUE = 15;
    public static final int BAR_LENGTH = 8;

    // In the main method, a Scanner object is created to read input from the user. The program then enters a do-while loop that asks the user if they want to continue after each iteration. The loop continues as long as the user enters 'y' or 'Y'.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;
        do {
            int size = readPositiveInt(input, "Enter array size: ");
            int[] arr = new int[size];
            fillArray(arr);
            System.out.println("The array elements are:");
            printArray(arr);
            printHistogram(arr);
            // loops the program with a yes or no prompt to either continue or terminate the program
            System.out.print("Do you want to continue(Y/N): ");
            choice = input.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }
    //The readPositiveInt method is used to read a positive integer from the user for the size of the array.
    public static int readPositiveInt(Scanner input, String prompt) {
        int num;
        do {
            System.out.print(prompt);
            num = input.nextInt();
            if (num <= 0) {
                System.out.println("ERROR! Should be positive. REENTER: ");
            }
        } while (num <= 0);
        return num;
    }
    
    //The fillArray method is called to fill the array with random integers between 1 and MAX_VALUE.
    public static void fillArray(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(MAX_VALUE) + 1;
        }
    }
    //The printArray method is called to print the array elements in a single line.
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //The printHistogram method is called to print the histogram and takes each element of the array, prints the index and value, and then prints a number of asterisks corresponding to the value, using the printf method to format the output.
    public static void printHistogram(int[] arr) {
        System.out.println("Index Value Histogram");
        System.out.println("---------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-5d%-5d", i, arr[i]);
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

