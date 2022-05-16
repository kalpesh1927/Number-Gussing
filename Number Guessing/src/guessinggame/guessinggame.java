package guessinggame;

import javax.swing.JOptionPane;

public class guessinggame {

	public static void main(String[] args) {

		int computerNumber = (int) (Math.random() * 100 + 1);
		int userAnswer = 0;
		System.out.println("The correct guess would be " + computerNumber);
		int count = 1;

		while (userAnswer != computerNumber) {
			String response = JOptionPane.showInputDialog(null, "Enter Guess between 1 to 100", "Guessing Game", 3);
			userAnswer = Integer.parseInt(response);
			JOptionPane.showMessageDialog(null, "" + determineGuess(userAnswer, computerNumber, count));
			count++;
		}
	}

	public static String determineGuess(int userAnswer, int computerNumber, int count) {
		if (userAnswer <= 0 || userAnswer > 100)
			return "Your Guess invalid !";
		else if (userAnswer == computerNumber)
			return "Correct !\nTotal Guesses" + count;
		else if (userAnswer > computerNumber)
			return "Your Guess is too high,try again\n Try number :" + count;
		else if (userAnswer < computerNumber)
			return "Your Guess is too low,try again\n Try number :" + count;
		else
			return "Your Guess is incorrect!,try again\n Try number :" + count;
	}

}
