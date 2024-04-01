import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = new int[t];
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		for (int i=0; i<arr.length; i++) {
			int cnt = 0; // 1 위치 파악용 cnt
			while (arr[i]!=0) {
				if (arr[i]%2!=0) {
					ans.add(cnt);
				}
				arr[i]/=2;
				cnt ++;
			}
			for (int j=0; j<ans.size(); j++) {
				System.out.print(ans.get(j) + " ");
			}
			ans.clear();
			System.out.println();
		}
	}
}