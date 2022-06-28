
public class MethodsEx {

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public static void mul() {
		int a = 23;
		int b = 24;

		System.out.println(a * b);
	}

	public static void main(String[] args) {
		MethodsEx.mul();
		MethodsEx ex = new MethodsEx();
		ex.add(12, 10);
		System.out.println(ex.sub(23, 9));
		int result = ex.sub(11, 2);
		System.out.println(result);
	}

}
