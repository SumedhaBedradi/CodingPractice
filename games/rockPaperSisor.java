import java.util.Scanner;
import java.util.Random;

public class rockPaperSisor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		String[] options = { "rock", "paper", "scissors" };
		System.out.println("Welcome to Rock, Paper, Scissors!");

		while (true) {
			System.out.print("Enter your choice (rock, paper, scissors or quit): ");
			String userChoice = sc.next().toLowerCase();

			if (userChoice.equals("quit")) {
				System.out.println("Thanks for playing!");
				break;
			}

			// Check if input is valid
			if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
				System.out.println("Invalid input. Try again.");
				continue;
			}

			int computerIndex = rand.nextInt(3); // 0 to 2
			String computerChoice = options[computerIndex];

			System.out.println("Computer chose: " + computerChoice);

			if (userChoice.equals(computerChoice)) {
				System.out.println("It's a tie!");
			} else if ((userChoice.equals("rock") && computerChoice.equals("scissors"))
					|| (userChoice.equals("paper") && computerChoice.equals("rock"))
					|| (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
				System.out.println("You win!");
			} else {
				System.out.println("Computer wins!");
			}
			System.out.println();
		}

		sc.close();
	}
}
