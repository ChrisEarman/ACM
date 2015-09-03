import java.util.Scanner;

public class ProblemA {

	public static void doProblem(int[] input) {
		int cal = input[0];
		int f = input[1];
		int c = input[2];
		int p = input[3];
		int rounded = f * 9 + c * 4 + p * 4;
		if (rounded + 8.5 >= cal && rounded - 8.5 <= cal)
		{
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
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
			if (in.equals("0 0 0 0")) {
				System.exit(0);
			}
			doProblem(ticks);
		}
	}

}
