package Object;

public class FactorialDemo {

	int fact(int n) {
		if (n == 1)
			return 1;
		else
			return n * fact(n - 1);

	}

	public static void main(String[] args) {

		FactorialDemo ob1 = new FactorialDemo();

		int result = ob1.fact(5);

		System.out.println("factorial=" + result);

	}
}
