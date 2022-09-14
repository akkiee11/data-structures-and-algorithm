import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printName(1,n);
	}

	private static void printName(final int i , final  int n) {
		if(i>n){
			return;
		}
		System.out.println("Akshay");
		printName(i+1,n);
	}
}