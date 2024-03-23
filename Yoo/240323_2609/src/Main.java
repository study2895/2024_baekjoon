import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int min = Math.min(a, b);
				
		int n = 1;
		int m = 1;
		
		for (int i=2; i<=min; i++) {
			while (a%i==0 && b%i==0) {
				n*=i;
				a/=i;
				b/=i;
			}
		}
		
		m=b*a*n;
		System.out.println(n);
		System.out.println(m);
		
		sc.close();
	}
}
