import java.util.Scanner;

class Node {

	public char val;
	public Node left;
	public Node right;
	
	public Node (char v, Node l, Node r) {
		val = v;
		left = l;
		right = r;
	}
	
}

public class ProblemC {
	
	public static String input;
	
	public static Node buildTree() {
		char c = input.charAt(0);
		input = input.substring(1, input.length());
		if (c == '#') {
			return null;
		} else {
			return new Node(c, buildTree(), buildTree());
		}
	}
	
	public static void doProblem(int[] input) {
		
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] ticks = new int[4];
		while (true) {
			input = keyboard.nextLine();
			if (input.equals("END")) {
				System.exit(0);
			}
			Node root = buildTree();
			doProblem(ticks);
		}
	}

}