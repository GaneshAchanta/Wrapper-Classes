package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShortTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a short number");
		String s1 = br.readLine();
		Short b1 = new Short(s1);
		System.out.println();
		String s2 = br.readLine();
		Short b2 = new Short(s2);
		boolean b = b1.equals(b2);
		System.out.println(b);

	}

}
