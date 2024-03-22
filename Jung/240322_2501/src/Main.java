import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		int num = 0;
		
		int[] arr = new int[n];
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) arr[num++]=i;
		}
		if(num<k) System.out.println(0);
		else System.out.println(arr[k-1]);
		
		sc.close();
	}

}
