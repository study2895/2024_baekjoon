import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		while (true) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			if (n==0 && m==0)
				break;
			list.add(n);
			list.add(m);
		}
				
		for (int i=0; i<list.size(); i+=2) {
			if (list.get(i+1)%list.get(i)==0)
				System.out.println("factor");
			else if (list.get(i)%list.get(i+1)==0)
				System.out.println("multiple");
			else if (list.get(i)!=0 && list.get(i+1)!=0)
				System.out.println("neither");
		}
		sc.close();
	}
}
