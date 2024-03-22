import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 0;
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		if(num%2==0) n=arr[0]*arr[num-1];
		else n=(int) Math.pow(arr[num/2],2);
		System.out.println(n);
		sc.close();
	}

}
