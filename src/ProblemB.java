import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class ProblemB {
	public static void doProblem(double l, ArrayList<double[]> pairs) {
		ArrayList<double[]> ret = new ArrayList<double[]>();
		
		while (pairs.size() > 0) {
			double[] first = pairs.remove(0);
			double[] zero = {0,0};
			for (int i = 0; i < ret.size(); i++) {
				double[] merged = merge(first, ret.get(i));
				if (merged != null) { //something merges
					first = merged;
					ret.remove(i);
					ret.add(i, zero);
				}
			}
			ret.add(first);
		}
				
		for (double[] item : ret) {
			l -= item[1] - item[0];
		}
		
		//DecimalFormat df = new DecimalFormat(".2d"); 
		
		System.out.println("The total planting length is " + l);
	}
	
	public static void main(String[] args) {
		while (true) {
			Scanner keyboard = new Scanner(System.in);
			double l = keyboard.nextDouble();
			if (l <= 0) {
				System.exit(0);
			}
			ArrayList<double[]> pairs = new ArrayList<double[]>();
			keyboard.nextLine();
			while (true) {
				String in = keyboard.nextLine();
				String[] input = in.split(" ");
				double start = Double.parseDouble(input[0]);
				double end = Double.parseDouble(input[1]);
				if (start > end) {
					break;
				}
				pairs.add(new double[]{start, end});
			}
			doProblem(l, pairs);
		}
	}

	public static double[] merge(double[] p1, double[] p2) {
		double[] ret = new double[2];
		if (p1[0] <= p2[0] && p1[1] >= p2[0])
		{
			ret[0] = p1[0];
			if (p1[1] >= p2[1]) {
				ret[1] = p1[1];
			} else {
				ret[1] = p2[1];
			}
			return ret;
		}
		if (p2[0] <= p1[0] && p2[1] >= p1[0])
		{
			ret[0] = p2[0];
			if (p2[1] >= p1[1]) {
				ret[1] = p2[1];
			} else {
				ret[1] = p1[1];
			}
			return ret;
		}
		return null;
	}
}

