import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			if(n==-1) break;
			findPerfect(n);
		}
		sc.close();
	}
	
public static void findPerfect(int n) {
	int m = 0; int k = 0;
	int[] arr = new int[n];
	for(int i=1; i<=n; i++) {
		if(n%i==0) {arr[m++]=i; k+=i;}
	} k-=n;
	if(k==n) {
		System.out.print(n+" = ");
		for(int i=0; i<m-1; i++) {
			System.out.print(arr[i]);
			if(i!=m-2) System.out.print(" + ");
		}
	}
	else System.out.print("\n"+n+" is NOT perfect.\n");
	}
}
