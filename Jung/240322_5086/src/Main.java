import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=0;
		int[] arr = new int[100];
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a==0&&b==0) break;
			arr[num]=a;
			arr[num+1]=b;
			num+=2;
		}
		
		for(int i=0; i<num-1; i+=2) {
		if (arr[i+1]%arr[i]==0) System.out.println("factor");
		else if(arr[i]%arr[i+1]==0) System.out.println("multiple");
		else System.out.println("neither");
		}
		
		sc.close();
	}

}
