import java.util.Scanner;

public class gradeCalculator {

	public static void main(String[] args) {
		int test_score1;
		int test_score2;
		int final_score;
		int assignments;
		double total_score;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter test score ");
		test_score1 = input.nextInt();
		System.out.print("Enter test score");
		test_score2 = input.nextInt();
		System.out.print("Enter test score");
		final_score = input.nextInt();
		System.out.print("Enter the number of assignments");
		assignments = input.nextInt();
		
		total_score = .15 * test_score1 + .15 * test_score2 + .4 + final_score + .3 * assignments;
		System.out.print(total_score);

	}

}
