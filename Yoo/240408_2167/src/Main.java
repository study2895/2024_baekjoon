import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		
		for (int i=0; i<n; i++) {
			for (int k=0; k<m; k++) {
				arr[i][k] = sc.nextInt();
			}
		}
		
		int k = sc.nextInt();
		for (int a=0; a<k; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int sum = 0;
			for (int q=i-1; q<x; q++) {
				for (int p=j-1; p<y; p++) {
					sum += arr[q][p];
				}
			}
			System.out.println(sum);
		}
		
		sc.close();
	}
}
