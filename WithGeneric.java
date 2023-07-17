package basic;

public class WithGeneric<T,V,S> {
	T x;
	V y;
	S z;
	
	public void input(T x,V y,S z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public T output1(){
		return x;
	}
	public V output2(){
		return y;
	}
	public S output3(){
		return z;
	}

	public static void main(String[] args) {
		WithGeneric<Integer,String,Character> i = new WithGeneric<Integer,String,Character> ();
		i.input(123, "Java", 'G');
		System.out.println(i.output1());
		System.out.println(i.output2());
		System.out.println(i.output3());
		

	}

}
