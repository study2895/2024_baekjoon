import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); int aa=a;
		int b = sc.nextInt(); int bb=b;
	
		while(a%b!=0)	{
			int r = a%b;
			a = b;
			b = r;
		}
		int gcd = b;
		int lcm = aa*bb/gcd;
		
		System.out.println(gcd+"\n"+lcm);
		sc.close();
	}

}
