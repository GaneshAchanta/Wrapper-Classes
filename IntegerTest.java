package basic;

public class IntegerTest {

	public static void main(String[] args) {
		// convert string values into the numbers
		String s1 = "3456";
		Integer obj = new Integer(s1);
		// convert numeric into the string
		Integer obj2 = new Integer(235);
		String s2 = obj2.toString();
		//compareTo() method
		System.out.println(obj2.compareTo(obj));
		//equals() merhod
		System.out.println(obj.equals(obj2));
		System.out.println("Binary Format: "+Integer.toBinaryString(125));
		System.out.println("Octal format: "+Integer.toOctalString(125));
		System.out.println("Hexadecimal format: "+Integer.toHexString(125));

	}

}
