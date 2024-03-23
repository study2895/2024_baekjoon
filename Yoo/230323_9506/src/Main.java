import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		int n = 0;
		
		while (true) {
			n = sc.nextInt();
			if (n == -1) break;
			arr.add(n);
		}
		sc.close();
		
		//약수를 저장하는 ans 배열
		ArrayList<Integer> ans = new ArrayList<>();
		
		for (int i=0; i<arr.size(); i++) {
			ans.clear();
			int sum = 0;
			System.out.print(arr.get(i));
			
			for (int k=1; k<=arr.get(i)/2; k++) {
				if (arr.get(i)%k==0) {
					ans.add(k);
					sum += k;
				}
			}
			
			if (sum==arr.get(i)) {
				System.out.print(" = ");
				for (int j=0; j<ans.size()-1; j++) {
					System.out.print(ans.get(j) + " + ");
				}
				System.out.print(ans.get(ans.size()-1));
			}
			else System.out.print(" is NOT perfect.");
			System.out.println();
		}
	}
}