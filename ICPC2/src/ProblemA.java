import java.util.Scanner;

/**
 * Created by Admin on 9/9/2015.
 */
public class ProblemA {
    public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            String dims = keyboard.nextLine();
            String[] strs = dims.split(" ");
            int n = Integer.parseInt(strs[0]);
            int width = Integer.parseInt(strs[1]);
            int length = Integer.parseInt(strs[2]);
            int height = Integer.parseInt(strs[3]);
            int area = Integer.parseInt(strs[4]);
            int m = Integer.parseInt(strs[5]);
            int windowArea = 0;
            if (n == 0 && width == 0 && length == 0 && height == 0 && area == 0 && m == 0) {
                break;
            }
            for (int i = 0; i < m; i++) {
                String line = keyboard.nextLine();
                strs = line.split(" ");
                windowArea += Integer.parseInt(strs[0]) * Integer.parseInt(strs[1]);
            }
            double res = n * ((2 * width + 2 * length) * height + width * length - windowArea) / (area + .0);
            res = Math.ceil(res);
            System.out.println((int) res);

        }
        keyboard.nextLine();
    }
}
