import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<n-1; i++) {
			while(arr[i]%arr[i+1]!=0) {
				int r=arr[i]%arr[i+1];
				arr[i]=arr[i+1];
				arr[i+1]=r;
			}
		}
		int gcd = arr[arr.length-1];
		
		
		for(int i=1; i<=gcd; i++) {
			if(gcd%i==0) System.out.println(i);
		}
		
		sc.close();
	}

}
