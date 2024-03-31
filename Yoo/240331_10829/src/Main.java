import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();

		ArrayList<Long> arr = new ArrayList<>();
		while (n!=0) {
			arr.add(n%2);
			n/=2;
		}
		for (int i=arr.size()-1; i>=0; i--) {
			System.out.print(arr.get(i));
		}
	}
}
