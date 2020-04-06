import java.util.Scanner;

public class GuessBirthdayUsingArray {

	public static void main(String[] args) {
		int day = 0; // Day to be determined
		int answer;

		int[][][] dates = { { { 1, 3, 5, 7 }, { 9, 11, 13, 15 }, { 17, 19, 21, 23 }, { 25, 27, 29, 31 } },
				{ { 2, 3, 6, 7 }, { 10, 11, 14, 15 }, { 18, 19, 22, 23 }, { 26, 27, 30, 31 } },
				{ { 4, 5, 6, 7 }, { 12, 13, 14, 15 }, { 20, 21, 22, 23 }, { 28, 29, 30, 31 } },
				{ { 8, 9, 10, 11 }, { 12, 13, 14, 15 }, { 24, 25, 26, 27 }, { 28, 29, 30, 31 } },
				{ { 16, 17, 18, 19 }, { 20, 21, 22, 23 }, { 24, 25, 26, 27 }, { 28, 29, 30, 31 } } };

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < dates.length; i++) {
			System.out.println("Is your birthday in set " + (i + 1) + " ?");

			int count = 0;
			for (int j = 0; j < dates[i].length; j++) {
				for (int k = 0; k < dates[i][j].length; k++) {
					count++;
					System.out.print(count % 4 == 0 ? dates[i][j][k] + "\n" : dates[i][j][k] + " ");
				}
			}
			System.out.print("Enter 0 for No and 1 for Yes: ");
			answer = input.nextInt();

			if (answer == 1) {
				day += dates[i][0][0];
			}
		}

		System.out.println("Your birth day is " + day);
	}
}
