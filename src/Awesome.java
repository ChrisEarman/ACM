import java.util.Scanner;


public class Awesome {

	
	public static void doProblem(int[] input)
	{
		int n = input[0];
		int t1 = input[1];
		int t2 = input[2];
		int t3 = input[3];
		int term1;
		int term2;
		if (t2 > t1) {
			term1 = t2 - t1;
		} else {
			term1 = t2 - t1 + n;
		}
		if (t2 > t3) {
			term2 = t2 - t3;
		} else {
			term2 = t2 - t3 + n;
		}
		System.out.println(3 * n + n - 1 + term1 + term2);
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
