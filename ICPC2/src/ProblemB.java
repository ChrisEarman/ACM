import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Admin on 9/9/2015.
 */
public class ProblemB {
    public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            String input = keyboard.nextLine();
            String[] strs = input.split(" ");
            int n = Integer.parseInt(strs[0]);
            int m = Integer.parseInt(strs[1]);
            if (n == 0 && m == 0) {
                break;
            }
            ArrayList<Integer> components = new ArrayList<Integer>();
            ArrayList<Integer> people = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                input = keyboard.nextLine();
                strs = input.split(" ");
                int j = Integer.parseInt(strs[0]);
                int c = Integer.parseInt(strs[1]);
                for (int a = 0; a < j; a++) {
                    components.add(c);
                }
            }
            for (int i = 0; i < m; i++) {
                input = keyboard.nextLine();
                strs = input.split(" ");
                int k = Integer.parseInt(strs[0]);
                int d = Integer.parseInt(strs[1]);
                for (int a = 0; a < k; a++) {
                    people.add(d);
                }
            }
            boolean found = false;
            Collections.sort(people);
            Collections.sort(components);
            for (Integer p : people) {
                int index = -1;
                for (int i = 0; i < components.size(); i++) {
                    if (components.get(i) > 0) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println(1);
                    found = true;
                    break;
                }
                for (int i = index - 1; i >= 0; i--) {
                    components.remove(i);
                }
                for (int i = 0; i < p && i < components.size(); i++) {
                    int num = components.get(components.size() - 1 - i);
                    components.set(components.size() - 1 - i, num - 1);
                }
            }
            int index = -1;
            for (int i = 0; i < components.size(); i++) {
                if (components.get(i) > 0) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println(1);
                found = true;
            }
            if (!found) {
                System.out.println(0);
            }
        }
    }
}
