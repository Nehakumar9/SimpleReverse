package simplereverse;

import java.util.Scanner;

public class SimpleReverse {

	public static void simpleReverse(String s) {
        char[] array = s.toCharArray();
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i]+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		simpleReverse(s);
	}

}
