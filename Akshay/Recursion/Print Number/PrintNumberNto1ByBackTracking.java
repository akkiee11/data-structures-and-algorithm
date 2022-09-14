import java.util.Scanner;

public class PrintNumberNto1ByBackTracking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printNumberNto1ByBackTracking(1,n);
	}

	private static void printNumberNto1ByBackTracking(final int i,int n ) {
		if(i>n){
			return;
		}
		printNumberNto1ByBackTracking(i+1,n);
		System.out.println(i);
	}
}