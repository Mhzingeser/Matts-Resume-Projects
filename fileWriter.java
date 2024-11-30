/* COSC 240              Lab# 8
         Due Date: 4/21/2023
         Your Name: Matthew Zingeser
         Pair Member(if any): Rylen
         purpose of the program: Takes the information from "input.txt" and writes onto a diffrent file "output.txt" with only the even numebrs
 */

//importing the files and scanners
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class fileWriter {

	public static void main(String[] args) throws FileNotFoundException {
	
		
	
			//Prints the "input.txt" info onto "output.txt"
			PrintStream output = new PrintStream(new File("C:\\Users\\mhzin\\Downloads\\output.txt"));
			Scanner inputFile = new Scanner(new File("C:\\Users\\mhzin\\Downloads.input.txt"));
			int num;
			
			//Makes it so only even numbers are written onto "output.txt"
			while(inputFile.hasNextInt()) {

			num = inputFile.nextInt();
			
			if(num%2==0) {
			
			output.println(num);
			}
			else {
			
			inputFile.nextInt();
			}
			}
			inputFile.close();
			
			}
	
}

//Rylen and I tried to figure out the program but ended up making it have more bugs