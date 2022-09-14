import java.util.Scanner;

public class PrintNumberNto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printNumberNto1(n);
	}

	private static void printNumberNto1(final int n ) {
		if(n<1){
			return;
		}
		System.out.println(n);
		printNumberNto1(n-1);
	}
}