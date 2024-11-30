/* COSC 240              Final
         Due Date: 5/15/2023
         Your Name: Matthew Zingeser
         Pair Member(if any): Nick Hands
         purpose of the program: Reads the file "books.txt" and allows new books to be added or deleted along with being able to view all of the books in order
 */
import java.io.*;
import java.util.*;
public class MattFinal {

	public static void main(String[] args) {
		String file = "C:\\Users\\mhzin\\eclipse-workspace\\FinalProject\\src\\book.txt";
		int y = 100; //makes variable array limit
		Scanner scn = new Scanner(System.in); // Scanner declaration
		String[] bookList = new String[y]; //creates array
		
		int i = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while((line = br.readLine()) != null) {
				bookList[i] = line;
				i++;
			}
		} catch (IOException e) {
	}
		char pick;
		System.out.println("Would you like to start? (Y or y) "); // loop starts
		pick = scn.next().charAt(0); //scanner
		
		while(pick == 'Y' | pick == 'y') { // program loops
			System.out.print("Select Add, Delete, View, or Sort: "); // switch statement variables
			String choice = scn.next();
			
			switch (choice) {
			case "Add":
			case "add":
				System.out.println("Enter a new Book: ");
				String newbook = scn.next();
				for(int a = 0; a < bookList.length-1; a++) {
						if (bookList[a] == null) {
						bookList[a] = newbook;
						a = bookList.length; //loop ends
						}
				}
				for (int b = 0; b < bookList.length; b++) {
					if (bookList[b] != null) { //views until lines empty
					System.out.print(bookList[b] + "\n");
				}
				}
				
			break;
			case "Delete":
			case "delete":
				System.out.println("Enter which book you want to remove: "); //gets deleted number 
				for (int count = 0; count < i; count++) {
					System.out.println(count + ". " + bookList[count]);
				}
				int r = scn.nextInt();
				bookList[r] = "";
				while (r < i) {
					int l = r + 1;
					bookList[r] = bookList[l];
					r++;
				}
				for (int b = 0; b < bookList.length; b++) {// view books
					if(bookList[b] != null) {
						System.out.print(bookList[b] + "\n");
				}
				}
				
			break;
			case "Sort":
			case "sort":
				for (int w = bookList.length -1; w > 0; w--) {// sorts in reverse order
					if(bookList[w] != null) {
					System.out.print(bookList[w] + "\n");
				}
				}
			break;
			case "View":
			case "view":
				for (int e = 0; e < bookList.length; e++) { //views array
					if (bookList[e] != null) {
					System.out.print(bookList[e] + "\n");
				}
				}
			break;
			default:
				System.out.print("Error, Please retry \n"); // error message
			}
			
			System.out.println("\nContinue? (Y or y)"); //loop prompt
			pick = scn.next().charAt(0); // loop if y or Y
		}
	}
			
		}
	
	
