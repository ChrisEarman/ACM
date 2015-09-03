import java.util.Scanner;

public class ProblemD {

	public static void doProblem(int[] input) {
		
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] ticks = new int[4];
		while (true) {
			String in = keyboard.nextLine();
			String[] input = in.split(" ");
			for (int i = 0; i < 4; i++) {
				ticks[i] = Integer.parseInt(input[i]);
			}
			if (in.equals("0 0")) {
				System.exit(0);
			}
			doProblem(ticks);
		}
	}

}
