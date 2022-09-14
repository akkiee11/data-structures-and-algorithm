import java.util.Scanner;

public class PrintNumber1ToNAndNto1ByBackTracking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printNumber1ToNAndNto1ByBackTracking(1, n);
	}

	private static void printNumber1ToNAndNto1ByBackTracking(final int i, int n) {
		if (i > n) {
			return;
		}
		System.out.println("**" + i);
		printNumber1ToNAndNto1ByBackTracking(i + 1, n);
		System.out.println("##" + i);
	}
}