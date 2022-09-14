import java.util.Scanner;

public class PrintNumber1ToN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printNumber1ToN(1, n);
	}

	private static void printNumber1ToN(final int i , final  int n) {
		if(i>n){
			return;
		}
		System.out.println(i);
		printNumber1ToN(i+1, n);
	}
}