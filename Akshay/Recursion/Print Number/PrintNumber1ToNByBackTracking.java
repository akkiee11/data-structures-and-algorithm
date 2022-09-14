import java.util.Scanner;

public class PrintNumber1ToNByBackTracking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printNumber1ToNByBackTracking(n, n);
	}

	private static void printNumber1ToNByBackTracking(final int i, int n ) {
		if(i<1){
			return;
		}
		printNumber1ToNByBackTracking(i-1, n);
		System.out.println(i);
	}
}