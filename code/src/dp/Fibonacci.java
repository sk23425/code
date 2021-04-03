package dp;

/**
 * Find nth Fibonacci number
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
 *
 */
public class Fibonacci {
	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {
			System.out.println(i + "\t= " + nthFib(i));
		}
	}

	public static int nthFib(int n) {
		if (n < 2) {
			return n;
		}

		int f0 = 0;
		int f1 = 1;
		int fn = f0 + f1;
		
		for (int i = 2; i < n; i++) {
			f0 = f1;
			f1 = fn;
			fn = f0 + f1;
		}
		return fn;
	}
}