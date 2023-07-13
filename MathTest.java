package basic;

public class MathTest {

	public static void main(String[] args) throws InterruptedException {
		int x = -365;
		System.out.println(Math.abs(x));
		float f = 4.9f;
		System.out.println(Math.ceil(f));
		System.out.println(Math.floor(f));
		System.out.println("Min value = "+Math.min(45, 26));
		System.out.println("Mzx value = "+Math.max(45, 26));
		float f2 = 5.6f;
		System.out.println(Math.round(f2));
		float f3 = 3.4f;
		System.out.println(Math.round(f3));
		System.out.println("Random numbers between 0 and 10 :");
		while (true) {
			double d = 10*Math.random();
			int i = (int)d;
			System.out.println(i);
			Thread.sleep(2000);
			if(i==0)
				System.exit(0);
		}

	}

}
