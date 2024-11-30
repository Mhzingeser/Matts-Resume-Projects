/* COSC 240              Lab# 8
         Due Date: 4/21/2023
         Your Name: Matthew Zingeser
         Pair Member(if any): Rylen
         purpose of the program: Reads a file and then takes the numbers in the file and finds the average of them all
 */


//importing the files and scanner
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class fileReaderProgram {

	public static void main(String[] args) {
		
		//try and catch with the program reading the file from the compturs downloads
		try {
			File text = new File("C:\\Users\\mhzin\\Downloads\\input.txt");
			Scanner input = new Scanner(text);
			Scanner input2 = new Scanner(text);
			int x = 0;
			int sum = 0;
			System.out.println("for input.txt");
			while(input2.hasNextLine()) {
				System.out.println(input2.nextLine());
			}
			
		//Has the numbers organized on each line of the program while keeping a counter
			while(input.hasNext()) {
			
			
				if(input.hasNextInt()) {
				int y = input.nextInt();
				x++;
				sum = sum + y;
				System.out.println("\n Number "+x+" is "+y);
			}else {
				input.next();
			}
			//setting variables
		} 	double a = sum;
			double b =x;
			double average = a/b;
			System.out.println("The average of"+ x + "numbers/file ="+ average);
			
			
			}
		//File exception catch incase program fails
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}
	//The program did originally work till me and Rylen tried working on the second program which messed up the files
}
