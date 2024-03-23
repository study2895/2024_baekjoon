import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		int ans = gcd(arr[0], arr[1]);
		for (int i=2; i<n; i++) {
			ans = gcd(ans, arr[i]);
		}
		
//		최대공약수
//		System.out.println(ans);
		
		//최대공약수의 약수 = 모든 값의 공약수
		for (int i=1; i<=ans; i++) {
			if (ans%i==0)
				System.out.println(i);
		}
	}
	static int gcd(int a, int b) {
		while (a%b != 0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return b;
	}
}