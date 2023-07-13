package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a long number :");
		String s1 = br.readLine();
	Long b1 = new Long(s1);
		System.out.println("Enter a long number :");
		String s2 = br.readLine();
		Long b2 = new Long(s2);
		boolean b = b1.equals(b2);
		System.out.println(b);

	}

}
