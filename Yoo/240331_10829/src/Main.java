import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		
		//가변배열 사용 코드
		ArrayList<Long> arr = new ArrayList<>();
		while (n!=0) {
			arr.add(n%2);
			n/=2;
		}
		for (int i=arr.size()-1; i>=0; i--) {
			System.out.print(arr.get(i));
		}
		
		
		/* 고정배열 사용 코드
		long[] arr = new long[100];
		int cnt=0;
		while (n!=0) {
			arr[cnt++]=n%2;
			n/=2;
		}
		for (int i=0; i<cnt; i++) {
			System.out.print(arr[cnt-1-i]);
		}
		*/
	}
}