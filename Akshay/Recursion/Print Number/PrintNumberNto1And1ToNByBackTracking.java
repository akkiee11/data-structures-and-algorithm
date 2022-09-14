import java.util.Scanner;

public class PrintNumberNto1And1ToNByBackTracking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printNumberNto1And1ToNByBackTracking(n, n);
	}

	private static void printNumberNto1And1ToNByBackTracking(final int i, int n) {
		if (i < 1) {
			return;
		}
		System.out.println("**" + i);
		printNumberNto1And1ToNByBackTracking(i - 1, n);
		System.out.println("##" + i);
	}
}